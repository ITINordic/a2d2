/**
 * Created by regnatpopulus on 29/03/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source name must retain the above copyright notice, this
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

package com.itinordic.a2d2.oauthclient;

import androidx.annotation.NonNull;

import java.util.List;

public class OAuthClient {

    public  String id;
    public final String name;
    public final String cid;
    public final String secret;
    public final List<String> grantTypes;
    public final List<String> redirectUris;

    public OAuthClient(String name, String cid, String secret, List<String> grantTypes, List<String> redirectUris) {

        this.name = name;
        this.cid = cid;
        this.secret = secret;
        this.grantTypes = grantTypes;
        this.redirectUris = redirectUris;
    }

    public static class Builder {

        private  String name;
        private  String cid;
        private  List<String> grantTypes;
        private  List<String> redirectUris;

        public Builder() {
        }

        @NonNull
        public Builder name(@NonNull String name) {
            this.name = name;
            return this;
        }

        @NonNull
        public Builder cid(@NonNull String cid) {
            this.cid = cid;
            return this;
        }

        @NonNull
        public Builder grantTypes(@NonNull List<String> grantTypes) {
            this.grantTypes = grantTypes;
            return this;
        }


        public Builder redirectUris(List<String> redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }

        public OAuthClient build() {

            if ( name == null) {
                throw new IllegalStateException("OAuth client name must be set");
            }


            if ( cid == null) {
                throw new IllegalStateException("OAuth client cid must be set");
            }

            if ( grantTypes == null) {
                throw new IllegalStateException("OAuth client grant types must be set");
            }

            return new OAuthClient(name, cid,null, grantTypes,redirectUris);
        }


    }
}

