package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceBooleanVaueDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstanceBooleanVaueModel trackedEntityInstanceBooleanValueModel);

    @Update
    void update(TrackedEntityInstanceBooleanVaueModel trackedEntityInstanceBooleanValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceBooleanVaueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceBooleanVaueModel>> getTrackedEntityInstanceBooleanValue(String trackedEntityTypeId,
                                                                                        String trackedEntityAttributeId,
                                                                                        String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceBooleanVaueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceBooleanVaueModel> syncGetTrackedEntityInstanceBooleanValue(String trackedEntityTypeId,
                                                                                  String trackedEntityAttributeId,
                                                                                  String trackedEntityInstanceId);

}
