package com.itinordic.a2d2.trackedentitytype;

import com.itinordic.a2d2.common.Utils;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Entity
public class TrackedEntityTypeModel {

    @NonNull
    @PrimaryKey
    private String id;
    @TypeConverters({Utils.class})
    private Date lastUpdated;
    @TypeConverters({Utils.class})
    private Date created;
    private String name;
    private String displayName;
    private String description;
    private String displayDescription;
    private String icon;
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayDescription() {
        return displayDescription;
    }

    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TrackedEntityTypeModel(String id, Date lastUpdated, Date created, String name, String displayName, String description, String displayDescription, String icon, String color) {
        this.id = id;
        this.lastUpdated = lastUpdated;
        this.created = created;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.displayDescription = displayDescription;
        this.icon = icon;
        this.color = color;
    }

    //Builder
    public static class Builder {
        private Date lastUpdated;
        private String id;
        private Date created;
        private String name;
        private String displayName;
        private String description;
        private String displayDescription;
        private String icon;
        private String color;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder lastUpdated(@NonNull Date lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
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
        public Builder name(@NonNull String name) {
            this.name = name;
            return this;
        }

        @NonNull
        public Builder displayName(@NonNull String displayName) {
            this.displayName = displayName;
            return this;
        }


        @NonNull
        public Builder description(@NonNull String description) {
            this.description = description;
            return this;
        }


        @NonNull
        public Builder displayDescription(@NonNull String displayDescription) {
            this.displayDescription = displayDescription;
            return this;
        }

        @NonNull
        public Builder icon(@NonNull String icon) {
            this.icon = icon;
            return this;
        }

        @NonNull
        public Builder color(@NonNull String color) {
            this.color = color;
            return this;
        }

        public TrackedEntityTypeModel build() {

            if (id == null) {
                throw new IllegalStateException("UID must be set");
            }

            if ( displayName == null) {
                throw new IllegalStateException("Display name must be set");
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

            return new TrackedEntityTypeModel( id, lastUpdated, created, name, displayName, description, displayDescription, icon, color);
        }
    }
}
