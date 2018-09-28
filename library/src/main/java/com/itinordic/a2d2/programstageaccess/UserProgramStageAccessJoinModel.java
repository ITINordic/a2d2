package com.itinordic.a2d2.programstageaccess;

import com.itinordic.a2d2.programstage.ProgramStageModel;
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

@Entity(tableName = "user_program_stage_access_join_model",
        primaryKeys = { "userId", "programStageId" },
        foreignKeys = {
                @ForeignKey(entity = UserModel.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = CASCADE),
                @ForeignKey(entity = ProgramStageModel.class,
                        parentColumns = "id",
                        childColumns = "programStageId")
        }, indices = {@Index("programStageId")})
public class UserProgramStageAccessJoinModel {

    @NonNull
    private String userId;
    @NonNull
    private String programStageId;
    private Boolean read;
    private Boolean update;
    private Boolean externalize;
    private Boolean delete;
    private Boolean write;
    private Boolean manage;
    private Boolean dataRead;
    private Boolean dataWrite;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProgramStageId() {
        return programStageId;
    }

    public void setProgramStageId(String programStageId) {
        this.programStageId = programStageId;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public Boolean getUpdate() {
        return update;
    }

    public void setUpdate(Boolean update) {
        this.update = update;
    }

    public Boolean getExternalize() {
        return externalize;
    }

    public void setExternalize(Boolean externalize) {
        this.externalize = externalize;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public Boolean getWrite() {
        return write;
    }

    public void setWrite(Boolean write) {
        this.write = write;
    }

    public Boolean getManage() {
        return manage;
    }

    public void setManage(Boolean manage) {
        this.manage = manage;
    }

    public Boolean getDataRead() {
        return dataRead;
    }

    public void setDataRead(Boolean dataRead) {
        this.dataRead = dataRead;
    }

    public Boolean getDataWrite() {
        return dataWrite;
    }

    public void setDataWrite(Boolean dataWrite) {
        this.dataWrite = dataWrite;
    }
}
