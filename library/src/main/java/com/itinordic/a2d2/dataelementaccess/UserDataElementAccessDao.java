package com.itinordic.a2d2.dataelementaccess;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import io.reactivex.Flowable;

@Dao
public interface UserDataElementAccessDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserDataElementAccessJoinModel userDataElementAccessJoinModel);

    @Query("SELECT * FROM DataElementModel INNER JOIN user_data_element_access_join_model " +
            "ON DataElementModel.id = user_data_element_access_join_model.dataElementId " +
            "INNER JOIN DataAccessModel ON user_data_element_access_join_model.metadataAccessId = DataAccessModel.metadataAccessId " +
            "WHERE userId = :userId AND DataAccessModel.read = 1 AND DataAccessModel.write = 1 ")
    Flowable<List<UserDataElementAccessJoinModel>> getUserDataElementAccessJoinModel(String userId);
}
