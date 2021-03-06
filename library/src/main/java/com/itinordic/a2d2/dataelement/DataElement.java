/*
 *BSD 2-Clause License
 *
 *Copyright (c) 2019, itinordic All rights reserved.
 *
 *Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following
 *conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following
 *    disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
 *    disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR
 *IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 *CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 *DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER
 *IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
 *THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 **/

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 */

package com.itinordic.a2d2.dataelement;

import com.itinordic.a2d2.attribute.AttributeValue;
import com.itinordic.a2d2.attribute.AttributeValueList;
import com.itinordic.a2d2.common.BaseIdentifiableObject;
import com.itinordic.a2d2.metadataaccess.MetadataAccess;

import java.util.List;

public class DataElement {

    public final String id;
    public final String name;
    public final String shortName;
    public final String code;
    public final String lastUpdated;
    public final String domainType;
    public final String displayName;
    public final String publicAccess;
    public final String displayShortName;
    public final String valueType;
    public final String dimensionItem;
    public final String displayFormName;
    public final boolean zeroIsSignificant;
    public final boolean optionSetValue;
    public final String dimensionItemType;
    public final MetadataAccess access;
    public final BaseIdentifiableObject optionSet;
    public final BaseIdentifiableObject categoryCombo;
    public final BaseIdentifiableObject lastUpdatedBy;
    public final List<AttributeValue> attributeValues;


    public DataElement(String id, String name, String shortName, String code, String lastUpdated, String domainType, String displayName, String publicAccess, String displayShortName, String valueType, String dimensionItem, String displayFormName, boolean zeroIsSignificant, boolean optionSetValue, String dimensionItemType, BaseIdentifiableObject categoryCombo, MetadataAccess access, BaseIdentifiableObject optionSet, BaseIdentifiableObject lastUpdatedBy, List<AttributeValue> attributeValues) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.code = code;
        this.lastUpdated = lastUpdated;
        this.domainType = domainType;
        this.displayName = displayName;
        this.publicAccess = publicAccess;
        this.displayShortName = displayShortName;
        this.valueType = valueType;
        this.dimensionItem = dimensionItem;
        this.displayFormName = displayFormName;
        this.zeroIsSignificant = zeroIsSignificant;
        this.optionSetValue = optionSetValue;
        this.dimensionItemType = dimensionItemType;
        this.categoryCombo = categoryCombo;
        this.access = access;
        this.optionSet = optionSet;
        this.lastUpdatedBy = lastUpdatedBy;
        this.attributeValues = attributeValues;
    }
}
