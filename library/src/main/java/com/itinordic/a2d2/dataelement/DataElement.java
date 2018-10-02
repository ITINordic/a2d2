/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

package com.itinordic.a2d2.dataelement;

import com.itinordic.a2d2.metadataaccess.MetadataAccess;

public class DataElement {

    public final String id;
    public final String lastUpdated;
    public final String created;
    public final String name;
    public final String shortName;
    public final String domainType;
    public final String displayName;
    public final String publicAccess;
    public final String displayShortName;
    public final String valueType;
    public final String dimensionItem;
    public final String displayFormName;
    public final String zeroIsSignificant;
    public final String dimensionItemType;
    public final String categoryCombo;
    public final MetadataAccess access;

    public DataElement(String id, String lastUpdated, String created,String name, String shortName, String domainType, String displayName, String publicAccess, String displayShortName, String valueType, String dimensionItem, String displayFormName, String zeroIsSignificant, String dimensionItemType, String categoryCombo, MetadataAccess access) {
        this.id = id;
        this.lastUpdated = lastUpdated;
        this.created = created;
        this.name = name;
        this.shortName = shortName;
        this.domainType = domainType;
        this.displayName = displayName;
        this.publicAccess = publicAccess;
        this.displayShortName = displayShortName;
        this.valueType = valueType;
        this.dimensionItem = dimensionItem;
        this.displayFormName = displayFormName;
        this.zeroIsSignificant = zeroIsSignificant;
        this.dimensionItemType = dimensionItemType;
        this.categoryCombo = categoryCombo;
        this.access = access;
    }
}
