package com.itinordic.a2d2.trackedentityinstance;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

/**
 * Created by regnatpopulus on 03/04/2019.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
@Dao
public interface TrackedEntityInstanceDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstanceModel trackedEntityInstanceModel);

    @Update
    void update(TrackedEntityInstanceModel trackedEntityInstanceModel);

    @Query("SELECT * FROM TrackedEntityInstanceModel WHERE trackedEntityTypeId = :trackedEntityTypeId")
    Flowable<List<TrackedEntityInstanceModel>> getTrackedEntityInstancesByTypeId(String trackedEntityTypeId);

    @Query("SELECT * FROM TrackedEntityInstanceModel WHERE id = :id LIMIT 1")
    Flowable<List<TrackedEntityInstanceModel>> getTrackedEntityInstancesById(String id);


}
