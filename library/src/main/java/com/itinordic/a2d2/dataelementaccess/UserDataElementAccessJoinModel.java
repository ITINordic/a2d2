package com.itinordic.a2d2.dataelementaccess;

import com.itinordic.a2d2.dataelement.DataElementModel;
import com.itinordic.a2d2.metadataaccess.MetadataAccessModel;
import com.itinordic.a2d2.user.UserModel;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "user_data_element_access_join_model",
        primaryKeys = { "userId", "dataElementId", "metadataAccessId" },
        foreignKeys = {
                @ForeignKey(entity = UserModel.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = CASCADE),
                @ForeignKey(entity = DataElementModel.class,
                        parentColumns = "id",
                        childColumns = "dataElementId"),
                @ForeignKey(entity = MetadataAccessModel.class,
                        parentColumns = "id",
                        childColumns = "metadataAccessId")
        }, indices = {@Index("dataElementId"), @Index("metadataAccessId")})

public class UserDataElementAccessJoinModel {

    @NonNull
    private String userId;
    @NonNull
    private String dataElementId;
    private boolean read;
    private boolean update;
    private boolean externalize;
    private boolean delete;
    private boolean write;
    private boolean manage;

    private int metadataAccessId;


    public UserDataElementAccessJoinModel(@NonNull String userId, @NonNull String dataElementId, boolean read, boolean update, boolean externalize, boolean delete, boolean write, boolean manage, int metadataAccessId) {
        this.userId = userId;
        this.dataElementId = dataElementId;
        this.read = read;
        this.update = update;
        this.externalize = externalize;
        this.delete = delete;
        this.write = write;
        this.manage = manage;
        this.metadataAccessId = metadataAccessId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDataElementId() {
        return dataElementId;
    }

    public void setDataElementId(String dataElementId) {
        this.dataElementId = dataElementId;
    }

    public boolean getRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean getUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean getExternalize() {
        return externalize;
    }

    public void setExternalize(boolean externalize) {
        this.externalize = externalize;
    }

    public boolean getDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean getWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public boolean getManage() {
        return manage;
    }

    public void setManage(boolean manage) {
        this.manage = manage;
    }

    public int getMetadataAccessId() {
        return metadataAccessId;
    }

    public void setMetadataAccessId(int metadataAccessId) {
        this.metadataAccessId = metadataAccessId;
    }

    //Builder
    public static class Builder {

        private String userId;
        private String dataElementId;
        private boolean read;
        private boolean update;
        private boolean externalize;
        private boolean delete;
        private boolean write;
        private boolean manage;
        private int metadataAccessId;


        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder userId(@NonNull String userId) {
            this.userId = userId;
            return this;
        }

        @NonNull
        public Builder dataElementId(@NonNull String dataElementId) {
            this.dataElementId = dataElementId;
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

        @NonNull
        public Builder metadataAccessId(@NonNull int metadataAccessId) {
            this.metadataAccessId = metadataAccessId;
            return this;
        }

        public UserDataElementAccessJoinModel build() {

            if (dataElementId == null) {
                throw new IllegalStateException("Data Element id must be set");
            }

            if ( userId == null) {
                throw new IllegalStateException("User id must be set");
            }

            return new UserDataElementAccessJoinModel(userId, dataElementId, read, update, externalize, delete, write, manage, metadataAccessId);
        }
    }

}
