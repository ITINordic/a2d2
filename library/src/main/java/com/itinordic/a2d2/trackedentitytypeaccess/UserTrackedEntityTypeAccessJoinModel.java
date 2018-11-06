package com.itinordic.a2d2.trackedentitytypeaccess;

import com.itinordic.a2d2.metadataaccess.MetadataAccessModel;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;
import com.itinordic.a2d2.user.UserModel;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

import static androidx.room.ForeignKey.CASCADE;

/**
 * Created by regnatpopulus on 01/10/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Entity(tableName = "user_tracked_entity_type_access_join_model",
        primaryKeys = { "userId", "trackedEntityTypeId", "metadataAccessId" },
        foreignKeys = {
                @ForeignKey(entity = UserModel.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = CASCADE),
                @ForeignKey(entity = TrackedEntityTypeModel.class,
                        parentColumns = "id",
                        childColumns = "trackedEntityTypeId"),
                @ForeignKey(entity = MetadataAccessModel.class,
                        parentColumns = "id",
                        childColumns = "metadataAccessId")
        }, indices = {@Index("userId"), @Index("trackedEntityTypeId"), @Index("metadataAccessId")})
public class UserTrackedEntityTypeAccessJoinModel {
    @NonNull
    private String userId;
    @NonNull
    private String trackedEntityTypeId;
    @NonNull
    private int metadataAccessId;

    public UserTrackedEntityTypeAccessJoinModel(String userId, String trackedEntityTypeId, int metadataAccessId) {
        this.userId = userId;
        this.trackedEntityTypeId = trackedEntityTypeId;
        this.metadataAccessId = metadataAccessId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTrackedEntityTypeId() {
        return trackedEntityTypeId;
    }

    public void setTrackedEntityTypeId(String trackedEntityTypeId) {
        this.trackedEntityTypeId = trackedEntityTypeId;
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
        private String trackedEntityTypeId;
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
        public Builder trackedEntityTypeId(@NonNull String trackedEntityTypeId) {
            this.trackedEntityTypeId = trackedEntityTypeId;
            return this;
        }

        @NonNull
        public Builder metadataAccessId(@NonNull int metadataAccessId) {
            this.metadataAccessId = metadataAccessId;
            return this;
        }

        public UserTrackedEntityTypeAccessJoinModel build() {

            if (trackedEntityTypeId == null) {
                throw new IllegalStateException("Program id must be set");
            }

            if ( userId == null) {
                throw new IllegalStateException("User id must be set");
            }

            return new UserTrackedEntityTypeAccessJoinModel(userId, trackedEntityTypeId, metadataAccessId);
        }
    }

}
