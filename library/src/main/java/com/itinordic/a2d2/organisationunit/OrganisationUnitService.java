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
/**
 * Created by regnatpopulus on 16/04/2018.
 * dev@itinordic.com
 */

package com.itinordic.a2d2.organisationunit;

import com.itinordic.a2d2.common.BaseIdentifiableObject;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface OrganisationUnitService {

    @GET("api/organisationUnits/{id}")
    Observable<Response<OrganisationUnit>> getOrganisationUnit(@Header("Authorization") String authorization,
                                                               @Path("id") String organisationUnitUid);

    @GET("api/organisationUnits")
    Observable<Response<List<BaseIdentifiableObject>>> getOrganisationUnits(@Header("Authorization") String authorization,
                                                                            @Query("id") List<String> organisationUnitUids);

    @GET("api/users/{userId}/organisationUnits")
    Flowable<Response<OrganisationUnitList>> getUserOrganisationUnitList(@Path("userId") String userId);

    @GET("api/organisationUnits")
    Flowable<Response<OrganisationUnitList>> getSearchOrganisationUnitList(@Query("fields" ) String fields, @Query("paging" ) boolean paging);

    @GET("api/organisationUnits")
    Flowable<Response<OrganisationUnitList>> getCaptureOrganisationUnitList(@Query("fields" ) String fields, @Query("paging" ) boolean paging, @Query("userOnly" ) boolean userOnly);

    @GET("api/organisationUnits")
    Flowable<Response<OrganisationUnitList>> getSearchOrganisationUnitList(@Query("fields" ) String fields, @Query("filter" ) String[] filter, @Query("paging" ) boolean paging);

    @GET
    Flowable<Response<OrganisationUnitList>> getNextPage(@Url String url);

    @GET("api/organisationUnits/{id}")
    Flowable<Response<OrganisationUnit>> getOrganisationUnit(@Path("id") String organisationUnitUid);
}
