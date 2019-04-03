package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceBooleanValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstanceBooleanValueModel trackedEntityInstanceBooleanValueModel);

    @Update
    void update(TrackedEntityInstanceBooleanValueModel trackedEntityInstanceBooleanValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceBooleanValueModel where  trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceBooleanValueModel>> getTrackedEntityInstanceBooleanValue(
                                                                                                String trackedEntityAttributeId,
                                                                                                String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceBooleanValueModel where  trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceBooleanValueModel> syncGetTrackedEntityInstanceBooleanValue(
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId);

}
