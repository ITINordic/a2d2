package com.itinordic.a2d2.trackedentityinstance;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

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
}
