package com.itinordic.a2d2.paging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.function.Function;

import io.reactivex.Flowable;
import io.reactivex.Single;
import retrofit2.Response;

public abstract class PagingBase {
    public static Log log = LogFactory.getLog(PagingBase.class.getName());
    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }

    public PagingBase(Pager pager) {
        this.pager = pager;
    }

    private Pager pager;

    static public <ResultType extends PagingBase> Flowable<Response<ResultType>> concatResponseAndGetNext(Flowable<Response<ResultType>> first, Function<String, Flowable<Response<ResultType>>> getNextPage) {
        return Flowable.<Single<Response<ResultType>>, Response<ResultType>>generate(
                () -> {
                    log.debug("Start loading first page");
                    final Response<ResultType> response = first.blockingFirst();
                    final Pager pager = response.body().getPager();
                    log.debug(String.format("Finish loading first no %d", pager == null ? 1 : pager.getPage()));
                    return response;
                },
                (item, emitter) -> {
                    try {
                        emitter.onNext(Single.just(item));
                        final Pager pager = item.body().getPager();
                        if(pager != null) {
                            final String nextPage = pager.getNextPage();
                            if (nextPage != null) {
                                log.debug("Start loading next page");
                                final Response<ResultType> next = getNextPage.apply(nextPage).blockingFirst();
                                log.debug(String.format("Finish loading next page no %d", next.body().getPager().getPage()));
                                return next;
                            }
                        }
                        emitter.onComplete();
                    } catch (Exception e) {
                        emitter.onError(e);
                    }
                    return null;
                }).concatMapSingle(b -> b, 4);

    }



//    static public <ResultType extends PagingBase> Flowable<Response<ResultType>> concatResponseAndGetNext(Flowable<Response<ResultType>> first, Function<String, Flowable<Response<ResultType>>> getNextPage) {
//        return Flowable.<Maybe<Response<ResultType>>, Box<Flowable<Response<ResultType>>>>generate(() -> new Box<>(first), (box, emitter) -> {
//            try {
//                final Maybe<Response<ResultType>> value = box.get().firstElement();
//                if(value == null) {
//                emitter.onNext(value);
//                value.
//            } catch (Exception e) {
//                emitter.onError(e);
//            }
//        }).concatMapMaybe(o -> o, 2);
//    }

    private static class Box<T> {
        synchronized public T get() {
            previous = item;
            item = null;
            return previous;
        }

        synchronized public void set(T item) {
            this.item = item;
        }

        private T item;
        private T previous;

        private Box(T item) {
            this.item = item;
        }

        synchronized public T getPrevious() {
            return previous;
        }

        synchronized public void setPrevious(T previous) {
            this.previous = previous;
        }
    }
}