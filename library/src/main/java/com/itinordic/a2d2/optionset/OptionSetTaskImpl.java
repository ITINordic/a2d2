package com.itinordic.a2d2.optionset;

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
public class OptionSetTaskImpl implements OptionSetTask {

    @Inject OptionSetService optionSetService;

    private a2d2Component a2d2component;

    public OptionSetTaskImpl(a2d2Component a2d2component) {
        a2d2component.optionSetComponent().build().inject(this);
    }

    @Override
    public Flowable<Response<OptionSet>> getOptionSetById(String optionSetId) {
        return optionSetService.getOptionSetById(optionSetId);
    }

    @Override
    public Flowable<Response<OptionSetList>> getOptionSets(String fields) {
        return optionSetService.getOptionSets(fields);
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

        public OptionSetTaskImpl build() {

            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new OptionSetTaskImpl(component);
        }

    }
}
