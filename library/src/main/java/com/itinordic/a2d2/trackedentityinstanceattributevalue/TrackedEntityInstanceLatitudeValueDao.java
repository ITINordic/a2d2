package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceLatitudeValueDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstanceLatitudeValueModel trackedEntityInstanceLatitudeValueModel);

    @Update
    void update(TrackedEntityInstanceLatitudeValueModel trackedEntityInstanceLatitudeValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceLatitudeValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceLatitudeValueModel>> getTrackedEntityInstanceLatitudeValue(String trackedEntityTypeId,
                                                                                                  String trackedEntityAttributeId,
                                                                                                  String trackedEntityInstanceId);

    List<TrackedEntityInstanceLatitudeValueModel> syncGetTrackedEntityInstanceLatitudeValue(String trackedEntityTypeId,
                                                                                              String trackedEntityAttributeId,
                                                                                              String trackedEntityInstanceId);
}
