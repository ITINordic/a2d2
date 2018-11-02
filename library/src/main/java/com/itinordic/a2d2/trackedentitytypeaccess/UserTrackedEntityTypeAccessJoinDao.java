package com.itinordic.a2d2.trackedentitytypeaccess;

import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import io.reactivex.Flowable;

/**
 * Created by regnatpopulus on 01/10/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Dao
public abstract class UserTrackedEntityTypeAccessJoinDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract void insert(UserTrackedEntityTypeAccessJoinModel userTrackedEntityTypeAccessJoinModel);


    @Query("SELECT * FROM TrackedEntityTypeModel INNER JOIN user_tracked_entity_type_access_join_model " +
            "ON TrackedEntityTypeModel.id = user_tracked_entity_type_access_join_model.trackedEntityTypeId " +
            "INNER JOIN DataAccessModel ON user_tracked_entity_type_access_join_model.metadataAccessId = DataAccessModel.metadataAccessId " +
            "WHERE userId = :userId AND DataAccessModel.read = 1 AND DataAccessModel.write = 1 ")
    public abstract Flowable<List<TrackedEntityTypeModel>> getUserTrackedEntityModels(String userId);

    @Query("SELECT * FROM user_tracked_entity_type_access_join_model WHERE userId LIKE :userId AND trackedEntityTypeId LIKE :trackedEntityTypeId AND metadataAccessId != :metadataAccessId")
    public abstract Flowable<List<UserTrackedEntityTypeAccessJoinModel>> getPreviousUserTrackedEntityTypeAccessJoinModel(String userId, String trackedEntityTypeId, int metadataAccessId);

    @Delete
    public abstract void delete(UserTrackedEntityTypeAccessJoinModel userTrackedEntityTypeAccessJoinModel);

    @Query("DELETE FROM DataAccessModel WHERE metadataAccessId LIKE(:metadataAccessId)")
    public abstract void deleteDataAccess(int metadataAccessId);

    @Query("DELETE FROM MetadataAccessModel WHERE id LIKE(:id)")
    public abstract void deleteMetaDataAccess(int id);

    @Transaction
    public void insertAndDeleteInTransaction(UserTrackedEntityTypeAccessJoinModel newUserTrackedEntityTypeAccessJoinModel, UserTrackedEntityTypeAccessJoinModel oldUserTrackedEntityTypeAccessJoinModel){

        if(newUserTrackedEntityTypeAccessJoinModel.getMetadataAccessId()!= oldUserTrackedEntityTypeAccessJoinModel.getMetadataAccessId())
        {
            delete(oldUserTrackedEntityTypeAccessJoinModel);
            deleteDataAccess(oldUserTrackedEntityTypeAccessJoinModel.getMetadataAccessId());
            deleteMetaDataAccess(oldUserTrackedEntityTypeAccessJoinModel.getMetadataAccessId());
        }

        insert(newUserTrackedEntityTypeAccessJoinModel);
    }

}
