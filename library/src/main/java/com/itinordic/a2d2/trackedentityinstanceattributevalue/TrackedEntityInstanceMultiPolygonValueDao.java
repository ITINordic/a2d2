package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstanceMultiPolygonValueDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstanceMultiPolygonValueModel trackedEntityInstanceMultiPolygonValueModel);

    @Update
    void update(TrackedEntityInstanceMultiPolygonValueModel trackedEntityInstanceMultiPolygonValueModel);

    @Query("SELECT * FROM TrackedEntityInstanceMultiPolygonValueModel where  trackedEntityAttributeId = :trackedEntityAttributeId " +
            "AND trackedEntityInstanceId = :trackedEntityInstanceId AND multiPolygonPolygonPosition = :multiPolygonPolygonPosition AND polygonPointPosition = :polygonPointPosition LIMIT 1")
    Flowable<List<TrackedEntityInstanceMultiPolygonValueModel>> getTrackedEntityInstanceMultiPolygonValue(
                                                                                                String trackedEntityAttributeId,
                                                                                                String trackedEntityInstanceId,
                                                                                                          int multiPolygonPolygonPosition, int polygonPointPosition);

    @Query("SELECT * FROM TrackedEntityInstanceMultiPolygonValueModel where trackedEntityAttributeId = :trackedEntityAttributeId " +
            "AND trackedEntityInstanceId = :trackedEntityInstanceId AND multiPolygonPolygonPosition = :multiPolygonPolygonPosition AND polygonPointPosition = :polygonPointPosition LIMIT 1")
    List<TrackedEntityInstanceMultiPolygonValueModel> syncGetTrackedEntityInstanceMultiPolygonValue(
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId, int multiPolygonPolygonPosition, int polygonPointPosition);

}
