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

package com.itinordic.a2d2.programruleaction;

import io.reactivex.rxjava3.core.Flowable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by regnatpopulus on 2019-05-27.
 * dev@itinordic.com
 */
public interface ProgramRuleActionService {

    @GET("api/programRuleActions")
    Flowable<Response<ProgramRuleActions>> getProgramRuleActions(@Query("fields" ) String fields, @Query("paging" ) boolean paging);

    @GET("api/programRuleActions")
    Flowable<Response<ProgramRuleActions>> getProgramRuleActions(@Query("fields" ) String fields, @Query("filter") String[] filter, @Query("paging" ) boolean paging);

    @GET("api/programRuleActions/{id}")
    Flowable<Response<ProgramRuleAction>> getProgramRuleAction(@Path("id") String programUid);

}
