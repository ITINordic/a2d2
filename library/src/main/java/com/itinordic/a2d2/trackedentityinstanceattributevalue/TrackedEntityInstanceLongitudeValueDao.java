package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceLongitudeValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstanceLongitudeValueModel trackedEntityInstanceLongitudeValueModel);

    @Update
    void update(TrackedEntityInstanceLongitudeValueModel trackedEntityInstanceLongitudeValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceLongitudeValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceLongitudeValueModel>> getTrackedEntityInstanceLongitudeValueModel(String trackedEntityTypeId,
                                                                                                  String trackedEntityAttributeId,
                                                                                                  String trackedEntityInstanceId);

    List<TrackedEntityInstanceLongitudeValueModel> syncGetTrackedEntityInstanceLongitudeValue(String trackedEntityTypeId,
                                                                                       String trackedEntityAttributeId,
                                                                                       String trackedEntityInstanceId);
}
