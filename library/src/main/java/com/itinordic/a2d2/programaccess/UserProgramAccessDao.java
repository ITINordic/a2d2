package com.itinordic.a2d2.programaccess;

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
public interface UserProgramAccessDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserProgramAccessJoinModel userProgramAccessJoinModel);

    @Query("SELECT * FROM user_program_access_join_model where userId = :userId")
    Flowable<List<UserProgramAccessJoinModel>> getUserProgramAccessJoinModel(String userId);
}
