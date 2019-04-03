package com.itinordic.a2d2.trackedentityinstanceattributevalue;


import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceDateTimeValueDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstanceDateTimeValueModel trackedEntityInstanceDatetimeValueModel);

    @Update
    void update(TrackedEntityInstanceDateTimeValueModel trackedEntityInstanceDatetimeValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceDateTimeValueModel where  trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceEmailValueModel>> getTrackedEntityInstanceDateTimeValue(
                                                                                               String trackedEntityAttributeId,
                                                                                               String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceDateTimeValueModel where  trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceDateTimeValueModel> syncGetTrackedEntityInstanceDateTimeValue(
                                                                                            String trackedEntityAttributeId,
                                                                                            String trackedEntityInstanceId);
}
