package com.itinordic.a2d2.trackedentityinstance;

import com.itinordic.a2d2.a2d2Component;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import dagger.Subcomponent;
import io.reactivex.Flowable;
import retrofit2.Response;

public class TrackedEntityInstanceTaskImpl implements TrackedEntityInstanceTask{


    @Inject
    TrackedEntityInstanceService trackedEntityInstanceService;

    private a2d2Component a2d2component;


    public TrackedEntityInstanceTaskImpl(a2d2Component a2d2component) {
        a2d2component.trackedEntityInstanceComponent().build().inject(this);
    }


    @Override
    public Flowable<Response<TrackedEntityInstanceList>> getTrackedEntityInstances(String fields, String ouMode) {
        return trackedEntityInstanceService.getUserTrackedEntityInstances(fields,ouMode);
    }

    public static class Builder{


        private a2d2Component component;

        public Builder(){
            //empty constructor
        }

        @NonNull
        public Builder a2d2Component(@NonNull a2d2Component component) {
            this.component = component;
            return this;
        }

        public  TrackedEntityInstanceTaskImpl build(){
            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new  TrackedEntityInstanceTaskImpl(component);

        }
    }



}
