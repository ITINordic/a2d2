package com.itinordic.a2d2.trackedentityinstance;

import com.itinordic.a2d2.common.Utils;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

/**
 * Created by regnatpopulus on 03/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Entity
public class TrackedEntityInstanceModel {

    @NonNull
    @PrimaryKey
    private String id;
    @TypeConverters({Utils.class})
    private Date created;
    @TypeConverters({Utils.class})
    private Date createdAtClient;
    @TypeConverters({Utils.class})
    private Date lastUpdated;
    private String featureType;
}
