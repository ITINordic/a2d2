package com.itinordic.a2d2.attribute;

import androidx.annotation.NonNull;

import com.itinordic.a2d2.a2d2Component;

import javax.inject.Inject;

import io.reactivex.Flowable;
import retrofit2.Response;

/**
 * Created by regnatpopulus on 2019-08-01.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public class AttributeTaskImpl implements  AttributeTask {

    @Inject
    AttributeService attributeService;

    public AttributeTaskImpl(a2d2Component component) {
        component.attributeComponent().build().inject(this);
    }

    @Override
    public Flowable<Response<Attributes>> getAttributes(String fields, boolean paging) {
        return attributeService.getAttributes(fields,paging);
    }

    @Override
    public Flowable<Response<Attribute>> getAttribute(String attributeUid) {
        return attributeService.getAttribute(attributeUid);
    }


    //builder that returns a new DataElementTask instance when it is passed a URL
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

        public AttributeTask build() {

            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new AttributeTaskImpl(component);
        }
    }
}
