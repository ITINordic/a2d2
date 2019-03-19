package com.itinordic.a2d2.programtrackedentitytype;

import com.itinordic.a2d2.program.ProgramModel;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

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

@Entity(tableName = "tracked_entity_type_program_join_model",
        primaryKeys = { "trackedEntityTypeId", "programId" },
        foreignKeys = {
                @ForeignKey(entity = TrackedEntityTypeModel.class,
                        parentColumns = "id",
                        childColumns = "trackedEntityTypeId",
                        onDelete = CASCADE),
                @ForeignKey(entity = ProgramModel.class,
                        parentColumns = "id",
                        childColumns = "programId")
        }, indices = {@Index("programId")})
public class ProgramTrackedEntityTypeJoinModel {

    @NonNull
    private String trackedEntityTypeId;
    @NonNull
    private String programId;

    public String getTrackedEntityTypeId() {
        return trackedEntityTypeId;
    }

    public void setTrackedEntityTypeId(String trackedEntityTypeId) {
        this.trackedEntityTypeId = trackedEntityTypeId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public ProgramTrackedEntityTypeJoinModel(String trackedEntityTypeId, String programId) {
        this.trackedEntityTypeId = trackedEntityTypeId;
        this.programId = programId;
    }

    //Builder
    public static class Builder {

        private String trackedEntityTypeId;
        private String programId;

        public Builder() {
            // empty constructor
        }



        @NonNull
        public Builder trackedEntityTypeId(@NonNull String trackedEntityTypeId) {
            this.trackedEntityTypeId = trackedEntityTypeId;
            return this;
        }

        @NonNull
        public Builder programId(@NonNull String programId) {
            this.programId = programId;
            return this;
        }



        public ProgramTrackedEntityTypeJoinModel build() {


            if ( programId == null) {
                throw new IllegalStateException("programId must be set");
            }



            if ( trackedEntityTypeId == null) {
                throw new IllegalStateException("trackedEntityTypeId must be set");
            }



            return new ProgramTrackedEntityTypeJoinModel(trackedEntityTypeId, programId);
        }
    }
}
