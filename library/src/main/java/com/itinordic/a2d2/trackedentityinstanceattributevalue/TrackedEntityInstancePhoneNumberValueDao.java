package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

@Dao
public interface TrackedEntityInstancePhoneNumberValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insert(TrackedEntityInstancePhoneNumberValueModel trackedEntityInstancePhoneNumberValueModel);

    @Update
    void update(TrackedEntityInstancePhoneNumberValueModel trackedEntityInstancePhoneNumberValueModel);

    @Query("SELECT * FROM TrackedEntityInstancePhoneNumberValueModel where trackedEntityTypeId = :trackedEntityTypeId AND trackedEntityAttributeId = :trackedEntityAttributeId AND trackedEntityInstanceId = :trackedEntityInstanceId LIMIT 1")
    Flowable<List<TrackedEntityInstancePhoneNumberValueModel>> getTrackedEntityInstancePhoneNumberValue(String trackedEntityTypeId,
                                                                                          String trackedEntityAttributeId,
                                                                                          String trackedEntityInstanceId);

}
