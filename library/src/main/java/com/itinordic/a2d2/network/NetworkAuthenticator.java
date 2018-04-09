/**
 * Created by regnatpopulus on 08/04/2018.
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

package com.itinordic.a2d2.network;

import android.support.annotation.NonNull;

import com.itinordic.a2d2.token.AccessTokenTask;

import java.io.IOException;

import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public class NetworkAuthenticator implements Authenticator {

    private Response newAccessToken;
    private AccessTokenTask accessTokenTask;

    private NetworkAuthenticator(AccessTokenTask accessTokenTask) {
        this.accessTokenTask=accessTokenTask;
    }

    @Override
    public Request authenticate(Route route, Response response) throws IOException {

        //Check if the same call was made before and terminate if so

        /*
        if (response.request().header("Authorization") != null) {
            return null; // Give up, we've already attempted to authenticate.
        }
        */

        // Refresh your access_token using a synchronous api request
        newAccessToken = accessTokenTask.refreshAccessToken();



        // Add new header to rejected request and retry it
        return response.request().newBuilder()
                .header("Authorization", "Bearer " + newAccessToken)
                .build();
    }

    //builder that returns a new UserTask instance when it is passed a URL
    public static class Builder {
        private AccessTokenTask task;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder accessTokenTask(@NonNull AccessTokenTask task) {
            this.task = task;
            return this;
        }

        public NetworkAuthenticator build() {

            if (task == null) {
                throw new IllegalStateException("Access Token task is null");
            }

            return new NetworkAuthenticator(task);
        }


    }




}
