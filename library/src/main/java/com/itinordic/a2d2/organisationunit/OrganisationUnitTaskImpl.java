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

import androidx.annotation.NonNull;

import com.itinordic.a2d2.a2d2Component;
import com.itinordic.a2d2.common.BaseIdentifiableObject;
import com.itinordic.a2d2.paging.PagingBase;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.subscribers.DefaultSubscriber;
import retrofit2.Response;
import retrofit2.http.Query;
import retrofit2.http.Url;

import static okhttp3.Credentials.basic;

public class OrganisationUnitTaskImpl implements OrganisationUnitTask {
    @Inject
    OrganisationUnitService organisationUnitService;

    private OrganisationUnitTaskImpl(a2d2Component a2d2component) {

        a2d2component.organisationUnitComponent().build().inject(this);
    }

    public Observable<Response<OrganisationUnit>> getOrganisationUnit(String username, String password, String organisationUnitUid) {

        if (username == null) {
            throw new IllegalStateException("The username must be set first");
        }

        if (password == null) {
            throw new IllegalArgumentException("The password must be set first");
        }

        if (organisationUnitUid == null) {
            throw new IllegalArgumentException("The organisation unit UID must be set first");
        }

        return organisationUnitService.getOrganisationUnit(basic(username, password),organisationUnitUid);
    }

    public Observable<Response<List<BaseIdentifiableObject>>> getOrganisationUnits(String username, String password, List<String> organisationUnitUids) {

        if (username == null) {
            throw new IllegalStateException("The username must be set first");
        }

        if (password == null) {
            throw new IllegalArgumentException("The password must be set first");
        }

        if (organisationUnitUids == null) {
            throw new IllegalArgumentException("The organisation unit UID list must be set first");
        }

        return organisationUnitService.getOrganisationUnits(basic(username, password),organisationUnitUids);
    }

    @Override
    public Flowable<Response<OrganisationUnitList>> getUserOrganisationUnitList(String userId) {
        return organisationUnitService.getUserOrganisationUnitList(userId);
    }

    @Override
    public Flowable<Response<OrganisationUnitList>> getSearchOrganisationUnitList(String fields, boolean paging) {
        Flowable<Response<OrganisationUnitList>> response = organisationUnitService.getSearchOrganisationUnitList(fields, paging);
        return PagingBase.concatResponseAndGetNext(response, organisationUnitService::getNextPage);
    }

    @Override
    public Flowable<Response<OrganisationUnit>> getOrganisationUnit(String organisationUnitUid) {
        return organisationUnitService.getOrganisationUnit(organisationUnitUid);
    }

    @Override
    public Flowable<Response<OrganisationUnitList>> getSearchOrganisationUnitList(@Query("filter" ) String filter, @Query("fields" ) String fields, @Query("paging" ) boolean paging) {
        Flowable<Response<OrganisationUnitList>> response = organisationUnitService.getSearchOrganisationUnitList(filter, fields, paging);
        return PagingBase.concatResponseAndGetNext(response, organisationUnitService::getNextPage);
    }

    //builder that returns a new UserTask instance when it is passed a URL
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

        public OrganisationUnitTaskImpl build() {

            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new OrganisationUnitTaskImpl(component);
        }


    }
}
