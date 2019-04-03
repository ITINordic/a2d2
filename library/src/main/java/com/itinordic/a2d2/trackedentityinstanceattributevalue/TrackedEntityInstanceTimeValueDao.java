package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceTimeValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstanceTimeValueModel trackedEntityInstanceTimeValueModel);

    @Update
    void update(TrackedEntityInstanceTimeValueModel trackedEntityInstanceTimeValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceTimeValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceTimeValueModel>> getTrackedEntityInstanceTimeValue(
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceTimeValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceTimeValueModel> syncGetTrackedEntityInstanceTimeValue(
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId);
}
