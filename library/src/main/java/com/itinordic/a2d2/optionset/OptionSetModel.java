
/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

package com.itinordic.a2d2.optionset;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class OptionSetModel {
    private Date lastUpdated;
    @NonNull
    @PrimaryKey
    private String id;
    private Date created;
    private String name;
    private String displayName;
    private String valueType;

    public OptionSetModel(Date lastUpdated, String id, Date created,
                          String name, String displayName, String valueType) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.displayName = displayName;
        this.valueType = valueType;
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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public static class Builder {

        private Date lastUpdated;
        private String id;
        private Date created;
        private String name;
        private String displayName;
        private String valueType;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public OptionSetModel.Builder lastUpdated(@NonNull Date lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        @NonNull
        public OptionSetModel.Builder id(@NonNull String id) {
            this.id = id;
            return this;
        }

        @NonNull
        public OptionSetModel.Builder created(@NonNull Date created) {
            this.created = created;
            return this;
        }

        @NonNull
        public OptionSetModel.Builder name(@NonNull String name) {
            this.name = name;
            return this;
        }

        @NonNull
        public OptionSetModel.Builder displayName(@NonNull String displayName) {
            this.displayName = displayName;
            return this;
        }

        @NonNull
        public OptionSetModel.Builder valueType(@NonNull String valueType) {
            this.valueType = valueType;
            return this;
        }

        public OptionSetModel build() {

            if (id == null) {
                throw new IllegalStateException("UID must be set");
            }

            if (lastUpdated == null) {
                throw new IllegalStateException("Last Updated must be set");
            }

            if (created == null) {
                throw new IllegalStateException("Created must be set");
            }

            if (name == null) {
                throw new IllegalStateException("Name must be set");
            }

            if (displayName == null) {
                throw new IllegalStateException("Display name must be set");
            }

            if (valueType == null) {
                throw new IllegalStateException("Value type must be set");
            }


            return new OptionSetModel(lastUpdated, id, created, name, displayName, valueType);

        }
    }
}
