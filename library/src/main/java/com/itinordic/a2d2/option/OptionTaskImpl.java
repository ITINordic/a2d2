package com.itinordic.a2d2.option;

import com.itinordic.a2d2.a2d2Component;

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
public class OptionTaskImpl implements OptionTask{

    @Inject OptionService optionService;

    private a2d2Component a2d2component;

    public OptionTaskImpl(a2d2Component a2d2component) {
        a2d2component.optionComponent().build().inject(this);
    }

    @Override
    public Flowable<Response<Option>> getOptionById(String optionSetId) {
        return optionService.getOptionById(optionSetId);
    }

    @Override
    public Flowable<Response<OptionList>> getOptions(String fields, boolean paging) {
        return optionService.getOptions(fields,paging);
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

        public OptionTaskImpl build() {

            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new OptionTaskImpl(component);
        }

    }
}
