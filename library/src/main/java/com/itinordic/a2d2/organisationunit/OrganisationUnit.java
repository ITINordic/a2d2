package com.itinordic.a2d2.organisationunit;

import com.itinordic.a2d2.metadataaccess.MetadataAccess;

public class OrganisationUnit {

    public final String id;
    public final String displayName;
    public final MetadataAccess access;


    public OrganisationUnit(String id, String displayName, MetadataAccess access) {
        this.id = id;
        this.displayName = displayName;
        this.access = access;
    }
}
