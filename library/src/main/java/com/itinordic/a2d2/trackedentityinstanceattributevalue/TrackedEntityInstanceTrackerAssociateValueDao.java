package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceTrackerAssociateValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstanceTrackerAssociateValueModel trackedEntityInstanceTrackerAssociateValueModel);

    @Update
    void update(TrackedEntityInstanceTrackerAssociateValueModel trackedEntityInstanceTrackerAssociateValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceTrackerAssociateValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceTrackerAssociateValueModel>> getTrackedEntityInstanceTrackerAssociateValueModel(
                                                                                        String trackedEntityAttributeId,
                                                                                        String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceTrackerAssociateValueModel where trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceTrackerAssociateValueModel> syncGetTrackedEntityInstanceTrackerAssociateValueModel(
                                                                                  String trackedEntityAttributeId,
                                                                                  String trackedEntityInstanceId);

}
