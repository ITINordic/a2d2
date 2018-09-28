package com.itinordic.a2d2.programstagedataelement;

import com.itinordic.a2d2.programaccess.UserProgramAccess;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class ProgramStageDataElement {
    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String displayInReports;
    public final String renderOptionsAsRadio;
    public final String compulsory;
    public final UserProgramAccess access;

    public ProgramStageDataElement(String lastUpdated, String id, String created, String displayInReports, String renderOptionsAsRadio, String compulsory, UserProgramAccess access) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.displayInReports = displayInReports;
        this.renderOptionsAsRadio = renderOptionsAsRadio;
        this.compulsory = compulsory;
        this.access = access;
    }
}
