package com.itinordic.a2d2.configuration;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

/**
 * Created by regnatpopulus on 06/04/2019.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
@Dao
public interface MetadataErrorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MetadataErrorModel metadataErrorModel);

    @Delete
    public void delete(MetadataErrorModel metadataErrorModel);

    @Update
    void update(MetadataErrorModel metadataErrorModel);

    @Query("SELECT * FROM MetadataErrorModel")
    Flowable<List<MetadataErrorModel>> getMetadataErrors();
}
