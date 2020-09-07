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

package com.itinordic.a2d2.trackedentityattribute;

import com.itinordic.a2d2.attribute.AttributeValue;
import com.itinordic.a2d2.metadataaccess.MetadataAccess;
import com.itinordic.a2d2.optionset.OptionSet;

import java.util.List;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 */
public class TrackedEntityAttribute {

    public final String lastUpdated;
    public final String id;
    public final String code;
    public final String created;
    public final String name;
    public final String shortName;
    public final String description;
    public final String aggregationType;
    public final boolean programScope;
    public final boolean displayInListNoProgram;
    public final String displayName;
    public final String displayShortName;
    public final String valueType;
    public final boolean confidential;
    public final String fieldMask;
    public final String dimensionItem;
    public final boolean unique;
    public final MetadataAccess access;
    public final String dimensionItemType;
    public final boolean optionSetValue;
    public final OptionSet optionSet;
    public final List<AttributeValue> attributeValues;

    public TrackedEntityAttribute(String lastUpdated, String id, String code, String created, String name, String shortName, String description, String aggregationType, boolean programScope, boolean displayInListNoProgram, String displayName, String displayShortName, String valueType, boolean confidential, String fieldMask, String dimensionItem, boolean unique, MetadataAccess access, String dimensionItemType, boolean optionSetValue, OptionSet optionSet, List<AttributeValue> attributeValues) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.code = code;
        this.created = created;
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        this.aggregationType = aggregationType;
        this.programScope = programScope;
        this.displayInListNoProgram = displayInListNoProgram;
        this.displayName = displayName;
        this.displayShortName = displayShortName;
        this.valueType = valueType;
        this.confidential = confidential;
        this.fieldMask = fieldMask;
        this.dimensionItem = dimensionItem;
        this.unique = unique;
        this.access = access;
        this.dimensionItemType = dimensionItemType;
        this.optionSetValue = optionSetValue;
        this.optionSet = optionSet;
        this.attributeValues = attributeValues;
    }
}
