package com.itinordic.a2d2.programdataccess;

import com.itinordic.a2d2.program.ProgramModel;
import com.itinordic.a2d2.user.UserModel;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

import static androidx.room.ForeignKey.CASCADE;

/**
 * Created by regnatpopulus on 01/10/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Entity(tableName = "user_program_data_access_join_model",
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

public class UserProgramDataAccessJoinModel {

    @NonNull
    private String userId;
    @NonNull
    private String programId;
    private boolean read;
    private boolean write;

    public UserProgramDataAccessJoinModel(String userId, String programId, boolean read, boolean write) {
        this.userId = userId;
        this.programId = programId;
        this.read = read;
        this.write = write;
    }

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

    public void setRead(boolean read) {
        this.read = read;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public boolean isRead() {
        return read;
    }

    public boolean isWrite() {
        return write;
    }

    //Builder
    public static class Builder {

        private String userId;
        private String programId;
        private  boolean read;
        private  boolean write;

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
        public Builder write(@NonNull boolean write) {
            this.write = write;
            return this;
        }



        public UserProgramDataAccessJoinModel build() {

            if (programId == null) {
                throw new IllegalStateException("Program id must be set");
            }

            if ( userId == null) {
                throw new IllegalStateException("User id must be set");
            }

            return new UserProgramDataAccessJoinModel(userId, programId, read, write);
        }
    }
}
