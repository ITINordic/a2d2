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

package com.itinordic.a2d2.programstage;

import com.itinordic.a2d2.common.BaseIdentifiableObject;
import com.itinordic.a2d2.metadataaccess.MetadataAccess;
import com.itinordic.a2d2.programstagedataelement.ProgramStageDataElement;

import java.util.List;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 */
public class ProgramStage {
    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String name;
    public final String description;
    public final boolean allowGenerateNextVisit;
    public final boolean preGenerateUID;
    public final String displayName;
    public final String publicAccess;
    public final boolean externalAccess;
    public final boolean openAfterEnrollment;
    public final boolean repeatable;
    public final String formType;
    public final boolean remindCompleted;
    public final boolean displayGenerateEventBox;
    public final boolean generatedByEnrollmentDate;
    public final boolean hideDueDate;
    public final boolean blockEntryForm;
    public final String minDaysFromStart;
    public final boolean autoGenerateEvent;
    public final MetadataAccess access;
    public final BaseIdentifiableObject program;
    public final List<ProgramStageDataElement> programStageDataElements;

    public ProgramStage(String lastUpdated, String id, String created, String name, String description, boolean allowGenerateNextVisit, boolean preGenerateUID, String displayName, String publicAccess, boolean externalAccess, boolean openAfterEnrollment, boolean repeatable, String formType, boolean remindCompleted, boolean displayGenerateEventBox, boolean generatedByEnrollmentDate, boolean hideDueDate, boolean blockEntryForm, String minDaysFromStart, boolean autoGenerateEvent, MetadataAccess access, BaseIdentifiableObject program, List<ProgramStageDataElement> programStageDataElements) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.description = description;
        this.allowGenerateNextVisit = allowGenerateNextVisit;
        this.preGenerateUID = preGenerateUID;
        this.displayName = displayName;
        this.publicAccess = publicAccess;
        this.externalAccess = externalAccess;
        this.openAfterEnrollment = openAfterEnrollment;
        this.repeatable = repeatable;
        this.formType = formType;
        this.remindCompleted = remindCompleted;
        this.displayGenerateEventBox = displayGenerateEventBox;
        this.generatedByEnrollmentDate = generatedByEnrollmentDate;
        this.hideDueDate = hideDueDate;
        this.blockEntryForm = blockEntryForm;
        this.minDaysFromStart = minDaysFromStart;
        this.autoGenerateEvent = autoGenerateEvent;
        this.access = access;
        this.program = program;
        this.programStageDataElements = programStageDataElements;
    }
}
