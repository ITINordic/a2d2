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

package com.itinordic.a2d2.trackedentityinstance;

import com.itinordic.a2d2.a2d2Component;
import com.itinordic.a2d2.paging.PagingBase;

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
    public Flowable<Response<TrackedEntityInstanceList>> getTrackedEntityInstances(String fields, String ou) {
        return trackedEntityInstanceService.getUserTrackedEntityInstances(fields,ou);
    }

    @Override
    public Flowable<Response<TrackedEntityInstanceList>> addTrackedEntityInstances(TrackedEntityInstanceList trackedEntityInstanceList) {
        return trackedEntityInstanceService.addTrackedEntityInstances(trackedEntityInstanceList);
    }

    @Override
    public Flowable<Response<TrackedEntityInstanceList>> getTrackedEntityInstanceByFilter(String fields, String[] filter, boolean paging) {
        return PagingBase.concatResponseAndGetNext(trackedEntityInstanceService.getTrackedEntityInstancesByFilter(fields, filter, paging), trackedEntityInstanceService::getNextPage);
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
