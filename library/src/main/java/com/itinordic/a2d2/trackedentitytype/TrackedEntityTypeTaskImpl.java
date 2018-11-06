package com.itinordic.a2d2.trackedentitytype;

import com.itinordic.a2d2.a2d2Component;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import io.reactivex.Flowable;
import retrofit2.Response;

/**
 * Created by regnatpopulus on 30/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class TrackedEntityTypeTaskImpl implements TrackedEntityTypeTask {

    @Inject
    TrackedEntityTypeService trackedEntityTypeService;

    private a2d2Component a2d2component;

    public TrackedEntityTypeTaskImpl(a2d2Component a2d2component) {
        a2d2component.trackedEntityTypeComponent().build().inject(this);
    }

    @Override
    public Flowable<Response<TrackedEntityType>> getTrackedEntityType(String trackedEntityTypeId) {
        return trackedEntityTypeService.getTrackedEntityTypeById(trackedEntityTypeId);
    }

    @Override
    public Flowable<Response<TrackedEntityTypeList>> getUserTrackedEntityTypes(String fields) {
        return trackedEntityTypeService.getUserTrackedEntityTypes(fields);
    }

    //builder that returns a new Task instance when it is passed a URL
    public static class Builder {
        private a2d2Component component;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder a2d2Component(@NonNull a2d2Component component) {
            this.component = component;
            return this;
        }

        public TrackedEntityTypeTaskImpl build() {

            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new TrackedEntityTypeTaskImpl(component);
        }

    }

}
