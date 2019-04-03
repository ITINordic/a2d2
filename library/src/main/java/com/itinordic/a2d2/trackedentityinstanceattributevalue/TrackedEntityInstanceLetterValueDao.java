package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceLetterValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstanceLetterValueModel trackedEntityInstanceLetterValueModel);

    @Update
    void update(TrackedEntityInstanceLetterValueModel trackedEntityInstanceLetterValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceLetterValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceLetterValueModel>> getTrackedEntityInstanceLetterValue(
                                                                                                String trackedEntityAttributeId,
                                                                                                String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceLetterValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceLetterValueModel> syncGetTrackedEntityInstanceLetterValue(
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId);

}
