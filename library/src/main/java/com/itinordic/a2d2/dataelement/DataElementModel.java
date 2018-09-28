package com.itinordic.a2d2.dataelement;

import androidx.room.Entity;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Entity
public class DataElementModel {

    private String id;
    private String name;
    private String shortName;
    private String domainType;
    private String displayName;
    private String publicAccess;
    private String displayShortName;
    private String valueType;
    private String dimensionItem;
    private String displayFormName;
    private String zeroIsSignificant;
    private String dimensionItemType;
    private String categoryCombo;

}
