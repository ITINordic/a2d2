package com.itinordic.a2d2.programstagedataelement;

import com.itinordic.a2d2.dataelement.DataElementModel;
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

@Entity(tableName = "user_program_stage_data_element_join_model",
        primaryKeys = { "userId", "programStageId", "dataElementId" },
        foreignKeys = {
                @ForeignKey(entity = UserModel.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = CASCADE),
                @ForeignKey(entity = ProgramStageModel.class,
                        parentColumns = "id",
                        childColumns = "programStageId"),
                @ForeignKey(entity = DataElementModel.class,
                        parentColumns = "id",
                        childColumns = "dataElementId")
        }, indices = {@Index("dataElementId"), @Index("programStageId")})

public class UserProgramStageDataElementAccessJoinModel {

    @NonNull
    private String userId;
    @NonNull
    private String programStageId;
    @NonNull
    private String dataElementId;
    private Boolean read;
    private Boolean update;
    private Boolean externalize;
    private Boolean delete;
    private Boolean write;
    private Boolean manage;

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

    public String getDataElementId() {
        return dataElementId;
    }

    public void setDataElementId(String dataElementId) {
        this.dataElementId = dataElementId;
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
}
