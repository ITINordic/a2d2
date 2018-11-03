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

    @Query("SELECT * FROM user_tracked_entity_type_access_join_model WHERE userId LIKE :userId")
    public abstract Flowable<List<UserTrackedEntityTypeAccessJoinModel>> getCurrentUserTrackedEntityTypeAccessJoinModel(String userId);

    @Delete
    public abstract void delete(List<UserTrackedEntityTypeAccessJoinModel> userTrackedEntityTypeAccessJoinModels);

    @Query("DELETE FROM DataAccessModel WHERE metadataAccessId IN(:metadataAccessIds)")
    public abstract void deleteDataAccess(int[] metadataAccessIds );

    @Query("DELETE FROM MetadataAccessModel WHERE id IN(:ids)")
    public abstract void deleteMetaDataAccess(int[] ids);

    @Transaction
    public void deleteCurrentTrackedEntityTypeAccessInTransaction(List<UserTrackedEntityTypeAccessJoinModel> currentUserTrackedEntityTypeAccessJoinModel){

        int[] metadataAccessIds;
        metadataAccessIds = new int[currentUserTrackedEntityTypeAccessJoinModel.size()];

        for (int index = 0; index < currentUserTrackedEntityTypeAccessJoinModel.size(); index++){
            metadataAccessIds[index] = currentUserTrackedEntityTypeAccessJoinModel.get(index).getMetadataAccessId();
        }

        delete(currentUserTrackedEntityTypeAccessJoinModel);
        deleteDataAccess(metadataAccessIds);
        deleteMetaDataAccess(metadataAccessIds);
    }

}
