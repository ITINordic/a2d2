/**
 * Created by regnatpopulus on 30/03/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.itinordic.a2d2;

import androidx.annotation.NonNull;

import com.itinordic.a2d2.oauthclient.OAuthClientTask;
import com.itinordic.a2d2.oauthclient.OAuthClientTaskImpl;
import com.itinordic.a2d2.organisationunit.OrganisationUnitTask;
import com.itinordic.a2d2.organisationunit.OrganisationUnitTaskImpl;
import com.itinordic.a2d2.program.ProgramTask;
import com.itinordic.a2d2.program.ProgramTaskImpl;
import com.itinordic.a2d2.token.AccessTokenTask;
import com.itinordic.a2d2.token.AccessTokenTaskImpl;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeTask;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeTaskImpl;
import com.itinordic.a2d2.user.UserTask;
import com.itinordic.a2d2.user.UserTaskImpl;
import com.itinordic.a2d2.usergroup.UserGroupTask;
import com.itinordic.a2d2.usergroup.UserGroupTaskImpl;
import com.itinordic.a2d2.userrole.UserRoleTask;
import com.itinordic.a2d2.userrole.UserRoleTaskImpl;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

public final class a2d2 implements a2d2API {

    private final OkHttpClient okHttpClient;

    private final HttpUrl baseUrl;

    private a2d2Component a2d2component;

    //a2d2 class constructor. It is instantiated by the builder method below
    private a2d2(HttpUrl baseUrl, OkHttpClient okHttpClient) {

        this.baseUrl = baseUrl;
        this.okHttpClient = okHttpClient;
        a2d2component = Daggera2d2Component.builder()
                .a2d2Module(new a2d2Module(baseUrl,okHttpClient ))
                .build();
    }

    //builder that returns a new a2d2 instance when it is passed a URL
    public static class Builder
    {
        private HttpUrl httpUrl;
        private OkHttpClient okHttpClient;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder serverUrl(@NonNull HttpUrl url){
            this.httpUrl = url;
            return this;
        }

        @NonNull
        public Builder okHttpClient(@NonNull OkHttpClient okHttpClient){
            this.okHttpClient = okHttpClient;
            return this;
        }


        public a2d2 build(){

            if (httpUrl == null) {
                throw new IllegalStateException("Server Url must be set first");
            }

            if (okHttpClient == null) {
                throw new IllegalStateException("Okhttp client must be set first");
            }

            return new a2d2(httpUrl, okHttpClient);
        }

    }

    public UserTask userTaskBuilder(){

        return new UserTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public OAuthClientTask oAuthClientTaskBuilder(){

        return new OAuthClientTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public AccessTokenTask accessTokenTaskBuilder(){
        return new AccessTokenTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public OrganisationUnitTask organisationUnitTaskBuilder(){
        return new OrganisationUnitTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public UserRoleTask userRoleTaskBuilder(){
        return new UserRoleTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public UserGroupTask userGroupTaskBuilder(){
        return new UserGroupTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public ProgramTask programTaskBuilder(){
        return new ProgramTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public TrackedEntityTypeTask trackedEntityTypeTaskBuilder(){
        return new TrackedEntityTypeTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

}
