package com.itinordic.a2d2.trackedentityinstanceattributevalue;


import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceDateTimeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstanceDatetimeValueModel trackedEntityInstanceDatetimeValueModel);

    @Update
    void update(TrackedEntityInstanceDatetimeValueModel trackedEntityInstanceDatetimeValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceDatetimeValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceEmailValueModel>> getTrackedEntityInstanceLongTextValue(String trackedEntityTypeId,
                                                                                               String trackedEntityAttributeId,
                                                                                               String trackedEntityInstanceId);

    List<TrackedEntityInstanceDatetimeValueModel> syncGetTrackedEntityInstanceDateTimeValue(String trackedEntityTypeId,
                                                                                    String trackedEntityAttributeId,
                                                                                    String trackedEntityInstanceId);
}
