package com.itinordic.a2d2.dataelement;

import com.itinordic.a2d2.common.Utils;

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
public class DataElementModel {

    @NonNull
    @PrimaryKey
    private String id;
    @TypeConverters({Utils.class})
    private String lastUpdated;
    @TypeConverters({Utils.class})
    private String created;
    private String name;
    private String shortName;
    private String domainType;
    private String displayName;
    private String publicAccess;
    private String displayShortName;
    private String valueType;
    private String dimensionItem;
    private String displayFormName;
    private String zeroIsSignificant;
    private String dimensionItemType;
    private String categoryCombo;

    public DataElementModel(@NonNull String id, String lastUpdated, String created, String name, String shortName, String domainType, String displayName, String publicAccess, String displayShortName, String valueType, String dimensionItem, String displayFormName, String zeroIsSignificant, String dimensionItemType, String categoryCombo) {
        this.id = id;
        this.lastUpdated = lastUpdated;
        this.created = created;
        this.name = name;
        this.shortName = shortName;
        this.domainType = domainType;
        this.displayName = displayName;
        this.publicAccess = publicAccess;
        this.displayShortName = displayShortName;
        this.valueType = valueType;
        this.dimensionItem = dimensionItem;
        this.displayFormName = displayFormName;
        this.zeroIsSignificant = zeroIsSignificant;
        this.dimensionItemType = dimensionItemType;
        this.categoryCombo = categoryCombo;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastUpdated(){
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated){
        this.lastUpdated = lastUpdated;
    }

    public String getCreated(){
        return created;
    }

    public void setCreated(String created) {
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

    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPublicAccess() {
        return publicAccess;
    }

    public void setPublicAccess(String publicAccess) {
        this.publicAccess = publicAccess;
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

    public String getDimensionItem() {
        return dimensionItem;
    }

    public void setDimensionItem(String dimensionItem) {
        this.dimensionItem = dimensionItem;
    }

    public String getDisplayFormName() {
        return displayFormName;
    }

    public void setDisplayFormName(String displayFormName) {
        this.displayFormName = displayFormName;
    }

    public String getZeroIsSignificant() {
        return zeroIsSignificant;
    }

    public void setZeroIsSignificant(String zeroIsSignificant) {
        this.zeroIsSignificant = zeroIsSignificant;
    }

    public String getDimensionItemType() {
        return dimensionItemType;
    }

    public void setDimensionItemType(String dimensionItemType) {
        this.dimensionItemType = dimensionItemType;
    }

    public String getCategoryCombo() {
        return categoryCombo;
    }

    public void setCategoryCombo(String categoryCombo) {
        this.categoryCombo = categoryCombo;
    }

    //Builder

    public static class Builder{

        private String id;
        private String lastUpdated;
        private String created;
        private String name;
        private String shortName;
        private String domainType;
        private String displayName;
        private String publicAccess;
        private String displayShortName;
        private String valueType;
        private String dimensionItem;
        private String displayFormName;
        private String zeroIsSignificant;
        private String dimensionItemType;
        private String categoryCombo;

        public Builder() {
            //Empty constructor
        }

        public Builder id(@NonNull String id) {
            this.id = id;
            return this;
        }

        public Builder lastUpdated(@NonNull String lastUpdated){
            this.lastUpdated = lastUpdated;
            return this;
        }

        public Builder created(@NonNull String created){
            this.created = created;
            return this;
        }

        public Builder name(@NonNull String name) {
            this.name = name;
            return this;
        }

        public Builder shortName(String shortName) {
            this.shortName = shortName;
            return this;
        }

        public Builder domainType(String domainType) {
            this.domainType = domainType;
            return this;
        }

        public Builder displayName(@NonNull String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder publicAccess(String publicAccess) {
            this.publicAccess = publicAccess;
            return this;
        }

        public Builder displayShortName(String displayShortName) {
            this.displayShortName = displayShortName;
            return this;
        }

        public Builder valueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder dimensionItem(String dimensionItem) {
            this.dimensionItem = dimensionItem;
            return this;
        }

        public Builder displayFormName(String displayFormName) {
            this.displayFormName = displayFormName;
            return this;
        }

        public Builder zeroIsSignificant(String zeroIsSignificant) {
            this.zeroIsSignificant = zeroIsSignificant;
            return this;
        }

        public Builder dimensionItemType(String dimensionItemType) {
            this.dimensionItemType = dimensionItemType;
            return this;
        }

        public Builder categoryCombo(String categoryCombo) {
            this.categoryCombo = categoryCombo;
            return this;
        }

        public DataElementModel build() {

            if (id == null) {
                throw new IllegalStateException("UID must be set");
            }


            if (name == null) {
                throw new IllegalStateException("Name must be set");
            }

            if ( shortName == null) {
                throw new IllegalStateException("Short Name must be set");
            }

            if ( domainType == null) {
                throw new IllegalStateException("Domain Type must be set");
            }

            if ( displayName == null) {
                throw new IllegalStateException("Display Name must be set");
            }

            if ( publicAccess == null) {
                throw new IllegalStateException("Public Access must be set");
            }

            if ( displayShortName == null) {
                throw new IllegalStateException("Display Short Name must be set");
            }

            if ( valueType == null) {
                throw new IllegalStateException("Value Type  must be set");
            }

            if ( dimensionItem == null) {
                throw new IllegalStateException("Dimension Item must be set");
            }

            if ( displayFormName == null) {
                throw new IllegalStateException("Display Form Name must be set");
            }

            if ( zeroIsSignificant == null) {
                throw new IllegalStateException("Zero Is Significant  must be set");
            }

            if ( dimensionItemType == null) {
                throw new IllegalStateException("Dimension Item Type must be set");
            }

            if ( categoryCombo == null) {
                throw new IllegalStateException("Category Combo name must be set");
            }

            return new DataElementModel(id,lastUpdated, created, name,shortName,domainType,displayName,publicAccess,displayShortName,valueType,dimensionItem,displayFormName,zeroIsSignificant,dimensionItemType,categoryCombo);
        }
    }
}
