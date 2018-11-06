/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

package com.itinordic.a2d2.trackedentityattributeaccess;

import com.itinordic.a2d2.metadataaccess.MetadataAccessModel;
import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;
import com.itinordic.a2d2.user.UserModel;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "tracked_entity_attribute_access_model",
        primaryKeys = { "userId", "trackedEntityAttributeId", "metadataAccessId" },
        foreignKeys = {
                @ForeignKey(entity = UserModel.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = CASCADE),
                @ForeignKey(entity = TrackedEntityAttributeModel.class,
                        parentColumns = "id",
                        childColumns = "trackedEntityAttributeId"),
                @ForeignKey(entity = MetadataAccessModel.class,
                        parentColumns = "id",
                        childColumns = "metadataAccessId")
        }, indices = {@Index("userId"), @Index("trackedEntityAttributeId"), @Index("metadataAccessId")})
public class TrackedEntityAttributeAccessModel {

    @NonNull
    private String userId;
    @NonNull
    private String trackedEntityAttributeId;
    @NonNull
    private int metadataAccessId;

    public TrackedEntityAttributeAccessModel(String userId, String trackedEntityAttributeId, int metadataAccessId) {
        this.userId = userId;
        this.trackedEntityAttributeId = trackedEntityAttributeId;
        this.metadataAccessId = metadataAccessId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTrackedEntityAttributeId() {
        return trackedEntityAttributeId;
    }

    public void setTrackedEntityAttributeId(String trackedEntityAttributeId) {
        this.trackedEntityAttributeId = trackedEntityAttributeId;
    }

    public int getMetadataAccessId() {
        return metadataAccessId;
    }

    public void setMetadataAccessId(int metadataAccessId) {
        this.metadataAccessId = metadataAccessId;
    }

    //Builder
    public static class Builder {

        private String userId;
        private String trackedEntityAttributeId;
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
        public Builder trackedEntityAttributeId(@NonNull String trackedEntityAttributeId) {
            this.trackedEntityAttributeId = trackedEntityAttributeId;
            return this;
        }

        @NonNull
        public Builder metadataAccessId(@NonNull int metadataAccessId) {
            this.metadataAccessId = metadataAccessId;
            return this;
        }

        public TrackedEntityAttributeAccessModel build() {

            if (trackedEntityAttributeId == null) {
                throw new IllegalStateException("Program id must be set");
            }

            if ( userId == null) {
                throw new IllegalStateException("User id must be set");
            }

            return new TrackedEntityAttributeAccessModel(userId, trackedEntityAttributeId, metadataAccessId);
        }
    }

}
