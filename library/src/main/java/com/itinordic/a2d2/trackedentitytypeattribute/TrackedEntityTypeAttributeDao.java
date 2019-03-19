package com.itinordic.a2d2.trackedentitytypeattribute;

import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;
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

    @Query("SELECT * FROM TrackedEntityAttributeModel INNER JOIN tracked_entity_attribute_access_model " +
            "ON TrackedEntityAttributeModel.id = tracked_entity_attribute_access_model.trackedEntityAttributeId " +
            " INNER JOIN MetadataAccessModel ON  tracked_entity_attribute_access_model.metadataAccessId = MetadataAccessModel.id " +
            " INNER JOIN tracked_entity_type_attribute_model ON  TrackedEntityAttributeModel.id = tracked_entity_type_attribute_model.trackedEntityAttributeId" +
            " WHERE tracked_entity_attribute_access_model.userId = :userId" +
            " AND MetadataAccessModel.read = 1 AND   MetadataAccessModel.write = 1 AND tracked_entity_type_attribute_model.trackedEntityTypeId = :trackedEntityTypeId")
    public Flowable<List<TrackedEntityAttributeModel>> getTrackedEntityAttributesForType(String userId, String trackedEntityTypeId);


}