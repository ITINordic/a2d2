package com.itinordic.a2d2.trackedentityattribute;

import androidx.room.Entity;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Entity
public class TrackedEntityAttributeModel {

    private String lastUpdated;
    private String id;
    private String created;
    private String name;
    private String shortName;
    private String aggregationType;
    private String programScope;
    private String displayName;
    private String displayShortName;
    private String valueType;
    private String confidential;
    private String dimensionItem;
    private String unique;
}
