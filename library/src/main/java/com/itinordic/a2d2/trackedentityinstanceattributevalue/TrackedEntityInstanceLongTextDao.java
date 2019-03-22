package com.itinordic.a2d2.trackedentityinstanceattributevalue;


import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceLongTextDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstanceLongTextValueModel trackedEntityInstanceLongTextValueModel);

    @Update
    void update(TrackedEntityInstanceLongTextValueModel trackedEntityInstanceLongTextValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceLongTextValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceLongTextValueModel>> getTrackedEntityInstanceLongTextValue(String trackedEntityTypeId,
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId);

    List<TrackedEntityInstanceAgeValueModel> syncGetTrackedEntityInstanceAgeValue(String trackedEntityTypeId,
                                                                                  String trackedEntityAttributeId,
                                                                                  String trackedEntityInstanceId);
}
