package com.itinordic.a2d2.metadataaccess;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

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
}
