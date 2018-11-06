package com.itinordic.a2d2.trackedentityattribute;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Dao
public interface TrackedEntityAttributeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityAttributeModel trackedEntityAttributeModel);

    @Delete
    public void delete(TrackedEntityAttributeModel trackedEntityAttributeModel);

    @Update
    void update(TrackedEntityAttributeModel trackedEntityAttributeModel);

    @Query("SELECT * FROM TrackedEntityAttributeModel WHERE id = :id LIMIT 1")
    Flowable<List<TrackedEntityAttributeModel>> findById(String id);

    @Query("SELECT * FROM TrackedEntityAttributeModel WHERE id = :id LIMIT 1")
    List<TrackedEntityAttributeModel> syncFindById(String id);

}
