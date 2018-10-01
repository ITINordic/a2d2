package com.itinordic.a2d2.programaccess;

import com.itinordic.a2d2.program.ProgramModel;
import com.itinordic.a2d2.user.UserModel;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

import static androidx.room.ForeignKey.CASCADE;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Entity(tableName = "user_program_access_join_model",
        primaryKeys = { "userId", "programId" },
        foreignKeys = {
                @ForeignKey(entity = UserModel.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = CASCADE),
                @ForeignKey(entity = ProgramModel.class,
                        parentColumns = "id",
                        childColumns = "programId")
        }, indices = {@Index("programId")})
public class UserProgramAccessJoinModel {

    @NonNull
    private String userId;
    @NonNull
    private String programId;
    private boolean read;
    private boolean update;
    private boolean externalize;
    private boolean delete;
    private boolean write;
    private boolean manage;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
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

    public UserProgramAccessJoinModel(String userId, String programId, boolean read, boolean update, boolean externalize, boolean delete, boolean write, boolean manage) {
        this.userId = userId;
        this.programId = programId;
        this.read = read;
        this.update = update;
        this.externalize = externalize;
        this.delete = delete;
        this.write = write;
        this.manage = manage;
    }

    //Builder
    public static class Builder {

        private String userId;
        private String programId;
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
        public Builder userId(@NonNull String userId) {
            this.userId = userId;
            return this;
        }

        @NonNull
        public Builder programId(@NonNull String programId) {
            this.programId = programId;
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

        public UserProgramAccessJoinModel build() {

            if (programId == null) {
                throw new IllegalStateException("Program id must be set");
            }

            if ( userId == null) {
                throw new IllegalStateException("User id must be set");
            }

            return new UserProgramAccessJoinModel(userId, programId, read, update, externalize, delete, write, manage);
        }
    }
}
