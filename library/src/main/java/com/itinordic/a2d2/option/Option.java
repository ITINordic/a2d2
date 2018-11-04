package com.itinordic.a2d2.option;

import com.itinordic.a2d2.metadataaccess.MetadataAccess;
import com.itinordic.a2d2.optionset.OptionSet;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class Option {
    public final String code;
    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String name;
    public final String displayName;
    public final String sortOrder;
    public final MetadataAccess access;
    public final OptionSet optionSet;

    public Option(String code, String lastUpdated, String id, String created, String name, String displayName, String sortOrder, MetadataAccess access, OptionSet optionSet) {
        this.code = code;
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.displayName = displayName;
        this.sortOrder = sortOrder;
        this.access = access;
        this.optionSet = optionSet;
    }
}
