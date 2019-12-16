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

package com.itinordic.a2d2.trackedentitytype;

import com.itinordic.a2d2.common.Style;
import com.itinordic.a2d2.metadataaccess.MetadataAccess;
import com.itinordic.a2d2.paging.Pager;
import com.itinordic.a2d2.paging.PagingBase;
import com.itinordic.a2d2.trackedentitytypeattribute.TrackedEntityTypeAttribute;

import java.util.List;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 */
public class TrackedEntityType extends PagingBase {

    public final String id;
    public final String created;
    public final String lastUpdated;
    public final String code;
    public final String name;
    public final String displayName;
    public final String description;
    public final String displayDescription;
    public final Style style;
    public final MetadataAccess access;
    public final List<TrackedEntityTypeAttribute> trackedEntityTypeAttributes;

    public TrackedEntityType(Pager pager, String id, String created, String lastUpdated, String code, String name, String displayName, String description, String displayDescription, Style style, MetadataAccess access, List<TrackedEntityTypeAttribute> trackedEntityTypeAttributes) {
        super(pager);
        this.id = id;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.code = code;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.displayDescription = displayDescription;
        this.style = style;
        this.access = access;
        this.trackedEntityTypeAttributes = trackedEntityTypeAttributes;
    }
}
