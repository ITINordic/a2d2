package com.itinordic.a2d2.dataelement;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import io.reactivex.Flowable;

@Dao
public interface DataElementDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(DataElementModel dataElementModel);

    @Query("SELECT * FROM DataElementModel")
    Flowable<DataElementModel> getDataElement();
}
