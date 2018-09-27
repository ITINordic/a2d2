/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

package com.itinordic.a2d2.program;

import com.itinordic.a2d2.TrackedEntity.TrackedEntityType;

import java.util.List;

public class Program {

    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String name;
    public final String shortName;
    public final String publicAccess;
    public final String captureCoordinates;
    public final String enrollmentDateLabel;
    public final String version;
    public final String selectIncidentDatesInFuture;
    public final String incidentDateLabel;
    public final String selectEnrollmentDatesInFuture;
    public final String registration;
    public final String displayName;
    public final String completeEventsExpiryDays;
    public final String displayShortName;
    public final String withoutRegistration;
    public final String programType;
    public final ProgramAccess access;
    public final TrackedEntityType trackedEntityType;
    public final List<ProgramStage> programStages;

    public Program(String lastUpdated, String id, String created, String name, String shortName, String publicAccess, String captureCoordinates, String enrollmentDateLabel, String version, String selectIncidentDatesInFuture, String incidentDateLabel, String selectEnrollmentDatesInFuture, String registration, String displayName, String completeEventsExpiryDays, String displayShortName, String withoutRegistration, String programType, ProgramAccess access, TrackedEntityType trackedEntityType, List<ProgramStage> programStages) {
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
        this.access = access;
        this.trackedEntityType = trackedEntityType;
        this.programStages = programStages;
    }
}
