package com.itinordic.a2d2.programstagesection;

import androidx.annotation.NonNull;

import com.itinordic.a2d2.a2d2Component;

import javax.inject.Inject;

import io.reactivex.Flowable;
import retrofit2.Response;

/**
 * Created by regnatpopulus on 2019-06-06.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public class ProgramStageSectionTaskImpl implements ProgramStageSectionTask {

    @Inject
    ProgramStageSectionService programStageSectionService;

    public ProgramStageSectionTaskImpl(a2d2Component component) {
        component.programStageSectionComponent().build().inject(this);
    }

    @Override
    public Flowable<Response<ProgramStageSection>> getProgramStageSection(String programStageSectionId) {
        return programStageSectionService.getProgramStageSection(programStageSectionId);
    }

    @Override
    public Flowable<Response<ProgramStageSectionList>> getProgramStageSectionList(String fields, boolean paging) {
        return programStageSectionService.getProgramStageSectionList(fields,paging);
    }

    //builder that returns a new ProgramStageTask instance when it is passed a URL
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

        public ProgramStageSectionTaskImpl build() {

            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new ProgramStageSectionTaskImpl(component);
        }

    }
}
