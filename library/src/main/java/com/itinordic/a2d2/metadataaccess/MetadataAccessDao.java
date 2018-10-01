package com.itinordic.a2d2.metadataaccess;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import io.reactivex.Flowable;

/**
 * Created by regnatpopulus on 01/10/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
@Dao
public interface MetadataAccessDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(MetadataAccessModel metadataAccessModel);

    @Query("SELECT * FROM MetadataAccessModel where id = :rowId")
    Flowable<List<MetadataAccessModel>> getUserProgramAccessJoinModel(long rowId);

}
