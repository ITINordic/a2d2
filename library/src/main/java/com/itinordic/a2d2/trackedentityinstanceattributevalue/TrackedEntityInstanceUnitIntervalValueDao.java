package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceUnitIntervalValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstanceUnitIntervalValueModel trackedEntityInstanceUnitIntervalValueModel);

    @Update
    void update(TrackedEntityInstanceUnitIntervalValueModel trackedEntityInstanceUnitIntervalValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceUnitIntervalValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceUnitIntervalValueModel>> getTrackedEntityInstanceUnitIntervalValue(
                                                                                        String trackedEntityAttributeId,
                                                                                        String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceUnitIntervalValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceUnitIntervalValueModel> syncGetTrackedEntityInstanceUnitIntervalValue(
                                                                                  String trackedEntityAttributeId,
                                                                                  String trackedEntityInstanceId);
}
