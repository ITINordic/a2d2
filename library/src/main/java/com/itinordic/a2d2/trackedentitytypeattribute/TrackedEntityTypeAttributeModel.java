/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

package com.itinordic.a2d2.trackedentitytypeattribute;

import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

@Entity(tableName = "tracked_entity_type_attribute_model",
        primaryKeys = { "id" },
        foreignKeys = {
                @ForeignKey(entity = TrackedEntityTypeModel.class,
                        parentColumns = "id",
                        childColumns = "trackedEntityTypeId"),
                @ForeignKey(entity = TrackedEntityAttributeModel.class,
                        parentColumns = "id",
                        childColumns = "trackedEntityAttributeId")
        }, indices = {@Index("trackedEntityAttributeId"),@Index("trackedEntityTypeId") })
public class TrackedEntityTypeAttributeModel {
    private Date lastUpdated;
    @NonNull
    private String id;
    private Date created;
    private String trackedEntityTypeId;
    private String trackedEntityAttributeId;
    private boolean displayInList;
    private boolean mandatory;


    public TrackedEntityTypeAttributeModel(Date lastUpdated, String id, Date created, String trackedEntityTypeId, String trackedEntityAttributeId, boolean displayInList, boolean mandatory) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.trackedEntityTypeId = trackedEntityTypeId;
        this.trackedEntityAttributeId = trackedEntityAttributeId;
        this.displayInList = displayInList;
        this.mandatory = mandatory;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getTrackedEntityTypeId() {
        return trackedEntityTypeId;
    }

    public void setTrackedEntityTypeId(String trackedEntityTypeId) {
        this.trackedEntityTypeId = trackedEntityTypeId;
    }

    public String getTrackedEntityAttributeId() {
        return trackedEntityAttributeId;
    }

    public void setTrackedEntityAttributeId(String trackedEntityAttributeId) {
        this.trackedEntityAttributeId = trackedEntityAttributeId;
    }

    public boolean isDisplayInList() {
        return displayInList;
    }

    public void setDisplayInList(boolean displayInList) {
        this.displayInList = displayInList;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public static class Builder {
        private Date lastUpdated;
        private String id;
        private Date created;
        private String trackedEntityTypeId;
        private String trackedEntityAttributeId;
        private boolean displayInList;
        private boolean mandatory;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public TrackedEntityTypeAttributeModel.Builder lastUpdated(@NonNull Date lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        @NonNull
        public TrackedEntityTypeAttributeModel.Builder id(@NonNull String id) {
            this.id = id;
            return this;
        }

        @NonNull
        public TrackedEntityTypeAttributeModel.Builder created(@NonNull Date created) {
            this.created = created;
            return this;
        }

        @NonNull
        public TrackedEntityTypeAttributeModel.Builder trackedEntityTypeId(@NonNull String trackedEntityTypeId) {
            this.trackedEntityTypeId = trackedEntityTypeId;
            return this;
        }

        @NonNull
        public TrackedEntityTypeAttributeModel.Builder trackedEntityAttributeId(@NonNull String trackedEntityAttributeId) {
            this.trackedEntityAttributeId = trackedEntityAttributeId;
            return this;
        }

        @NonNull
        public TrackedEntityTypeAttributeModel.Builder displayInList(@NonNull boolean displayInList) {
            this.displayInList = displayInList;
            return this;
        }

        @NonNull
        public TrackedEntityTypeAttributeModel.Builder mandatory(@NonNull boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }

        public TrackedEntityTypeAttributeModel build() {

            if (id == null) {
                throw new IllegalStateException("UID must be set");
            }

            if ( lastUpdated == null) {
                throw new IllegalStateException("Last Updated must be set");
            }

            if ( created == null) {
                throw new IllegalStateException("Created must be set");
            }

            if (trackedEntityTypeId == null) {
                throw new IllegalStateException("Tracked Entity Type Id must be set");
            }

            if (trackedEntityAttributeId == null) {
                throw new IllegalStateException("Tracked Entity Attribute Id must be set");
            }

            return new TrackedEntityTypeAttributeModel( lastUpdated,  id,  created,
                    trackedEntityTypeId,  trackedEntityAttributeId,  displayInList,  mandatory);

        }
    }

    }
