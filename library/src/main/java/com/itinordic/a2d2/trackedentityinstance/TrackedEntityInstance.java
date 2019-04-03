package com.itinordic.a2d2.trackedentityinstance;

import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceAttributeValue;

import java.util.Date;
import java.util.List;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class TrackedEntityInstance {

    public final String orgUnit;
    public final String createdAtClient;
    public final String trackedEntityInstance;
    public final String lastUpdated;
    public final String trackedEntityType;
    public final String lastUpdatedAtClient;
    public final boolean inactive;
    public final boolean deleted;
    public final String featureType;
    public final List<TrackedEntityInstanceAttributeValue> attributes;

    public TrackedEntityInstance(String orgUnit,
                                 String createdAtClient,
                                 String trackedEntityInstance,
                                 String lastUpdated,
                                 String trackedEntityType,
                                 String lastUpdatedAtClient,
                                 boolean inactive,
                                 boolean deleted,
                                 String featureType,
                                 List<TrackedEntityInstanceAttributeValue> attributes) {
        this.orgUnit = orgUnit;
        this.createdAtClient = createdAtClient;
        this.trackedEntityInstance = trackedEntityInstance;
        this.lastUpdated = lastUpdated;
        this.trackedEntityType = trackedEntityType;
        this.lastUpdatedAtClient = lastUpdatedAtClient;
        this.inactive = inactive;
        this.deleted = deleted;
        this.featureType = featureType;
        this.attributes = attributes;
    }
}
