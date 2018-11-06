package com.itinordic.a2d2.trackedentityattributeaccess;

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
public interface TrackedEntityAttributeAccessDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityAttributeAccessModel trackedEntityAttributeAccessModel);

    @Query("SELECT * FROM TrackedEntityAttributeModel INNER JOIN tracked_entity_attribute_access_model " +
            "ON TrackedEntityAttributeModel.id = tracked_entity_attribute_access_model.trackedEntityAttributeId " +
            " INNER JOIN MetadataAccessModel ON  tracked_entity_attribute_access_model.metadataAccessId = MetadataAccessModel.id " +
            "WHERE tracked_entity_attribute_access_model.userId = :userId" +
            " AND MetadataAccessModel.read = 1 and  MetadataAccessModel.write = 1")
    public Flowable<List<TrackedEntityAttributeModel>> getTrackedEntityAttributes(String userId);

    @Query("SELECT * FROM tracked_entity_attribute_access_model WHERE userId = :userId AND trackedEntityAttributeId = :trackedEntityAttributeId")
    public Flowable<List<TrackedEntityAttributeAccessModel>> getUserTrackedEntityAttributeAccess (String userId, String trackedEntityAttributeId);

    @Query("SELECT * FROM tracked_entity_attribute_access_model WHERE userId = :userId AND trackedEntityAttributeId = :trackedEntityAttributeId")
    public List<TrackedEntityAttributeAccessModel> syncGetUserTrackedEntityAttributeAccess (String userId, String trackedEntityAttributeId);

    @Delete
    public void delete(TrackedEntityAttributeAccessModel trackedEntityAttributeAccessModel);

    @Update
    void update(TrackedEntityAttributeAccessModel trackedEntityAttributeAccessModel);

    @Query("SELECT * FROM tracked_entity_attribute_access_model")
    public List<TrackedEntityAttributeAccessModel> syncGetAllTrackedEntityAttributeAccess();

}
