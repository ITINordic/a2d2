package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceAgeValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstanceAgeValueModel trackedEntityInstanceAgeValueModel);

    @Update
    void update(TrackedEntityInstanceAgeValueModel trackedEntityInstanceAgeValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceAgeValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceAgeValueModel>> getTrackedEntityInstanceAgeValue(String trackedEntityTypeId,
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceAgeValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceAgeValueModel> syncGetTrackedEntityInstanceAgeValue(String trackedEntityTypeId,
                                                                                  String trackedEntityAttributeId,
                                                                                  String trackedEntityInstanceId);

}
