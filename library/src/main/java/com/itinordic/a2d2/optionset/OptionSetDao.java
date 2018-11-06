package com.itinordic.a2d2.optionset;

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
public interface OptionSetDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(OptionSetModel optionSetModel);

    @Delete
    public void delete(OptionSetModel optionSetModel);

    @Update
    void update(OptionSetModel optionSetModel);

    @Query("SELECT * FROM OptionSetModel WHERE id = :id LIMIT 1")
    Flowable<List<OptionSetModel>> findById(String id);

    @Query("SELECT * FROM OptionSetModel WHERE id = :id LIMIT 1")
    List<OptionSetModel> syncFindById(String id);
}
