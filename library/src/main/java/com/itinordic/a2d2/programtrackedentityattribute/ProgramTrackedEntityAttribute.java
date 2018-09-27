package com.itinordic.a2d2.programtrackedentityattribute;

import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttribute;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class ProgramTrackedEntityAttribute {

    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String name;
    public final TrackedEntityAttribute trackedEntityAttribute;

    public ProgramTrackedEntityAttribute(String lastUpdated, String id, String created, String name, TrackedEntityAttribute trackedEntityAttribute) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.trackedEntityAttribute = trackedEntityAttribute;
    }
}
