package com.itinordic.a2d2.trackedentityattribute;

import com.itinordic.a2d2.common.Access;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class TrackedEntityAttribute {

    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String name;
    public final String shortName;
    public final String aggregationType;
    public final String programScope;
    public final String displayName;
    public final String displayShortName;
    public final String valueType;
    public final String confidential;
    public final String dimensionItem;
    public final String unique;
    public final Access access;

    public TrackedEntityAttribute(String lastUpdated, String id, String created, String name, String shortName, String aggregationType, String programScope, String displayName, String displayShortName, String valueType, String confidential, String dimensionItem, String unique, Access access) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.shortName = shortName;
        this.aggregationType = aggregationType;
        this.programScope = programScope;
        this.displayName = displayName;
        this.displayShortName = displayShortName;
        this.valueType = valueType;
        this.confidential = confidential;
        this.dimensionItem = dimensionItem;
        this.unique = unique;
        this.access = access;
    }
}
