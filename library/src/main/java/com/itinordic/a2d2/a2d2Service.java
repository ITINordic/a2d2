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

import android.support.annotation.NonNull;

import javax.inject.Inject;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class a2d2Service {

@Inject  Retrofit retrofit;
@Inject  OkHttpClient okHttpClient;

    private final HttpUrl serverUrl;

    //a2d2Service class constructor. It is instantiated by the builder method below
    private a2d2Service(HttpUrl serverUrl) {

        this.serverUrl = serverUrl;
        Daggera2d2Component.builder()
                .a2d2Module(new a2d2Module(serverUrl))
                .build();

    }


    //builder that returns a new a2d2Service instance when it is passed a URL
    public static class Builder
    {
        private HttpUrl serverUrl;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder serverUrl(@NonNull HttpUrl serverURL){
            this.serverUrl = serverUrl;
            return this;
        }


        public a2d2Service build(){

            if (serverUrl == null) {
                throw new IllegalStateException("Server Url must be set first");
            }

            return new a2d2Service(serverUrl);
        }

    }


}
