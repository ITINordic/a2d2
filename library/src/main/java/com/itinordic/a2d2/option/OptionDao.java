package com.itinordic.a2d2.option;

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
public interface OptionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(OptionModel optionModel);

    @Delete
    public void delete(OptionModel optionModel);

    @Update
    void update(OptionModel optionModel);

    @Query("SELECT * FROM OptionModel WHERE id = :id LIMIT 1")
    Flowable<List<OptionModel>> findById(String id);

    @Query("SELECT * FROM OptionModel WHERE id = :id LIMIT 1")
    List<OptionModel> syncFindById(String id);

    @Query("SELECT * FROM OptionModel WHERE optionSetId = :optionSetId")
    Flowable<List<OptionModel>> findByOptionSetId(String optionSetId);
}
