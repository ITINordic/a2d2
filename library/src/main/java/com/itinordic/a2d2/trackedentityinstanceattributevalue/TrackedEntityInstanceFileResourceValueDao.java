package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceFileResourceValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstanceFileResourceValueModel trackedEntityInstanceFileResourceValueModel);

    @Update
    void update(TrackedEntityInstanceFileResourceValueModel trackedEntityInstanceFileResourceValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceFileResourceValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceFileResourceValueModel>> getTrackedEntityInstanceFileResourceValueModel(String trackedEntityTypeId,
                                                                                            String trackedEntityAttributeId,
                                                                                            String trackedEntityInstanceId);

    List<TrackedEntityInstanceEmailValueModel> syncGetTrackedEntityInstanceFileResourceValueModel(String trackedEntityTypeId,
                                                                                      String trackedEntityAttributeId,
                                                                                      String trackedEntityInstanceId);
}
