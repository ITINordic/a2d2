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

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getPublicAccess() {
        return publicAccess;
    }

    public void setPublicAccess(String publicAccess) {
        this.publicAccess = publicAccess;
    }

    public String getCaptureCoordinates() {
        return captureCoordinates;
    }

    public void setCaptureCoordinates(String captureCoordinates) {
        this.captureCoordinates = captureCoordinates;
    }

    public String getEnrollmentDateLabel() {
        return enrollmentDateLabel;
    }

    public void setEnrollmentDateLabel(String enrollmentDateLabel) {
        this.enrollmentDateLabel = enrollmentDateLabel;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSelectIncidentDatesInFuture() {
        return selectIncidentDatesInFuture;
    }

    public void setSelectIncidentDatesInFuture(String selectIncidentDatesInFuture) {
        this.selectIncidentDatesInFuture = selectIncidentDatesInFuture;
    }

    public String getIncidentDateLabel() {
        return incidentDateLabel;
    }

    public void setIncidentDateLabel(String incidentDateLabel) {
        this.incidentDateLabel = incidentDateLabel;
    }

    public String getSelectEnrollmentDatesInFuture() {
        return selectEnrollmentDatesInFuture;
    }

    public void setSelectEnrollmentDatesInFuture(String selectEnrollmentDatesInFuture) {
        this.selectEnrollmentDatesInFuture = selectEnrollmentDatesInFuture;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCompleteEventsExpiryDays() {
        return completeEventsExpiryDays;
    }

    public void setCompleteEventsExpiryDays(String completeEventsExpiryDays) {
        this.completeEventsExpiryDays = completeEventsExpiryDays;
    }

    public String getDisplayShortName() {
        return displayShortName;
    }

    public void setDisplayShortName(String displayShortName) {
        this.displayShortName = displayShortName;
    }

    public String getWithoutRegistration() {
        return withoutRegistration;
    }

    public void setWithoutRegistration(String withoutRegistration) {
        this.withoutRegistration = withoutRegistration;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public ProgramModel(String lastUpdated, String id, String created, String name, String shortName, String publicAccess, String captureCoordinates, String enrollmentDateLabel, String version, String selectIncidentDatesInFuture, String incidentDateLabel, String selectEnrollmentDatesInFuture, String registration, String displayName, String completeEventsExpiryDays, String displayShortName, String withoutRegistration, String programType) {
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
    }
    
}
