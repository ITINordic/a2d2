package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceCoordinateValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstanceCoordinateValueModel trackedEntityInstanceCoordinateValueModel);

    @Update
    void update(TrackedEntityInstanceCoordinateValueModel trackedEntityInstanceCoordinateValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceCoordinateValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceCoordinateValueModel>> getTrackedEntityInstanceCoordinateValue(
                                                                                               String trackedEntityAttributeId,
                                                                                               String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceCoordinateValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceCoordinateValueModel> syncGetTrackedEntityInstanceCoordinateValue(
                                                                                            String trackedEntityAttributeId,
                                                                                            String trackedEntityInstanceId);
}
