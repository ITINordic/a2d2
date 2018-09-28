package com.itinordic.a2d2.program;

import com.itinordic.a2d2.a2d2Component;

import java.util.List;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import io.reactivex.Flowable;
import retrofit2.Response;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class ProgramTaskImpl implements ProgramTask {

    @Inject
    ProgramService programService;

    private a2d2Component a2d2component;

    public ProgramTaskImpl(a2d2Component a2d2component) {
        a2d2component.programComponent().build().inject(this);
    }

    @Override
    public Flowable<Response<UserPrograms>> getUserPrograms(String fields) {
        return programService.getUserPrograms(fields);
    }


    //builder that returns a new ProgramTask instance when it is passed a URL
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

        public ProgramTaskImpl build() {

            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new ProgramTaskImpl(component);
        }

    }
}
