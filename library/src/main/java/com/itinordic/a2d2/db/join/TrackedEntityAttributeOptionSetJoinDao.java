package com.itinordic.a2d2.db.join;

import com.itinordic.a2d2.optionset.OptionSetModel;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import io.reactivex.Flowable;

/**
 * Created by regnatpopulus on 05/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Dao
public interface TrackedEntityAttributeOptionSetJoinDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityAttributeOptionSetJoinModel trackedEntityAttributeOptionSetJoinModel);

    @Delete
    public void delete(TrackedEntityAttributeOptionSetJoinModel trackedEntityAttributeOptionSetJoinModel);


    @Query("SELECT * FROM OptionSetModel INNER JOIN tracked_entity_attribute_option_set_join_model ON " +
            "tracked_entity_attribute_option_set_join_model.optionSetId = OptionSetModel.id WHERE " +
            "trackedEntityAttributeId = :trackedEntityAttributeId")
    Flowable<List<OptionSetModel>> findByOptionSetByTrackedEntityAttributeId(String trackedEntityAttributeId);
}
