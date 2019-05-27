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
/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 */

package com.itinordic.a2d2.program;

import com.itinordic.a2d2.common.BaseIdentifiableObject;
import com.itinordic.a2d2.metadataaccess.MetadataAccess;
import com.itinordic.a2d2.programstage.ProgramStage;
import com.itinordic.a2d2.programtrackedentityattribute.ProgramTrackedEntityAttribute;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityType;

import java.util.List;

public class Program {

    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String name;
    public final String shortName;
    public final String publicAccess;
    public final boolean captureCoordinates;
    public final String enrollmentDateLabel;
    public final String version;
    public final boolean selectIncidentDatesInFuture;
    public final String incidentDateLabel;
    public final boolean selectEnrollmentDatesInFuture;
    public final boolean registration;
    public final String displayName;
    public final String completeEventsExpiryDays;
    public final String displayShortName;
    public final boolean withoutRegistration;
    public final String programType;
    public final boolean displayIncidentDate;
    public final String expiryDays;
    public final BaseIdentifiableObject categoryCombo;
    public final BaseIdentifiableObject lastUpdatedBy;
    public final MetadataAccess access;
    public final TrackedEntityType trackedEntityType;
    public final List<BaseIdentifiableObject> programRuleVariables;
    public final List<ProgramTrackedEntityAttribute> programTrackedEntityAttributes;
    public final List<BaseIdentifiableObject> organisationUnits;
    public final List<ProgramStage> programStages;

    public Program(String lastUpdated, String id, String created, String name, String shortName, String publicAccess, boolean captureCoordinates, String enrollmentDateLabel, String version, boolean selectIncidentDatesInFuture, String incidentDateLabel, boolean selectEnrollmentDatesInFuture, boolean registration, String displayName, String completeEventsExpiryDays, String displayShortName, boolean withoutRegistration, String programType, boolean displayIncidentDate, String expiryDays, BaseIdentifiableObject categoryCombo, BaseIdentifiableObject lastUpdatedBy, MetadataAccess access, TrackedEntityType trackedEntityType, List<BaseIdentifiableObject> programRuleVariables, List<ProgramTrackedEntityAttribute> programTrackedEntityAttributes, List<BaseIdentifiableObject> organisationUnits, List<ProgramStage> programStages) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.shortName = shortName;
        this.publicAccess = publicAccess;
        this.captureCoordinates = captureCoordinates;
        this.enrollmentDateLabel = enrollmentDateLabel;
        this.version = version;
        this.selectIncidentDatesInFuture = selectIncidentDatesInFuture;
        this.incidentDateLabel = incidentDateLabel;
        this.selectEnrollmentDatesInFuture = selectEnrollmentDatesInFuture;
        this.registration = registration;
        this.displayName = displayName;
        this.completeEventsExpiryDays = completeEventsExpiryDays;
        this.displayShortName = displayShortName;
        this.withoutRegistration = withoutRegistration;
        this.programType = programType;
        this.displayIncidentDate = displayIncidentDate;
        this.expiryDays = expiryDays;
        this.categoryCombo = categoryCombo;
        this.lastUpdatedBy = lastUpdatedBy;
        this.access = access;
        this.trackedEntityType = trackedEntityType;
        this.programRuleVariables = programRuleVariables;
        this.programTrackedEntityAttributes = programTrackedEntityAttributes;
        this.organisationUnits = organisationUnits;
        this.programStages = programStages;

    }
}
