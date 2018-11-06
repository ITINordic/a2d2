package com.itinordic.a2d2.optionaccess;

import com.itinordic.a2d2.option.OptionModel;

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
public interface OptionAccessDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(OptionAccessModel optionAccessModel);

    @Delete
    public void delete(OptionAccessModel optionAccessModel);

    @Update
    void update(OptionAccessModel optionAccessModel);

    @Query("SELECT * FROM option_access_model WHERE userId = :userId")
    Flowable<List<OptionAccessModel>> findById(String userId);

    @Query("SELECT * FROM option_access_model WHERE userId = :userId AND optionId = :optionId  LIMIT 1")
    Flowable<List<OptionAccessModel>> getUserOptionAccess(String userId, String optionId);

    @Query("SELECT * FROM option_access_model WHERE userId = :userId AND optionId = :optionId  LIMIT 1")
    List<OptionAccessModel> syncGetUserOptionAccess(String userId, String optionId);

    @Query("SELECT * FROM OptionModel INNER JOIN option_access_model ON OptionModel.id = option_access_model.optionId " +
            "INNER JOIN MetadataAccessModel ON MetadataAccessModel.id = option_access_model.metadataAccessId WHERE " +
            "option_access_model.userId = :userId AND MetadataAccessModel.read = 1 AND MetadataAccessModel.write = 1" )
    public Flowable<List<OptionModel>> getOptions(String userId);
}
