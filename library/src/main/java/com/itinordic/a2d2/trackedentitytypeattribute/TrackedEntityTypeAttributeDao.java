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
    void insert(TrackedEntityTypeAttributeModel trackedEntityTypeAttributeModel);

    @Query("SELECT * FROM tracked_entity_type_attribute_model WHERE id LIKE :id LIMIT 1")
    Flowable<TrackedEntityTypeAttributeModel> findById(String id);

    @Query("SELECT * FROM tracked_entity_type_attribute_model WHERE trackedEntityTypeId = :trackedEntityTypeId " +
            "AND trackedEntityAttributeId = :trackedEntityAttributeId LIMIT 1")
    Flowable<List<TrackedEntityTypeAttributeModel>> getTrackedEntityTypeAttribute(String trackedEntityTypeId, String trackedEntityAttributeId);

    @Query("SELECT * FROM tracked_entity_type_attribute_model WHERE trackedEntityTypeId = :trackedEntityTypeId " +
            "AND trackedEntityAttributeId = :trackedEntityAttributeId LIMIT 1")
    List<TrackedEntityTypeAttributeModel> syncGetTrackedEntityTypeAttribute(String trackedEntityTypeId, String trackedEntityAttributeId);

    @Delete
    public void delete(TrackedEntityTypeAttributeModel trackedEntityTypeAttributeModel);

    @Update
    void update(TrackedEntityTypeAttributeModel trackedEntityTypeAttributeModel);

}
