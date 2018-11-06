/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

package com.itinordic.a2d2.trackedentitytypeattribute;

import com.itinordic.a2d2.metadataaccess.MetadataAccess;
import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttribute;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityType;

public class TrackedEntityTypeAttribute {

    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String name;
    public final MetadataAccess access;
    public final TrackedEntityType trackedEntityType;
    public final TrackedEntityAttribute trackedEntityAttribute;
    public final boolean displayInList;
    public final boolean mandatory;

    public TrackedEntityTypeAttribute(String lastUpdated, String id, String created, String name, MetadataAccess access, TrackedEntityType trackedEntityType, TrackedEntityAttribute trackedEntityAttribute, boolean displayInList, boolean mandatory) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.access = access;
        this.trackedEntityType = trackedEntityType;
        this.trackedEntityAttribute = trackedEntityAttribute;
        this.displayInList = displayInList;
        this.mandatory = mandatory;
    }
}
