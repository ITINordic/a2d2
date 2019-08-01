package com.itinordic.a2d2.attribute;

/**
 * Created by regnatpopulus on 2019-08-01.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public class Attribute {

    public final String id;
    public final String name;
    public final String shortName;
    public final String code;
    public final String lastUpdated;
    public final String valueType;
    public final boolean dataElementAttribute;


    public Attribute(String id, String name, String shortName, String code, String lastUpdated, String valueType, boolean dataElementAttribute) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.code = code;
        this.lastUpdated = lastUpdated;
        this.valueType = valueType;
        this.dataElementAttribute = dataElementAttribute;
    }
}
