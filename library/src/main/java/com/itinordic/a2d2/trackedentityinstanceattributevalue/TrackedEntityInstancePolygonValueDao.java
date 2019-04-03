package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstancePolygonValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TrackedEntityInstancePolygonValueModel trackedEntityInstancePolygonValueModel);

    @Update
    void update(TrackedEntityInstancePolygonValueModel trackedEntityInstancePolygonValueModel);

    @Query("SELECT * FROM TrackedEntityInstancePolygonValueModel where trackedEntityAttributeId = :trackedEntityAttributeId " +
            "AND trackedEntityInstanceId = :trackedEntityInstanceId AND polygonPointPosition = :polygonPointPosition LIMIT 1")
    Flowable<List<TrackedEntityInstancePolygonValueModel>> getTrackedEntityInstancePolygonValue(
                                                                                                    String trackedEntityAttributeId,
                                                                                                    String trackedEntityInstanceId, int polygonPointPosition);

    @Query("SELECT * FROM TrackedEntityInstancePolygonValueModel where trackedEntityAttributeId = :trackedEntityAttributeId " +
            "AND trackedEntityInstanceId = :trackedEntityInstanceId AND polygonPointPosition = :polygonPointPosition LIMIT 1")
    List<TrackedEntityInstancePolygonValueModel> syncGetTrackedEntityInstancePolygonValue(
                                                                                              String trackedEntityAttributeId,
                                                                                              String trackedEntityInstanceId, int polygonPointPosition);

}
