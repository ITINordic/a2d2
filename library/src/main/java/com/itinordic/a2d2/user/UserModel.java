/**
 * Created by regnatpopulus on 02/04/2018.
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
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import androidx.annotation.NonNull;

import com.itinordic.a2d2.common.Model;
import com.itinordic.a2d2.common.Utils;

import java.util.Date;

@Entity
public class UserModel implements Model {

    @NonNull
    @PrimaryKey
    private String id;
    private String name;
    private String displayName;
    @TypeConverters({Utils.class})
    private Date created;
    @TypeConverters({Utils.class})
    private Date lastUpdated;
    private String surname;
    private String firstName;
    private String email;
    private String phoneNumber;
    private String username;

    public UserModel(String id, String name, String displayName, Date created, Date lastUpdated,
                     String surname, String firstName, String email,
                     String phoneNumber, String username) {
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.surname = surname;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //Builder
    public static class Builder {
        private String id;
        private String name;
        private String displayName;
        private Date created;
        private Date lastUpdated;
        private String surname;
        private String firstName;
        private String email;
        private String phoneNumber;
        private String username;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder name(@NonNull String name) {
            this.name = name;
            return this;
        }

        @NonNull
        public Builder id(@NonNull String id) {
            this.id = id;
            return this;
        }

        @NonNull
        public Builder displayName(@NonNull String displayName) {
            this.displayName = displayName;
            return this;
        }

        @NonNull
        public Builder created(@NonNull Date created) {
            this.created = created;
            return this;
        }

        @NonNull
        public Builder lastUpdated(@NonNull Date lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        @NonNull
        public Builder firstName(@NonNull String firstName) {
            this.firstName = firstName;
            return this;
        }

        @NonNull
        public Builder surname(@NonNull String surname) {
            this.surname = surname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @NonNull
        public Builder username(@NonNull String username) {
            this.username = username;
            return this;
        }


        public UserModel build() {

            if (name == null) {
                throw new IllegalStateException("Name must be set");
            }

            if (id == null) {
                throw new IllegalStateException("ID must be set");
            }

            if (displayName == null) {
                throw new IllegalStateException("Display name must be set");
            }

            if (created == null) {
                throw new IllegalStateException("Date created can not be null");
            }

            if (lastUpdated == null) {
                throw new IllegalStateException("Date last updated can not be null");
            }

            if (firstName == null) {
                throw new IllegalStateException("First name must be set");
            }

            if (surname == null) {
                throw new IllegalStateException("Surname must be set");
            }

            if (username == null) {
                throw new IllegalStateException("Username must be set");
            }

            return new UserModel(id, name, displayName, created, lastUpdated, surname, firstName, email, phoneNumber, username);
        }
    }
}
