package com.itinordic.a2d2.programstagesection;

import com.itinordic.a2d2.common.BaseIdentifiableObject;
import com.itinordic.a2d2.metadataaccess.MetadataAccess;

import java.util.List;

/**
 * Created by regnatpopulus on 2019-06-06.
 * All rights reserved.
 */
public class ProgramStageSection {

    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String name;
    public final String displayName;
    public final String description;
    public final String sortOrder;
    public final MetadataAccess access;
    public final BaseIdentifiableObject programStage;
    public final List<BaseIdentifiableObject> dataElements;


    public ProgramStageSection(String lastUpdated, String id, String created, String name, String displayName, String description, String sortOrder, MetadataAccess access, BaseIdentifiableObject programStage, List<BaseIdentifiableObject> dataElements) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.sortOrder = sortOrder;
        this.access = access;
        this.programStage = programStage;
        this.dataElements = dataElements;
    }
}
