package com.itinordic.a2d2.organisationunitaccess;

import com.itinordic.a2d2.organisationunit.OrganisationUnitModel;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Flowable;

/**
 * Created by regnatpopulus on 06/04/2019.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */

@Dao
public interface OrganisationUnitAccessDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(OrganisationUnitAccessModel organisationUnitAccessModel);

    @Delete
    public void delete(OrganisationUnitAccessModel organisationUnitAccessModel);

    @Update
    void update(OrganisationUnitAccessModel organisationUnitAccessModel);

    @Query("SELECT * FROM OrganisationUnitAccessModel WHERE userId = :userId")
    Flowable<List<OrganisationUnitAccessModel>> findById(String userId);

    @Query("SELECT * FROM OrganisationUnitAccessModel WHERE userId = :userId AND organisationUnitId = :organisationUnitId  LIMIT 1")
    Flowable<List<OrganisationUnitAccessModel>> getOrganisationUnitAccess(String userId, String organisationUnitId);

    @Query("SELECT * FROM OrganisationUnitAccessModel WHERE userId = :userId AND organisationUnitId = :organisationUnitId  LIMIT 1")
    List<OrganisationUnitAccessModel> syncGetOrganisationUnitAccess(String userId, String organisationUnitId);

    @Query("SELECT * FROM OrganisationUnitModel INNER JOIN OrganisationUnitAccessModel ON OrganisationUnitModel.id = OrganisationUnitAccessModel.organisationUnitId " +
            "INNER JOIN MetadataAccessModel ON MetadataAccessModel.id = OrganisationUnitAccessModel.metadataAccessId WHERE " +
            "OrganisationUnitAccessModel.userId = :userId AND MetadataAccessModel.read = 1 AND MetadataAccessModel.write = 1" )
    public Flowable<List<OrganisationUnitModel>> getOrganisationUnit(String userId);


    @Query("SELECT * FROM OrganisationUnitModel INNER JOIN OrganisationUnitAccessModel ON OrganisationUnitModel.id = OrganisationUnitAccessModel.organisationUnitId " +
            "INNER JOIN MetadataAccessModel ON MetadataAccessModel.id = OrganisationUnitAccessModel.metadataAccessId WHERE " +
            "OrganisationUnitAccessModel.userId = :userId AND MetadataAccessModel.read = 1 AND MetadataAccessModel.write = 1 " )
    public List<OrganisationUnitModel> syncGetOrganisationUnit(String userId);
}
