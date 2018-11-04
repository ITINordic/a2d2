package com.itinordic.a2d2.optionset;

import com.itinordic.a2d2.metadataaccess.MetadataAccess;
import com.itinordic.a2d2.option.Option;

import java.util.List;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class OptionSet {
    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String name;
    public final String displayName;
    public final String displayShortName;
    public final String valueType;
    public final MetadataAccess access;
    public final List<Option> options;

    public OptionSet(String lastUpdated, String id, String created, String name, String displayName, String displayShortName, String valueType, MetadataAccess access, List<Option> options) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.displayName = displayName;
        this.displayShortName = displayShortName;
        this.valueType = valueType;
        this.access = access;
        this.options = options;
    }
}
