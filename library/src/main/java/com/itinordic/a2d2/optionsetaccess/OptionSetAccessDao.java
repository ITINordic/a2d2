package com.itinordic.a2d2.optionsetaccess;

import com.itinordic.a2d2.optionset.OptionSetModel;

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
public interface OptionSetAccessDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(OptionSetAccessModel optionSetAccessModel);

    @Delete
    public void delete(OptionSetAccessModel optionSetAccessModel);

    @Update
    void update(OptionSetAccessModel optionSetAccessModel);

    @Query("SELECT * FROM optionset_access_model WHERE userId = :userId LIMIT 1")
    Flowable<OptionSetAccessModel> findById(String userId);

    @Query("SELECT * FROM optionset_access_model WHERE userId = :userId AND optionSetId = :optionSetId  LIMIT 1")
    Flowable<List<OptionSetAccessModel>> getUserOptionSetAccess(String userId, String optionSetId);

    @Query("SELECT * FROM optionset_access_model WHERE userId = :userId AND optionSetId = :optionSetId  LIMIT 1")
    List<OptionSetAccessModel> syncGetUserOptionSetAccess(String userId, String optionSetId);

    @Query("SELECT * FROM OptionSetModel INNER JOIN optionset_access_model ON OptionSetModel.id = optionset_access_model.optionSetId " +
            "INNER JOIN MetadataAccessModel ON MetadataAccessModel.id = optionset_access_model.metadataAccessId WHERE " +
            "optionset_access_model.userId = :userId AND MetadataAccessModel.read = 1 AND MetadataAccessModel.write = 1")
    public Flowable<List<OptionSetModel>> getOptionSets(String userId);

}
