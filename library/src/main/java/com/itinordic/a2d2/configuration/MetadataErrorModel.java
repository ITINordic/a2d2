package com.itinordic.a2d2.configuration;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by regnatpopulus on 06/04/2019.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
@Entity
public class MetadataErrorModel {

    @NonNull
    @PrimaryKey
    private String uid;
    private String metadataType;
    private String errorMessage;
    private Date errorDate;

    public MetadataErrorModel(@NonNull String uid, String metadataType, String errorMessage, Date errorDate) {
        this.uid = uid;
        this.metadataType = metadataType;
        this.errorMessage = errorMessage;
        this.errorDate = errorDate;
    }

    @NonNull
    public String getUid() {
        return uid;
    }

    public void setUid(@NonNull String uid) {
        this.uid = uid;
    }

    public String getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(String metadataType) {
        this.metadataType = metadataType;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Date getErrorDate() {
        return errorDate;
    }

    public void setErrorDate(Date errorDate) {
        this.errorDate = errorDate;
    }

    public static class Builder {
        private String uid;
        private String metadataType;
        private String errorMessage;
        private Date errorDate;

        @NonNull
        public Builder uid(@NonNull String uid) {
            this.uid = uid;
            return this;
        }

        @NonNull
        public Builder metadataType(@NonNull String metadataType) {
            this.metadataType = metadataType;
            return this;
        }

        @NonNull
        public Builder errorMessage(@NonNull String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        @NonNull
        public Builder errorDate(@NonNull Date errorDate) {
            this.errorDate = errorDate;
            return this;
        }

        public MetadataErrorModel build() {

            if (uid == null) {
                throw new IllegalStateException("UID must be set");
            }

            if ( metadataType == null) {
                throw new IllegalStateException("metadataType name must be set");
            }

            if (errorMessage == null) {
                throw new IllegalStateException("UID must be set");
            }

            return new MetadataErrorModel(uid,metadataType,errorMessage, errorDate);
        }

        }


    }
