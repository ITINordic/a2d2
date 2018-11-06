package com.itinordic.a2d2.trackedentityattribute;

import com.itinordic.a2d2.a2d2Component;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeService;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import io.reactivex.Flowable;
import retrofit2.Response;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class TrackedEntityAttributeTaskImpl implements TrackedEntityAttributeTask {


    @Inject TrackedEntityAttributeService trackedEntityAttributeService;

    private a2d2Component a2d2component;

    public TrackedEntityAttributeTaskImpl(a2d2Component a2d2component) {
        a2d2component.trackedEntityAttributeComponent().build().inject(this);
    }

    @Override
    public Flowable<Response<TrackedEntityAttribute>> getTrackedEntityAttributeById(String trackedEntityAttributeId) {
        return trackedEntityAttributeService.getTrackedEntityAttributesById(trackedEntityAttributeId);
    }

    @Override
    public Flowable<Response<TrackedEntityAttributeList>> getTrackedEntityAttributes(String fields) {
        return trackedEntityAttributeService.getTrackedEntityAttributes(fields);
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

        public TrackedEntityAttributeTaskImpl build() {

            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new TrackedEntityAttributeTaskImpl(component);
        }

    }
}
