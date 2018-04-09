/**
 * Created by regnatpopulus on 31/03/2018.
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

package com.itinordic.a2d2.oauthclient;

import java.util.List;

import javax.inject.Inject;

public class OAuthClientTask {

    //Dagger
    @Inject OAuthClientService oAuthClientService;

    private  OAuthClient oAuthClient;
    private  String credentials;

    public OAuthClientTask(OAuthClient oAuthClient) {
        this.oAuthClient = oAuthClient;
    }

    void saveOAuthClient(){
        oAuthClientService.addOAuthClient(credentials, oAuthClient);
    }


    public static class Builder {

        private  String name;
        private  String cid;
        private List<GrantType> grantTypes;

        public Builder(){
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }

        public Builder setGrantTypes(List<GrantType> grantTypes) {
            this.grantTypes = grantTypes;
            return this;
        }


        public OAuthClientTask build(){

            if (this.name == null) {
                throw new IllegalStateException("The name of the OAuth2 client must be set first");
            }

            if (this.cid == null) {
                throw new IllegalArgumentException("The Client ID of the OAuth2 client must be set first");
            }

            if (this.grantTypes == null || this.grantTypes.isEmpty() ) {
                throw new IllegalArgumentException("Grant types for OAuth2 client must be set first");
            }


            OAuthClient oAuthClient = new OAuthClientBuilder()
                    .setCid(this.cid)
                    .setName(this.name)
                    .setGrantTypes(this.grantTypes)
                    .build();

            return new OAuthClientTask(oAuthClient);
        }

    }

}
