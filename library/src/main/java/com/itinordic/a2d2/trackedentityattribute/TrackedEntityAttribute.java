package com.itinordic.a2d2.trackedentityattribute;

import com.itinordic.a2d2.common.Access;
import com.itinordic.a2d2.optionset.OptionSet;

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
    public final boolean programScope;
    public final boolean displayInListNoProgram;
    public final String displayName;
    public final String displayShortName;
    public final String valueType;
    public final boolean confidential;
    public final String dimensionItem;
    public final boolean unique;
    public final Access access;
    public final String dimensionItemType;
    public final boolean optionSetValue;
    public final OptionSet optionSet;

    public TrackedEntityAttribute(String lastUpdated, String id, String created, String name, String shortName, String aggregationType, boolean programScope, boolean displayInListNoProgram, String displayName, String displayShortName, String valueType, boolean confidential, String dimensionItem, boolean unique, Access access, String dimensionItemType, boolean optionSetValue, OptionSet optionSet) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.shortName = shortName;
        this.aggregationType = aggregationType;
        this.programScope = programScope;
        this.displayInListNoProgram = displayInListNoProgram;
        this.displayName = displayName;
        this.displayShortName = displayShortName;
        this.valueType = valueType;
        this.confidential = confidential;
        this.dimensionItem = dimensionItem;
        this.unique = unique;
        this.access = access;
        this.dimensionItemType = dimensionItemType;
        this.optionSetValue = optionSetValue;
        this.optionSet = optionSet;
    }
}
