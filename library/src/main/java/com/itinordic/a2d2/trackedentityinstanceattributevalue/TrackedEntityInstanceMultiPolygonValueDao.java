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

    @Query("SELECT * FROM TrackedEntityInstanceMultiPolygonValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstanceMultiPolygonValueModel>> getTrackedEntityInstanceMultiPolygonValue(String trackedEntityTypeId,
                                                                                                String trackedEntityAttributeId,
                                                                                                String trackedEntityInstanceId);

    @Query("SELECT * FROM TrackedEntityInstanceMultiPolygonValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    List<TrackedEntityInstanceMultiPolygonValueModel> syncGetTrackedEntityInstanceMultiPolygonValue(String trackedEntityTypeId,
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId);

}
