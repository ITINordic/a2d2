package com.itinordic.a2d2.organisationunitaccess;

import com.itinordic.a2d2.metadataaccess.MetadataAccessModel;
import com.itinordic.a2d2.organisationunit.OrganisationUnitModel;
import com.itinordic.a2d2.user.UserModel;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

import static androidx.room.ForeignKey.CASCADE;

/**
 * Created by regnatpopulus on 06/04/2019.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
@Entity(
        primaryKeys = { "userId", "organisationUnitId", "metadataAccessId" },
        foreignKeys = {
                @ForeignKey(entity = UserModel.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = CASCADE),
                @ForeignKey(entity = OrganisationUnitModel.class,
                        parentColumns = "id",
                        childColumns = "organisationUnitId"),
                @ForeignKey(entity = MetadataAccessModel.class,
                        parentColumns = "id",
                        childColumns = "metadataAccessId")
        }, indices = {@Index("userId"), @Index("organisationUnitId"), @Index("metadataAccessId")})
public class OrganisationUnitAccessModel {

    @NonNull
    private String userId;
    @NonNull
    private String organisationUnitId;
    @NonNull
    private int metadataAccessId;

    public OrganisationUnitAccessModel(@NonNull String userId, @NonNull String organisationUnitId, int metadataAccessId) {
        this.userId = userId;
        this.organisationUnitId = organisationUnitId;
        this.metadataAccessId = metadataAccessId;
    }

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

    public int getMetadataAccessId() {
        return metadataAccessId;
    }

    public void setMetadataAccessId(int metadataAccessId) {
        this.metadataAccessId = metadataAccessId;
    }

    public static class Builder {

        private String userId;
        private String organisationUnitId;
        private int metadataAccessId;


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

        @NonNull
        public Builder metadataAccessId(@NonNull int metadataAccessId) {
            this.metadataAccessId = metadataAccessId;
            return this;
        }

        public OrganisationUnitAccessModel build() {

            if (organisationUnitId == null) {
                throw new IllegalStateException("Organisation unit id must be set");
            }

            if ( userId == null) {
                throw new IllegalStateException("User id must be set");
            }

            return new OrganisationUnitAccessModel(userId, organisationUnitId, metadataAccessId);
        }
    }


}
