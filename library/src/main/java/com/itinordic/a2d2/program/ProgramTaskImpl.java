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

package com.itinordic.a2d2.program;

import com.itinordic.a2d2.a2d2Component;
import com.itinordic.a2d2.paging.PagingBase;

import java.util.List;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import io.reactivex.Flowable;
import retrofit2.Response;
import retrofit2.http.Url;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 */
public class ProgramTaskImpl implements ProgramTask {

    @Inject
    ProgramService programService;


    public ProgramTaskImpl(a2d2Component a2d2component) {
        a2d2component.programComponent().build().inject(this);
    }

    @Override
    public Flowable<Response<UserPrograms>> getUserPrograms(String fields, boolean paging) {
        return PagingBase.concatResponseAndGetNext(programService.getUserPrograms(fields,paging), programService::getNextPage);
    }


    @Override
    public Flowable<Response<Program>> getProgram(String programUid) {
        return programService.getProgram(programUid);
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
