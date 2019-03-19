package com.itinordic.a2d2.program;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Dao
public interface ProgramDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(ProgramModel programModel);

    @Update
    void update(ProgramModel programModel);

    @Query("SELECT * FROM ProgramModel")
    Flowable<List<ProgramModel>> getPrograms();

    @Query("SELECT * FROM ProgramModel INNER JOIN user_program_access_join_model ON ProgramModel.id = user_program_access_join_model.programId " +
            "INNER JOIN DataAccessModel ON user_program_access_join_model.metadataAccessId = DataAccessModel.metadataAccessId " +
            "WHERE userId = :userId AND DataAccessModel.read = 1 AND DataAccessModel.write = 1 ")
    Flowable<List<ProgramModel>> getUserProgramModels(String userId);


    @Query("SELECT * FROM ProgramModel WHERE id IN (:programIds)")
    Flowable<List<ProgramModel>> getPrograms(String[] programIds);

    @Query("SELECT * FROM ProgramModel WHERE id = :programId LIMIT 1")
    Flowable<List<ProgramModel>> getProgramById(String programId);

    @Query("SELECT * FROM ProgramModel WHERE id = :programId LIMIT 1")
    List<ProgramModel> syncGetProgramById(String programId);
}
