/**
 * Created by regnatpopulus on 16/04/2018.
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

package com.itinordic.a2d2.user;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

import static androidx.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = UserModel.class,
        parentColumns = "id",
        childColumns = "userid",
        onDelete = CASCADE), indices = {@Index("userid")})
public class UserCredentialsModel {

    @PrimaryKey(autoGenerate = true)
    private int usercredentialsid;

    private String username;
    private String pin;
    private String userid;
    private Boolean isLogged;

    public UserCredentialsModel(int usercredentialsid, String username, String pin,
                                String userid, Boolean isLogged) {
        this.usercredentialsid = usercredentialsid;
        this.username = username;
        this.pin = pin;
        this.userid = userid;
        this.isLogged = isLogged;
    }

    public int getUsercredentialsid() {
        return usercredentialsid;
    }

    public void setUsercredentialsid(int usercredentialsid) {
        this.usercredentialsid = usercredentialsid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Boolean getLogged() {
        return isLogged;
    }

    public void setLogged(Boolean logged) {
        isLogged = logged;
    }

    //Builder
    public static class Builder {
        private String username;
        private String pin;
        private String userid;
        private Boolean isLogged;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder username(@NonNull String username) {
            this.username = username;
            return this;
        }

        @NonNull
        public Builder pin(@NonNull String pin) {
            this.pin = pin;
            return this;
        }

        @NonNull
        public Builder userid(@NonNull String userid) {
            this.userid = userid;
            return this;
        }

        @NonNull
        public Builder isLogged(@NonNull Boolean isLogged) {
            this.isLogged = isLogged;
            return this;
        }

        public UserCredentialsModel build() {

            if (username == null) {
                throw new IllegalStateException("Name must be set");
            }

            if ( pin == null) {
                throw new IllegalStateException("Pin must be set");
            }

            if ( userid == null) {
                throw new IllegalStateException("UserID must not be empty");
            }
            if ( isLogged == null) {
                throw new IllegalStateException("Logged in status must be set");
            }

            return new UserCredentialsModel(0,username,pin,userid, isLogged);
        }
    }
}
