/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

package com.itinordic.a2d2.option;

import com.itinordic.a2d2.optionset.OptionSetModel;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;


@Entity(tableName = "OptionModel",
        primaryKeys = { "id" },
        foreignKeys = {
                @ForeignKey(entity = OptionSetModel.class,
                        parentColumns = "id",
                        childColumns = "optionSetId"),
        }, indices = {@Index("optionSetId") })
public class OptionModel {

    private String code;
    private Date lastUpdated;
    @NonNull
    private String id;
    private Date created;
    private String name;
    private String displayName;
    private String sortOrder;
    private String optionSetId;

    public OptionModel(String code, Date lastUpdated, String id, Date created, String name, String displayName, String sortOrder, String optionSetId) {
        this.code = code;
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.displayName = displayName;
        this.sortOrder = sortOrder;
        this.optionSetId = optionSetId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getOptionSetId() {
        return optionSetId;
    }

    public void setOptionSetId(String optionSetId) {
        this.optionSetId = optionSetId;
    }

    public static class Builder {

        private Date lastUpdated;
        private String id;
        private Date created;
        private String name;
        private String displayName;
        private String code;
        private String optionSetId;
        private String sortOrder;


        public Builder() {
            // empty constructor
        }

        @NonNull
        public OptionModel.Builder lastUpdated(@NonNull Date lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        @NonNull
        public OptionModel.Builder id(@NonNull String id) {
            this.id = id;
            return this;
        }

        @NonNull
        public OptionModel.Builder created(@NonNull Date created) {
            this.created = created;
            return this;
        }

        @NonNull
        public OptionModel.Builder name(@NonNull String name) {
            this.name = name;
            return this;
        }

        @NonNull
        public OptionModel.Builder displayName(@NonNull String displayName) {
            this.displayName = displayName;
            return this;
        }

        public OptionModel.Builder code(String code) {
            this.code = code;
            return this;
        }

        @NonNull
        public OptionModel.Builder optionSetId(@NonNull String optionSetId) {
            this.optionSetId = optionSetId;
            return this;
        }

        @NonNull
        public OptionModel.Builder sortOrder(@NonNull String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        public OptionModel build() {

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

            if (optionSetId == null) {
                throw new IllegalStateException("Option Set Id  must be set");
            }

            if (displayName == null) {
                throw new IllegalStateException("Display name must be set");
            }

            return new OptionModel( code,  lastUpdated,  id,  created,  name,  displayName,  sortOrder,  optionSetId);

        }
    }

}
