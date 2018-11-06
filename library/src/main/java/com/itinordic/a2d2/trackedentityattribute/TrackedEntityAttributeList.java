package com.itinordic.a2d2.trackedentityattribute;

import java.util.List;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class TrackedEntityAttributeList {

    public final List<TrackedEntityAttribute> trackedEntityAttributes;


    public TrackedEntityAttributeList(List<TrackedEntityAttribute> trackedEntityAttributes) {
        this.trackedEntityAttributes = trackedEntityAttributes;
    }

    public List<TrackedEntityAttribute> getTrackedEntityAttributes() {
        return trackedEntityAttributes;
    }
}
