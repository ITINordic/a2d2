package com.itinordic.a2d2.trackedentitytype;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

/**
 * Created by regnatpopulus on 30/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Dao
public interface TrackedEntityTypeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityTypeModel trackedEntityTypeModel);

    @Query("SELECT * FROM TrackedEntityTypeModel where id = :trackedEntityTypeId LIMIT 1")
    Flowable<List<TrackedEntityTypeModel>> getTrackedEntityTypeById(String trackedEntityTypeId);

    @Update
    void update(TrackedEntityTypeModel trackedEntityTypeModel);


}
