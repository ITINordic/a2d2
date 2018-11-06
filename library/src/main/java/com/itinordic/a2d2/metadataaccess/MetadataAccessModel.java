package com.itinordic.a2d2.metadataaccess;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by regnatpopulus on 01/10/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
@Entity
public class MetadataAccessModel {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int id;

    private boolean read;
    private boolean update;
    private boolean externalize;
    private boolean delete;
    private boolean write;
    private boolean manage;


    public MetadataAccessModel(int id, boolean read, boolean update, boolean externalize, boolean delete, boolean write, boolean manage) {
        this.id = id;
        this.read = read;
        this.update = update;
        this.externalize = externalize;
        this.delete = delete;
        this.write = write;
        this.manage = manage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isExternalize() {
        return externalize;
    }

    public void setExternalize(boolean externalize) {
        this.externalize = externalize;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public boolean isManage() {
        return manage;
    }

    public void setManage(boolean manage) {
        this.manage = manage;
    }

    //Builder
    public static class Builder {

        private int id;
        private boolean read;
        private boolean update;
        private boolean externalize;
        private boolean delete;
        private boolean write;
        private boolean manage;


        public Builder() {
            // empty constructor
        }


        @NonNull
        public Builder id(@NonNull int id) {
            this.id = id;
            return this;
        }

        @NonNull
        public Builder read(@NonNull boolean read) {
            this.read = read;
            return this;
        }

        @NonNull
        public Builder update(@NonNull boolean update) {
            this.update = update;
            return this;
        }

        @NonNull
        public Builder externalize(@NonNull boolean externalize) {
            this.externalize = externalize;
            return this;
        }

        @NonNull
        public Builder delete(@NonNull boolean delete) {
            this.delete = delete;
            return this;
        }

        @NonNull
        public Builder write(@NonNull boolean write) {
            this.write = write;
            return this;
        }

        @NonNull
        public Builder manage(@NonNull boolean manage) {
            this.manage = manage;
            return this;
        }

        public MetadataAccessModel build() {

            return new MetadataAccessModel(id, read, update, externalize, delete, write, manage);
        }
    }

}
