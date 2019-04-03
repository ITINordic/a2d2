package com.itinordic.a2d2.trackedentityinstanceattributevalue;


import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceIntegerValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstanceIntegerValueModel trackedEntityInstanceIntegerValueModel);

    @Update
    void update(TrackedEntityInstanceIntegerValueModel trackedEntityInstanceIntegerValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceIntegerValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceIntegerValueModel>> getTrackedEntityInstanceIntegerValue(
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceIntegerValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceIntegerValueModel> syncGetTrackedEntityInstanceIntegerValue(
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId);

}
