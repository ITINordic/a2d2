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

package com.itinordic.a2d2.organisationunit;

import com.itinordic.a2d2.metadataaccess.MetadataAccess;

import java.util.List;

public class OrganisationUnit {

    public final String id;
    public final String name;
    public final String displayName;
    public final MetadataAccess access;
    public final String level;
    public final OrganisationUnit parent;
    public final List<OrganisationUnit> children;
    public final List<OrganisationUnit> ancestors;
    public final String code;
    public final boolean leaf;

    public OrganisationUnit(String id, String name, String displayName, MetadataAccess access, String level, OrganisationUnit parent, List<OrganisationUnit> children, List<OrganisationUnit> ancestors, String code, boolean leaf) {
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.access = access;
        this.level = level;
        this.parent = parent;
        this.children = children;
        this.ancestors = ancestors;
        this.code = code;
        this.leaf = leaf;
    }
}