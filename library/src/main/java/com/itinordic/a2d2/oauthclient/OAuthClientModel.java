/**
 * Created by regnatpopulus on 29/03/2018.
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

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.itinordic.a2d2.organisationunit.OrganisationUnitModel;
import com.itinordic.a2d2.user.UserModel;

import java.util.List;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = UserModel.class,
        parentColumns = "id",
        childColumns = "userid",
        onDelete = CASCADE), indices = {@Index("userid")})
public class OAuthClientModel {

    @PrimaryKey
    @NonNull
    private String id;

    private String name;
    private String cid;
    private String secret;
    private String userid;

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public OAuthClientModel(@NonNull String id, String name, String cid, String secret, String userid) {
        this.id = id;
        this.name = name;
        this.cid = cid;
        this.secret = secret;
        this.userid = userid;
    }

    //Builder
    public static class Builder {

        private String id;
        private String name;
        private String cid;
        private String secret;
        private String userid;



        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder id(@NonNull String id) {
            this.id = id;
            return this;
        }

        @NonNull
        public Builder name(@NonNull String name) {
            this.name = name;
            return this;
        }

        @NonNull
        public Builder secret(@NonNull String secret) {
            this.secret = secret;
            return this;
        }

        @NonNull
        public Builder cid(@NonNull String cid) {
            this.cid = cid;
            return this;
        }

        @NonNull
        public Builder userid(@NonNull String userid) {
            this.userid = userid;
            return this;
        }


        public OAuthClientModel build() {

            if (id == null) {
                throw new IllegalStateException("OAuth client UID must be set");
            }

            if ( name == null) {
                throw new IllegalStateException("OAuth client name must be set");
            }

            if ( secret == null) {
                throw new IllegalStateException("OAuth client secret must be set");
            }

            if ( cid == null) {
                throw new IllegalStateException("OAuth client cid must be set");
            }

            if ( userid == null) {
                throw new IllegalStateException("OAuth client user id must be set");
            }

            return new OAuthClientModel( id, name, cid, secret, userid);
        }
    }
}

