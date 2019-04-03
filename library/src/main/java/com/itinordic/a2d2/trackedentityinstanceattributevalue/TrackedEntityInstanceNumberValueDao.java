package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceNumberValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstanceNumberValueModel trackedEntityInstanceNumberValueModel);

    @Update
    void update(TrackedEntityInstanceNumberValueModel trackedEntityInstanceNumberValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceNumberValueModel where  trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceNumberValueModel>> getTrackedEntityInstanceNumberValue(
                                                                                              String trackedEntityAttributeId,
                                                                                              String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceNumberValueModel where  trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceNumberValueModel> syncGetTrackedEntityInstanceNumberValue(
                                                                                        String trackedEntityAttributeId,
                                                                                        String trackedEntityInstanceId);

}
