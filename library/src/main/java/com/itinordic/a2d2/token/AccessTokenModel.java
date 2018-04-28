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

package com.itinordic.a2d2.token;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class AccessTokenModel {

    private String expires_in;
    private String scope;

    @PrimaryKey
    @NonNull
    private String access_token;

    private String refresh_token;
    private String token_type;

    public AccessTokenModel(String expires_in, String scope, String access_token, String refresh_token, String token_type) {
        this.expires_in = expires_in;
        this.scope = scope;
        this.access_token = access_token;
        this.refresh_token = refresh_token;
        this.token_type = token_type;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public static class Builder {
        private String expires_in;
        private String scope;
        private String access_token;
        private String refresh_token;
        private String token_type;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder expires_in(@NonNull String expires_in) {
            this.expires_in = expires_in;
            return this;
        }

        @NonNull
        public Builder scope(@NonNull String scope) {
            this.scope = scope;
            return this;
        }

        @NonNull
        public Builder access_token(@NonNull String access_token) {
            this.access_token = access_token;
            return this;
        }

        @NonNull
        public Builder refresh_token(@NonNull String refresh_token) {
            this.refresh_token = refresh_token;
            return this;
        }

        @NonNull
        public Builder token_type(@NonNull String token_type) {
            this.token_type = token_type;
            return this;
        }

        public AccessTokenModel build() {

            if (expires_in == null) {
                throw new IllegalStateException("Token expires in must be set");
            }

            if (scope == null) {
                throw new IllegalStateException("Scope must be set");
            }

            if (access_token == null) {
                throw new IllegalStateException("Access token name must be set");
            }

            if (refresh_token == null) {
                throw new IllegalStateException("Refresh token can not be null");
            }

            if (token_type == null) {
                throw new IllegalStateException("Token type can not be null");
            }

            return new AccessTokenModel(expires_in, scope, access_token, refresh_token, token_type );
        }
    }
}
