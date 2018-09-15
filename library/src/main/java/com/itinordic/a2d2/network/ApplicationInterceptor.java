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

import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Application;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


public class ApplicationInterceptor implements Interceptor {

    String token;
    LoggedAccountProvider loggedAccountProvider;
    AccountManager mAccountManager;

    public ApplicationInterceptor(LoggedAccountProvider loggedAccountProvider, Application app) {
        this.loggedAccountProvider = loggedAccountProvider;
        mAccountManager = AccountManager.get(app);    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();

        // Nothing to add to intercepted request if:
        // a) There is already a header with updated Authorization value

        if (originalRequest.header("Authorization") !=  null) {
            return chain.proceed(originalRequest);
        }

        //Get Access Token from Account Manager
        try {
            token = mAccountManager
                    .getAuthToken(loggedAccountProvider.getAccount(),
                    loggedAccountProvider.getAuthTokenType(), false, null,null).getResult()
                    .getString(AccountManager.KEY_AUTHTOKEN);
        } catch (AuthenticatorException e) {
            e.printStackTrace();
            return chain.proceed(originalRequest);
        } catch (OperationCanceledException e) {
            e.printStackTrace();
            return chain.proceed(originalRequest);
        }

        // Add authorization header with updated authorization value to intercepted request
        Request tokenAuthorisedRequest = originalRequest.newBuilder()
                .header("Authorization", "Bearer " + token)
                .build();
        return chain.proceed(tokenAuthorisedRequest);
    }

    private void setAuthHeader(Request.Builder builder, String token) {
        if (token != null) //Add Auth token to each request if authorized
            builder.header("Authorization", String.format("Bearer %s", token));
    }



}
