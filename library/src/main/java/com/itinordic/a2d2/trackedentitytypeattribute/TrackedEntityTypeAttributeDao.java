package com.itinordic.a2d2.trackedentitytypeattribute;

import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

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
public interface TrackedEntityTypeAttributeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityTypeAttribute trackedEntityTypeAttribute);

    @Query("SELECT * FROM TrackedEntityAttributeModel INNER JOIN tracked_entity_type_attribute_model " +
            "ON TrackedEntityAttributeModel.id = tracked_entity_type_attribute_model.trackedEntityAttributeId " +
            "INNER JOIN TrackedEntityTypeModel ON tracked_entity_type_attribute_model.trackedEntityTypeId = " +
            "TrackedEntityTypeModel.id WHERE TrackedEntityTypeModel.id = :TrackedEntityTypeId")
    public abstract Flowable<List<TrackedEntityTypeModel>> getTrackedEntityTypeAttributes(String TrackedEntityTypeId);

    @Delete
    public abstract void delete(TrackedEntityTypeAttribute trackedEntityTypeAttribute);

    @Update
    void update(TrackedEntityTypeAttribute TrackedEntityTypeAttribute);

}
