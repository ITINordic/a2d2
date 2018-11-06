/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

package com.itinordic.a2d2.trackedentityattribute;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class TrackedEntityAttributeModel {

    private Date lastUpdated;
    @NonNull
    @PrimaryKey
    private String id;
    private Date created;
    private String name;
    private String shortName;
    private String aggregationType;
    private boolean programScope;
    private String displayName;
    private String displayShortName;
    private String valueType;
    private boolean confidential;
    private String dimensionItem;
    private boolean unique;
    private boolean optionSetValue;



    public TrackedEntityAttributeModel(Date lastUpdated, String id, Date created, String name, String shortName, String aggregationType, boolean programScope, String displayName, String displayShortName, String valueType, boolean confidential, String dimensionItem, boolean unique, boolean optionSetValue) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.shortName = shortName;
        this.aggregationType = aggregationType;
        this.programScope = programScope;
        this.displayName = displayName;
        this.displayShortName = displayShortName;
        this.valueType = valueType;
        this.confidential = confidential;
        this.dimensionItem = dimensionItem;
        this.unique = unique;
        this.optionSetValue = optionSetValue;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAggregationType() {
        return aggregationType;
    }

    public void setAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
    }

    public boolean isProgramScope() {
        return programScope;
    }

    public void setProgramScope(boolean programScope) {
        this.programScope = programScope;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayShortName() {
        return displayShortName;
    }

    public void setDisplayShortName(String displayShortName) {
        this.displayShortName = displayShortName;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public boolean isConfidential() {
        return confidential;
    }

    public void setConfidential(boolean confidential) {
        this.confidential = confidential;
    }

    public String getDimensionItem() {
        return dimensionItem;
    }

    public void setDimensionItem(String dimensionItem) {
        this.dimensionItem = dimensionItem;
    }

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public boolean isOptionSetValue() {
        return optionSetValue;
    }

    public void setOptionSetValue(boolean optionSetValue) {
        this.optionSetValue = optionSetValue;
    }

    public static class Builder {

        private Date lastUpdated;
        private String id;
        private Date created;
        private String name;
        private String shortName;
        private String aggregationType;
        private boolean programScope;
        private String displayName;
        private String displayShortName;
        private String valueType;
        private boolean confidential;
        private String dimensionItem;
        private boolean unique;
        private boolean optionSetValue;


        public Builder() {
            // empty constructor
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder lastUpdated(@NonNull Date lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder id(@NonNull String id) {
            this.id = id;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder created(@NonNull Date created) {
            this.created = created;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder name(@NonNull String name) {
            this.name = name;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder shortName(@NonNull String shortName) {
            this.shortName = shortName;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder aggregationType(@NonNull String aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder programScope(@NonNull boolean programScope) {
            this.programScope = programScope;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder displayName(@NonNull String displayName) {
            this.displayName = displayName;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder displayShortName(@NonNull String displayShortName) {
            this.displayShortName = displayShortName;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder valueType(@NonNull String valueType) {
            this.valueType = valueType;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder confidential(@NonNull boolean confidential) {
            this.confidential = confidential;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder dimensionItem(@NonNull String dimensionItem) {
            this.dimensionItem = dimensionItem;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder unique(@NonNull boolean unique) {
            this.unique = unique;
            return this;
        }

        @NonNull
        public TrackedEntityAttributeModel.Builder optionSetValue(@NonNull boolean optionSetValue) {
            this.optionSetValue = optionSetValue;
            return this;
        }

        public TrackedEntityAttributeModel build() {

            if (id == null) {
                throw new IllegalStateException("UID must be set");
            }

            if ( lastUpdated == null) {
                throw new IllegalStateException("Last Updated must be set");
            }

            if ( created == null) {
                throw new IllegalStateException("Created must be set");
            }

            if ( name == null) {
                throw new IllegalStateException("Name must be set");
            }

            if ( shortName == null) {
                throw new IllegalStateException("Short name must be set");
            }

            if ( aggregationType == null) {
                throw new IllegalStateException("Aggregation type must be set");
            }

            if ( displayName == null) {
                throw new IllegalStateException("Display name must be set");
            }

            if ( displayShortName == null) {
                throw new IllegalStateException("Display short name must be set");
            }

            if ( valueType == null) {
                throw new IllegalStateException("Value type must be set");
            }

            if ( dimensionItem == null) {
                throw new IllegalStateException("Dimension item must be set");
            }

            return new TrackedEntityAttributeModel( lastUpdated,  id,  created,  name,  shortName,
                    aggregationType,  programScope,  displayName,  displayShortName,  valueType,
                    confidential,  dimensionItem,  unique, optionSetValue);

        }

    }
}
