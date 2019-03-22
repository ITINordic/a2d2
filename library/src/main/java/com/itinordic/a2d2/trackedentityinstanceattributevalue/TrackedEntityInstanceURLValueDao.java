package com.itinordic.a2d2.trackedentityinstanceattributevalue;


import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceURLValueDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstanceURLValueModel trackedEntityInstanceURLValueModel);

    @Update
    void update(TrackedEntityInstanceURLValueModel trackedEntityInstanceURLValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceURLValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceURLValueModel>> getTrackedEntityInstanceURLValue(String trackedEntityTypeId,
                                                                                        String trackedEntityAttributeId,
                                                                                        String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceURLValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceURLValueModel> syncGetTrackedEntityInstanceURLValue(String trackedEntityTypeId,
                                                                                  String trackedEntityAttributeId,
                                                                                  String trackedEntityInstanceId);
}
