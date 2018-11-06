package com.itinordic.a2d2.metadataaccess;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

/**
 * Created by regnatpopulus on 01/10/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
@Dao
public interface DataAccessDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(DataAccessModel dataAccessModel);

    @Delete
    public void delete(DataAccessModel dataAccessModel);

    @Update
    void update(DataAccessModel dataAccessModel);
}
