package com.itinordic.a2d2.trackedentitytypeattribute;

import java.util.List;

/**
 * Created by regnatpopulus on 05/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class TrackedEntityTypeAttributeList {

    public final List<TrackedEntityTypeAttribute> trackedEntityTypeAttributeList;

    public TrackedEntityTypeAttributeList(List<TrackedEntityTypeAttribute> trackedEntityTypeAttributeList) {
        this.trackedEntityTypeAttributeList = trackedEntityTypeAttributeList;
    }

    public List<TrackedEntityTypeAttribute> getTrackedEntityTypeAttributeList() {
        return trackedEntityTypeAttributeList;
    }
}
