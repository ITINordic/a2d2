package com.itinordic.a2d2.programmeaccess;

import com.itinordic.a2d2.program.ProgramModel;
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

    private String userId;
    private String programId;
    private Boolean read;
    private Boolean update;
    private Boolean externalize;
    private Boolean delete;
    private Boolean write;
    private Boolean manage;

}
