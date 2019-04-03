package com.itinordic.a2d2.trackedentityinstance;

import com.itinordic.a2d2.common.Utils;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

/**
 * Created by regnatpopulus on 03/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Entity(
        foreignKeys = {@ForeignKey(entity = TrackedEntityTypeModel.class,
        parentColumns = "id",
        childColumns = "trackedEntityTypeId"
        )}, indices = {@Index("trackedEntityTypeId")}
)
public class TrackedEntityInstanceModel {

    @NonNull
    @PrimaryKey
    private String id;
    @TypeConverters({Utils.class})
    private Date created;
    @TypeConverters({Utils.class})
    private Date createdAtClient;
    @TypeConverters({Utils.class})
    private Date lastUpdated;
    private String featureType;
    @NonNull
    private  String trackedEntityTypeId;

    public TrackedEntityInstanceModel(@NonNull String id, Date created, Date createdAtClient, Date lastUpdated, String featureType, @NonNull String trackedEntityTypeId) {
        this.id = id;
        this.created = created;
        this.createdAtClient = createdAtClient;
        this.lastUpdated = lastUpdated;
        this.featureType = featureType;
        this.trackedEntityTypeId = trackedEntityTypeId;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreatedAtClient() {
        return createdAtClient;
    }

    public void setCreatedAtClient(Date createdAtClient) {
        this.createdAtClient = createdAtClient;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getFeatureType() {
        return featureType;
    }

    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

    @NonNull
    public String getTrackedEntityTypeId() {
        return trackedEntityTypeId;
    }

    public void setTrackedEntityTypeId(@NonNull String trackedEntityTypeId) {
        this.trackedEntityTypeId = trackedEntityTypeId;
    }


    public static class Builder {
        private String id;
        private Date created;
        private Date createdAtClient;
        private Date lastUpdated;
        private String featureType;
        private  String trackedEntityTypeId;

        public Builder() {

        }


        @NonNull
        public Builder id(@NonNull String id) {
            this.id = id;
            return this;
        }

        @NonNull
        public Builder created(@NonNull Date created) {
            this.created = created;
            return this;
        }

        @NonNull
        public Builder createdAtClient(@NonNull Date createdAtClient) {
            this.createdAtClient = createdAtClient;
            return this;
        }

        @NonNull
        public Builder lastUpdated(@NonNull Date lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        @NonNull
        public Builder featureType(@NonNull String featureType) {
            this.featureType = featureType;
            return this;
        }

        @NonNull
        public Builder trackedEntityTypeId(@NonNull String trackedEntityTypeId) {
            this.trackedEntityTypeId = trackedEntityTypeId;
            return this;
        }

        public TrackedEntityInstanceModel build() {

            if (id == null) {
                throw new IllegalStateException("UID must be set");
            }

            if ( lastUpdated == null) {
                throw new IllegalStateException("Last Updated must be set");
            }

            if ( created == null) {
                throw new IllegalStateException("Created must be set");
            }

            if ( createdAtClient == null) {
                throw new IllegalStateException("createdAtClient must be set");
            }

            if (featureType == null) {
                throw new IllegalStateException("featureType must be set");
            }

            if (trackedEntityTypeId == null) {
                throw new IllegalStateException("trackedEntityTypeId must be set");
            }

            return new TrackedEntityInstanceModel( id, created, createdAtClient, lastUpdated, featureType, trackedEntityTypeId);
        }
    }

    }
