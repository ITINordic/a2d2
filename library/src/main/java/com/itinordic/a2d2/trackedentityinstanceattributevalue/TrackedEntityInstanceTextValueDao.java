package com.itinordic.a2d2.trackedentityinstanceattributevalue;


import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceTextValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstanceTextValueModel trackedEntityInstanceTextValueModel);

    @Update
    void update(TrackedEntityInstanceTextValueModel trackedEntityInstanceTextValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceTextValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceTextValueModel>> getTrackedEntityInstanceTextValue(String trackedEntityTypeId,
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId);

}
