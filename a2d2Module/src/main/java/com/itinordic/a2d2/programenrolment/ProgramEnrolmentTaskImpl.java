/*
 *BSD 2-Clause License
 *
 *Copyright (c) 2019, itinordic All rights reserved.
 *
 *Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following
 *conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following
 *    disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
 *    disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR
 *IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 *CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 *DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER
 *IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
 *THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 **/

package com.itinordic.a2d2.programenrolment;

import androidx.annotation.NonNull;

import com.itinordic.a2d2.a2d2Component;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceList;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceService;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceTask;

import javax.inject.Inject;

import io.reactivex.Flowable;
import retrofit2.Response;

public class ProgramEnrolmentTaskImpl implements ProgramEnrolmentTask {


    @Inject
    ProgramEnrolmentService programEnrolmentService;

    private a2d2Component a2d2component;


    public ProgramEnrolmentTaskImpl(a2d2Component a2d2component) {
        a2d2component.programEnrolmentComponent().build().inject(this);
    }

    @Override
    public Flowable<Response<ProgramEnrolmentList>> addEnrolments(ProgramEnrolmentList programEnrolmentList) {
        return programEnrolmentService.addEnrolments(programEnrolmentList);
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

        public ProgramEnrolmentTaskImpl build(){
            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new ProgramEnrolmentTaskImpl(component);

        }
    }
}
