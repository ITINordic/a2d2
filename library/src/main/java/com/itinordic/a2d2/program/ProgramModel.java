package com.itinordic.a2d2.program;

import androidx.room.Entity;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
@Entity
public class ProgramModel {

    private String lastUpdated;
    private String id;
    private String created;
    private String name;
    private String shortName;
    private String publicAccess;
    private String captureCoordinates;
    private String enrollmentDateLabel;
    private String version;
    private String selectIncidentDatesInFuture;
    private String incidentDateLabel;
    private String selectEnrollmentDatesInFuture;
    private String registration;
    private String displayName;
    private String completeEventsExpiryDays;
    private String displayShortName;
    private String withoutRegistration;
    private String programType;

}
