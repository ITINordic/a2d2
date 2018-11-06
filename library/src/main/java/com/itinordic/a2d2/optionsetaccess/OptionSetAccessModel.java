package com.itinordic.a2d2.optionsetaccess;

import com.itinordic.a2d2.metadataaccess.MetadataAccessModel;
import com.itinordic.a2d2.optionset.OptionSetModel;
import com.itinordic.a2d2.user.UserModel;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

import static androidx.room.ForeignKey.CASCADE;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Entity(tableName = "optionset_access_model",
        primaryKeys = { "userId", "optionSetId", "metadataAccessId" },
        foreignKeys = {
                @ForeignKey(entity = UserModel.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = CASCADE),
                @ForeignKey(entity = OptionSetModel.class,
                        parentColumns = "id",
                        childColumns = "optionSetId"),
                @ForeignKey(entity = MetadataAccessModel.class,
                        parentColumns = "id",
                        childColumns = "metadataAccessId")
        }, indices = {@Index("userId"), @Index("optionSetId"), @Index("metadataAccessId")})
public class OptionSetAccessModel {

    @NonNull
    private String userId;
    @NonNull
    private String optionSetId;
    @NonNull
    private int metadataAccessId;

    public OptionSetAccessModel(String userId, String optionSetId, int metadataAccessId) {
        this.userId = userId;
        this.optionSetId = optionSetId;
        this.metadataAccessId = metadataAccessId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOptionSetId() {
        return optionSetId;
    }

    public void setOptionSetId(String optionSetId) {
        this.optionSetId = optionSetId;
    }

    public int getMetadataAccessId() {
        return metadataAccessId;
    }

    public void setMetadataAccessId(int metadataAccessId) {
        this.metadataAccessId = metadataAccessId;
    }

    public static class Builder {

        private String userId;
        private String optionSetId;
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
        public Builder optionSetId(@NonNull String optionSetId) {
            this.optionSetId = optionSetId;
            return this;
        }

        @NonNull
        public Builder metadataAccessId(@NonNull int metadataAccessId) {
            this.metadataAccessId = metadataAccessId;
            return this;
        }

        public OptionSetAccessModel build() {

            if (optionSetId == null) {
                throw new IllegalStateException("Option set id must be set");
            }

            if ( userId == null) {
                throw new IllegalStateException("User id must be set");
            }

            return new OptionSetAccessModel(userId, optionSetId, metadataAccessId);
        }
    }
}
