package com.itinordic.a2d2.metadataaccess;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

/**
 * Created by regnatpopulus on 01/10/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Entity(primaryKeys = "metadataAccessId", foreignKeys = @ForeignKey(entity = MetadataAccessModel.class,
        parentColumns = "id",
        childColumns = "metadataAccessId",
        onDelete = CASCADE), indices = {@Index("metadataAccessId")})
public class DataAccessModel {

    private int metadataAccessId;
    private boolean read;
    private boolean write;

    public DataAccessModel(int metadataAccessId, boolean read, boolean write) {
        this.read = read;
        this.write = write;
        this.metadataAccessId = metadataAccessId;
    }

    public int getMetadataAccessId() {
        return metadataAccessId;
    }

    public void setMetadataAccessId(int metadataAccessId) {
        this.metadataAccessId = metadataAccessId;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    //Builder
    public static class Builder {

        private  boolean read;
        private  boolean write;
        private int metadataAccessId;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder read(@NonNull boolean read) {
            this.read = read;
            return this;
        }

        @NonNull
        public Builder write(@NonNull boolean write) {
            this.write = write;
            return this;
        }

        @NonNull
        public Builder metadataAccessId(@NonNull int metadataAccessId) {
            this.metadataAccessId = metadataAccessId;
            return this;
        }

        public DataAccessModel build() {

            return new DataAccessModel(metadataAccessId, read, write);
        }
    }
}
