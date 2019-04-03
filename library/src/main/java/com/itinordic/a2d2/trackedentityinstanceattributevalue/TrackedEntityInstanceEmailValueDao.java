package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceEmailValueDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstanceEmailValueModel trackedEntityInstanceEmailValueModel);

    @Update
    void update(TrackedEntityInstanceEmailValueModel trackedEntityInstanceEmailValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceEmailValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceEmailValueModel>> getTrackedEntityInstanceEmailValue(
                                                                                                  String trackedEntityAttributeId,
                                                                                                  String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceEmailValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceEmailValueModel> syncGetTrackedEntityInstanceEmailValue(
                                                                                  String trackedEntityAttributeId,
                                                                                  String trackedEntityInstanceId);
}
