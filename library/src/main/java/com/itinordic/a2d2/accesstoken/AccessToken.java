package com.itinordic.a2d2.accesstoken;

import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by regnatpopulus on 28/03/2018.
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

@AutoValue
public abstract class AccessToken {

    private static final String ACCESS_TOKEN = "access_token";
    private static final String TOKEN_TYPE = "token_type";
    private static final String REFRESH_TOKEN = "refresh_token";
    private static final String EXPIRES_IN = "expires_in";
    private static final String SCOPE = "scope";

    @Nullable
    @JsonProperty(ACCESS_TOKEN)
    public abstract String accessToken();

    @Nullable
    @JsonProperty(TOKEN_TYPE)
    public abstract String tokenType();

    @Nullable
    @JsonProperty(REFRESH_TOKEN)
    public abstract String refreshToken();

    @Nullable
    @JsonProperty(EXPIRES_IN)
    public abstract Double expiresIn();

    @Nullable
    @JsonProperty(SCOPE)
    public abstract String scope();

    @JsonCreator
    public static AccessToken create(
            @JsonProperty(ACCESS_TOKEN) String accessToken,
            @JsonProperty(TOKEN_TYPE) String tokenType,
            @JsonProperty(REFRESH_TOKEN) String refreshToken,
            @JsonProperty(EXPIRES_IN) Double expiresIn,
            @JsonProperty(SCOPE) String scope
            ) {
        return new AutoValue_AccessToken(
                accessToken,
                tokenType,
                refreshToken,
                expiresIn,
                scope
        );
    }

}
