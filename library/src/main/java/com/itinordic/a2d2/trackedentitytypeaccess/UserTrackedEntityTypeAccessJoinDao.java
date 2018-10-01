package com.itinordic.a2d2.trackedentitytypeaccess;

import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

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
public interface UserTrackedEntityTypeAccessJoinDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserTrackedEntityTypeAccessJoinModel userTrackedEntityTypeAccessJoinModel);


    @Query("SELECT * FROM TrackedEntityTypeModel INNER JOIN user_tracked_entity_type_access_join_model " +
            "ON TrackedEntityTypeModel.id = user_tracked_entity_type_access_join_model.trackedEntityTypeId " +
            "INNER JOIN DataAccessModel ON user_tracked_entity_type_access_join_model.metadataAccessId = DataAccessModel.metadataAccessId " +
            "WHERE userId = :userId AND DataAccessModel.read = 1 AND DataAccessModel.write = 1 ")
    Flowable<List<TrackedEntityTypeModel>> getUserTrackedEntityModels(String userId);

}
