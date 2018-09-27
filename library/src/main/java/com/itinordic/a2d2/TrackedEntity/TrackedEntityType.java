package com.itinordic.a2d2.TrackedEntity;

import com.itinordic.a2d2.common.Style;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class TrackedEntityType {

    public final String id;
    public final String created;
    public final String name;
    public final String displayName;
    public final String description;
    public final String displayDescription;
    public final Style style;

    public TrackedEntityType(String id, String created, String name, String displayName, String description, String displayDescription, Style style) {
        this.id = id;
        this.created = created;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.displayDescription = displayDescription;
        this.style = style;
    }
}
