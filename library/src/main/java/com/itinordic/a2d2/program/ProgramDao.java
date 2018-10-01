package com.itinordic.a2d2.program;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
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
    void insert(ProgramModel userModel);

    @Query("SELECT * FROM ProgramModel")
    Flowable<List<ProgramModel>> getPrograms();

    @Query("SELECT * FROM ProgramModel WHERE id IN (:programIds)")
    Flowable<List<ProgramModel>> getPrograms(String[] programIds);
}
