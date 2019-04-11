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

    @Query("SELECT * FROM TrackedEntityInstanceModel")
    Flowable<List<TrackedEntityInstanceModel>> getTrackedEntityInstances();

    @Query("SELECT * FROM TrackedEntityInstanceModel WHERE organisationUnitId IN " +
            "(SELECT OrganisationUnitModel.id FROM OrganisationUnitModel INNER JOIN OrganisationUnitAccessModel " +
            "ON OrganisationUnitModel.id = OrganisationUnitAccessModel.organisationUnitId INNER JOIN MetadataAccessModel " +
            "ON MetadataAccessModel.id = OrganisationUnitAccessModel.metadataAccessId WHERE OrganisationUnitAccessModel.userId = :userId " +
            "AND MetadataAccessModel.read = 1 OR MetadataAccessModel.write = 1)" +
            " AND trackedEntityTypeId = :trackedEntityTypeId")
    Flowable<List<TrackedEntityInstanceModel>> getTrackedEntityInstancesByTypeIdForUserId(String userId, String trackedEntityTypeId);

    @Query("SELECT * FROM TrackedEntityInstanceModel WHERE organisationUnitId IN " +
            "(SELECT OrganisationUnitModel.id FROM OrganisationUnitModel INNER JOIN OrganisationUnitAccessModel " +
            "ON OrganisationUnitModel.id = OrganisationUnitAccessModel.organisationUnitId INNER JOIN MetadataAccessModel " +
            "ON MetadataAccessModel.id = OrganisationUnitAccessModel.metadataAccessId WHERE OrganisationUnitAccessModel.userId = :userId " +
            "AND MetadataAccessModel.read = 1 OR MetadataAccessModel.write = 1)" +
            " AND trackedEntityTypeId = :trackedEntityTypeId")
    List<TrackedEntityInstanceModel> syncGetTrackedEntityInstancesByTypeIdForUserId(String userId, String trackedEntityTypeId);


    @Query("SELECT * FROM TrackedEntityInstanceModel WHERE id = :id LIMIT 1")
    Flowable<List<TrackedEntityInstanceModel>> getTrackedEntityInstancesById(String id);

    @Query("SELECT * FROM TrackedEntityInstanceModel WHERE id = :id LIMIT 1")
    List<TrackedEntityInstanceModel> syncGetTrackedEntityInstancesById(String id);

    @Query("SELECT * FROM TrackedEntityInstanceModel WHERE organisationUnitId IN " +
            "(SELECT OrganisationUnitModel.id FROM OrganisationUnitModel INNER JOIN OrganisationUnitAccessModel " +
            "ON OrganisationUnitModel.id = OrganisationUnitAccessModel.organisationUnitId INNER JOIN MetadataAccessModel " +
            "ON MetadataAccessModel.id = OrganisationUnitAccessModel.metadataAccessId WHERE OrganisationUnitAccessModel.userId = :userId " +
            "AND MetadataAccessModel.read = 1 OR MetadataAccessModel.write = 1)" +
            "AND trackedEntityTypeId IN (SELECT TrackedEntityTypeModel.id FROM TrackedEntityTypeModel " +
            "INNER JOIN user_tracked_entity_type_access_join_model " +
            "ON TrackedEntityTypeModel.id = user_tracked_entity_type_access_join_model.trackedEntityTypeId " +
            "INNER JOIN DataAccessModel ON user_tracked_entity_type_access_join_model.metadataAccessId = DataAccessModel.metadataAccessId " +
            "WHERE userId = :userId AND DataAccessModel.read = 1 AND DataAccessModel.write = 1)")
    Flowable<List<TrackedEntityInstanceModel>> getUserTrackedEntityInstances(String userId);

    @Query("SELECT * FROM TrackedEntityInstanceModel WHERE organisationUnitId IN " +
            "(SELECT OrganisationUnitModel.id FROM OrganisationUnitModel INNER JOIN OrganisationUnitAccessModel " +
            "ON OrganisationUnitModel.id = OrganisationUnitAccessModel.organisationUnitId INNER JOIN MetadataAccessModel " +
            "ON MetadataAccessModel.id = OrganisationUnitAccessModel.metadataAccessId WHERE OrganisationUnitAccessModel.userId = :userId " +
            "AND MetadataAccessModel.read = 1 OR MetadataAccessModel.write = 1)" +
            "AND trackedEntityTypeId IN (SELECT TrackedEntityTypeModel.id FROM TrackedEntityTypeModel " +
            "INNER JOIN user_tracked_entity_type_access_join_model " +
            "ON TrackedEntityTypeModel.id = user_tracked_entity_type_access_join_model.trackedEntityTypeId " +
            "INNER JOIN DataAccessModel ON user_tracked_entity_type_access_join_model.metadataAccessId = DataAccessModel.metadataAccessId " +
            "WHERE userId = :userId AND DataAccessModel.read = 1 AND DataAccessModel.write = 1)")
    List<TrackedEntityInstanceModel> syncGetUserTrackedEntityInstances(String userId);

    @Query("SELECT * FROM TrackedEntityInstanceModel")
    List<TrackedEntityInstanceModel> syncGetTrackedEntityInstances();

}
