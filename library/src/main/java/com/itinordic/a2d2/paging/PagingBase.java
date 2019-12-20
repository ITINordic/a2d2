package com.itinordic.a2d2.paging;

import java.util.function.Function;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.Observable;
import retrofit2.Response;

public abstract class PagingBase {
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

    static public <ResultType extends PagingBase> Flowable<Response<ResultType>> concatResponseAndGetNext(Flowable<Response<ResultType>> response, Function<String, Flowable<Response<ResultType>>> getNextPage) {
        Handler<Flowable<Response<ResultType>>> handle = new Handler<>(response);
        return Flowable.generate(() -> handle, (flowableHandler, emitter) -> {
            flowableHandler.getResponse().blockingSubscribe(resultTypeResponse -> {
                emitter.onNext(resultTypeResponse);
                final Pager pager = resultTypeResponse.body().getPager();
                if(pager == null) {
                    emitter.onComplete();
                }else {
                    final String nextPage = pager.getNextPage();
                    if (nextPage == null) {
                        emitter.onComplete();
                    } else {
                        flowableHandler.setResponse(getNextPage.apply(nextPage));
                    }
                }
            }, throwable -> {
                emitter.onError(throwable);
            });
        });
    }

    private static class Handler<T> {
        public T getResponse() {
            return response;
        }

        public void setResponse(T response) {
            this.response = response;
        }

        private T response;

        private Handler(T response) {
            this.response = response;
        }
    }
}
