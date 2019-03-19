package com.itinordic.a2d2.programaccess;

import com.itinordic.a2d2.metadataaccess.MetadataAccessModel;
import com.itinordic.a2d2.program.ProgramModel;
import com.itinordic.a2d2.trackedentitytypeaccess.UserTrackedEntityTypeAccessJoinModel;
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
        primaryKeys = { "userId", "programId","metadataAccessId" },
        foreignKeys = {
                @ForeignKey(entity = UserModel.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = CASCADE),
                @ForeignKey(entity = ProgramModel.class,
                        parentColumns = "id",
                        childColumns = "programId"),
                @ForeignKey(entity = MetadataAccessModel.class,
                        parentColumns = "id",
                        childColumns = "metadataAccessId")
        }, indices = {@Index("userId"), @Index("programId"),@Index("metadataAccessId")})
public class UserProgramAccessJoinModel {

    @NonNull
    private String userId;
    @NonNull
    private String programId;
    @NonNull
    private int metadataAccessId;

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

    public int getMetadataAccessId() {
        return metadataAccessId;
    }

    public void setMetadataAccessId(int metadataAccessId) {
        this.metadataAccessId = metadataAccessId;
    }

    public UserProgramAccessJoinModel(String userId, String programId, int metadataAccessId) {
        this.userId = userId;
        this.programId = programId;
        this.metadataAccessId = metadataAccessId;

    }

    //Builder
    public static class Builder {

        private String userId;
        private String programId;
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
        public Builder programId(@NonNull String programId) {
            this.programId = programId;
            return this;
        }

        @NonNull
        public Builder metadataAccessId(@NonNull int metadataAccessId) {
            this.metadataAccessId = metadataAccessId;
            return this;
        }


        public UserProgramAccessJoinModel build() {

            if (programId == null) {
                throw new IllegalStateException("Program id must be set");
            }

            if ( userId == null) {
                throw new IllegalStateException("User id must be set");
            }

            return new UserProgramAccessJoinModel(userId, programId,metadataAccessId);
        }
    }
}
