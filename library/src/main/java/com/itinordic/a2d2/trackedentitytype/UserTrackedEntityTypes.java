package com.itinordic.a2d2.trackedentitytype;

import java.util.List;

/**
 * Created by regnatpopulus on 01/10/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class UserTrackedEntityTypes {

    public final List<TrackedEntityType> trackedEntityTypes;

    public UserTrackedEntityTypes(List<TrackedEntityType> trackedEntityTypes) {
        this.trackedEntityTypes = trackedEntityTypes;
    }

    public List<TrackedEntityType> getTrackedEntityTypes() {
        return trackedEntityTypes;
    }
}
