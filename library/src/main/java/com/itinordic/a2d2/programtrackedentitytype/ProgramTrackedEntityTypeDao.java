package com.itinordic.a2d2.programtrackedentitytype;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import io.reactivex.Flowable;

/**
 * Created by regnatpopulus on 01/10/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Dao
public interface ProgramTrackedEntityTypeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(ProgramTrackedEntityTypeJoinModel programTrackedEntityTypeJoinModel);

    @Query("SELECT * FROM tracked_entity_type_program_join_model")
    Flowable<List<ProgramTrackedEntityTypeJoinModel>> getProgramTrackedEntityTypeJoinModel();

    @Query("SELECT * FROM tracked_entity_type_program_join_model where programId IN (:programIds)")
    Flowable<List<ProgramTrackedEntityTypeJoinModel>> getProgramTrackedEntityTypeJoinModelForPrograms(String [] programIds);

    @Query("SELECT * FROM tracked_entity_type_program_join_model where programId = :programId AND trackedEntityTypeId = :trackedEntityTypeId LIMIT 1")
    Flowable<List<ProgramTrackedEntityTypeJoinModel>> getProgramTrackedEntityTypeJoinModelByIds(String programId, String trackedEntityTypeId);

    @Query("SELECT * FROM tracked_entity_type_program_join_model where programId = :programId AND trackedEntityTypeId = :trackedEntityTypeId LIMIT 1")
    List<ProgramTrackedEntityTypeJoinModel> syncGetProgramTrackedEntityTypeJoinModelByIds(String programId, String trackedEntityTypeId);

}