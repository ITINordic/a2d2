package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceUnitIntervalValueDao {

    void insert(TrackedEntityInstanceUnitIntervalValueModel trackedEntityInstanceUnitIntervalValueModel);

    @Update
    void update(TrackedEntityInstanceUnitIntervalValueModel trackedEntityInstanceUnitIntervalValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceUnitIntervalValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceUnitIntervalValueModel>> getTrackedEntityInstanceUnitIntervalValue(String trackedEntityTypeId,
                                                                                        String trackedEntityAttributeId,
                                                                                        String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceUnitIntervalValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")

    List<TrackedEntityInstanceUnitIntervalValueModel> syncGetTrackedEntityInstanceUnitIntervalValue(String trackedEntityTypeId,
                                                                                  String trackedEntityAttributeId,
                                                                                  String trackedEntityInstanceId);
}
