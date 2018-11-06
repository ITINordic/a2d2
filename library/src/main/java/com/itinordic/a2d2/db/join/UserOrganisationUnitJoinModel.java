/**
 * Created by regnatpopulus on 16/04/2018.
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

package com.itinordic.a2d2.db.join;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.annotation.NonNull;

import com.itinordic.a2d2.organisationunit.OrganisationUnitModel;
import com.itinordic.a2d2.user.UserModel;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "user_organisationunit_model_join",
        primaryKeys = { "userId", "organisationUnitId" },
        foreignKeys = {
                @ForeignKey(entity = UserModel.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = CASCADE),
                @ForeignKey(entity = OrganisationUnitModel.class,
                        parentColumns = "id",
                        childColumns = "organisationUnitId")
        }, indices = {@Index("organisationUnitId")})
public class UserOrganisationUnitJoinModel {

    @NonNull
    private String userId;
    @NonNull
    private String organisationUnitId;

    @NonNull
    public String getUserId() {
        return userId;
    }

    public void setUserId(@NonNull String userId) {
        this.userId = userId;
    }

    @NonNull
    public String getOrganisationUnitId() {
        return organisationUnitId;
    }

    public void setOrganisationUnitId(@NonNull String organisationUnitId) {
        this.organisationUnitId = organisationUnitId;
    }

    public UserOrganisationUnitJoinModel(String userId, String organisationUnitId) {
        this.userId = userId;
        this.organisationUnitId = organisationUnitId;
    }

    //Builder
    public static class Builder {
        private String userId;
        private String organisationUnitId;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder userId(@NonNull String userId) {
            this.userId = userId;
            return this;
        }

        @NonNull
        public Builder organisationUnitId(@NonNull String organisationUnitId) {
            this.organisationUnitId = organisationUnitId;
            return this;
        }


        public UserOrganisationUnitJoinModel build() {

            if (userId == null) {
                throw new IllegalStateException("User id must be set");
            }

            if ( organisationUnitId == null) {
                throw new IllegalStateException("Organisation unit id must be set");
            }

            return new UserOrganisationUnitJoinModel(userId,organisationUnitId);
        }
    }
}
