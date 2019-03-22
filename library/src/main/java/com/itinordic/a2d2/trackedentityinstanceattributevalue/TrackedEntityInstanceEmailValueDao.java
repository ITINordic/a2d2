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

    @Query("SELECT * FROM TrackedEntityInstanceEmailValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceEmailValueModel>> getTrackedEntityInstanceEmailValue(String trackedEntityTypeId,
                                                                                                  String trackedEntityAttributeId,
                                                                                                  String trackedEntityInstanceId);

    List<TrackedEntityInstanceEmailValueModel> syncGetTrackedEntityInstanceEmailValue(String trackedEntityTypeId,
                                                                                  String trackedEntityAttributeId,
                                                                                  String trackedEntityInstanceId);
}
