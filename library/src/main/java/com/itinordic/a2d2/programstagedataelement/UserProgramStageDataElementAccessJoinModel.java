package com.itinordic.a2d2.programstagedataelement;

import com.itinordic.a2d2.dataelement.DataElementModel;
import com.itinordic.a2d2.programstage.ProgramStageModel;
import com.itinordic.a2d2.user.UserModel;

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
        }, indices = {@Index("dataElementId")})

public class UserProgramStageDataElementAccessJoinModel {

    private String userId;
    private String programStageId;
    private String dataElementId;
    private Boolean read;
    private Boolean update;
    private Boolean externalize;
    private Boolean delete;
    private Boolean write;
    private Boolean manage;

}
