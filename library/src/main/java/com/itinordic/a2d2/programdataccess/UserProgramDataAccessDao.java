package com.itinordic.a2d2.programdataccess;

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
public interface UserProgramDataAccessDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserProgramDataAccessJoinModel userProgramDataAccessJoinModel);

    @Query("SELECT * FROM user_program_data_access_join_model where userId = :userId")
    Flowable<List<UserProgramDataAccessJoinModel>> getUserProgramDataAccessJoinModel(String userId);


}
