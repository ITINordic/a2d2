package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceDateValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstanceDateValueModel trackedEntityInstanceDateValueModel);

    @Update
    void update(TrackedEntityInstanceDateValueModel trackedEntityInstanceDateValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceDateValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceDateValueModel>> getTrackedEntityInstanceDateValue(
            String trackedEntityAttributeId,
            String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceDateValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceDateValueModel> syncGetTrackedEntityInstanceDateValue(
            String trackedEntityAttributeId,
            String trackedEntityInstanceId);

}
