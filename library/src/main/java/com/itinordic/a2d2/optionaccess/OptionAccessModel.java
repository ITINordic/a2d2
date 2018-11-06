package com.itinordic.a2d2.optionaccess;

import com.itinordic.a2d2.metadataaccess.MetadataAccessModel;
import com.itinordic.a2d2.option.OptionModel;
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

@Entity(tableName = "option_access_model",
        primaryKeys = { "userId", "optionId", "metadataAccessId" },
        foreignKeys = {
                @ForeignKey(entity = UserModel.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = CASCADE),
                @ForeignKey(entity = OptionModel.class,
                        parentColumns = "id",
                        childColumns = "optionId"),
                @ForeignKey(entity = MetadataAccessModel.class,
                        parentColumns = "id",
                        childColumns = "metadataAccessId")
        }, indices = {@Index("userId"), @Index("optionId"), @Index("metadataAccessId")})
public class OptionAccessModel {
    @NonNull
    private String userId;
    @NonNull
    private String optionId;
    @NonNull
    private int metadataAccessId;

    public OptionAccessModel(String userId, String optionId, int metadataAccessId) {
        this.userId = userId;
        this.optionId = optionId;
        this.metadataAccessId = metadataAccessId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    public int getMetadataAccessId() {
        return metadataAccessId;
    }

    public void setMetadataAccessId(int metadataAccessId) {
        this.metadataAccessId = metadataAccessId;
    }

    public static class Builder {

        private String userId;
        private String optionId;
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
        public Builder optionId(@NonNull String optionId) {
            this.optionId = optionId;
            return this;
        }

        @NonNull
        public Builder metadataAccessId(@NonNull int metadataAccessId) {
            this.metadataAccessId = metadataAccessId;
            return this;
        }

        public OptionAccessModel build() {

            if (optionId == null) {
                throw new IllegalStateException("Option id must be set");
            }

            if ( userId == null) {
                throw new IllegalStateException("User id must be set");
            }

            return new OptionAccessModel(userId, optionId, metadataAccessId);
        }
    }
}
