package com.itinordic.a2d2.program;

import com.itinordic.a2d2.common.Utils;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
@Entity
public class ProgramModel {


    @TypeConverters({Utils.class})
    private Date lastUpdated;

    @NonNull
    @PrimaryKey
    private String id;

    @TypeConverters({Utils.class})
    private Date created;
    private String name;
    private String shortName;
    private String publicAccess;
    @TypeConverters({Utils.class})
    private boolean captureCoordinates;
    private String enrollmentDateLabel;
    @TypeConverters({Utils.class})
    private int version;
    @TypeConverters({Utils.class})
    private boolean selectIncidentDatesInFuture;
    private String incidentDateLabel;
    @TypeConverters({Utils.class})
    private boolean selectEnrollmentDatesInFuture;
    @TypeConverters({Utils.class})
    private boolean registration;
    private String displayName;
    @TypeConverters({Utils.class})
    private int completeEventsExpiryDays;
    private String displayShortName;
    @TypeConverters({Utils.class})
    private boolean withoutRegistration;
    private String programType;

    public ProgramModel(Date lastUpdated, String id, Date created, String name, String shortName, String publicAccess, boolean captureCoordinates, String enrollmentDateLabel, int version, boolean selectIncidentDatesInFuture, String incidentDateLabel, boolean selectEnrollmentDatesInFuture, boolean registration, String displayName, int completeEventsExpiryDays, String displayShortName, boolean withoutRegistration, String programType) {
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

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
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

    public boolean isCaptureCoordinates() {
        return captureCoordinates;
    }

    public void setCaptureCoordinates(boolean captureCoordinates) {
        this.captureCoordinates = captureCoordinates;
    }

    public String getEnrollmentDateLabel() {
        return enrollmentDateLabel;
    }

    public void setEnrollmentDateLabel(String enrollmentDateLabel) {
        this.enrollmentDateLabel = enrollmentDateLabel;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isSelectIncidentDatesInFuture() {
        return selectIncidentDatesInFuture;
    }

    public void setSelectIncidentDatesInFuture(boolean selectIncidentDatesInFuture) {
        this.selectIncidentDatesInFuture = selectIncidentDatesInFuture;
    }

    public String getIncidentDateLabel() {
        return incidentDateLabel;
    }

    public void setIncidentDateLabel(String incidentDateLabel) {
        this.incidentDateLabel = incidentDateLabel;
    }

    public boolean isSelectEnrollmentDatesInFuture() {
        return selectEnrollmentDatesInFuture;
    }

    public void setSelectEnrollmentDatesInFuture(boolean selectEnrollmentDatesInFuture) {
        this.selectEnrollmentDatesInFuture = selectEnrollmentDatesInFuture;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getCompleteEventsExpiryDays() {
        return completeEventsExpiryDays;
    }

    public void setCompleteEventsExpiryDays(int completeEventsExpiryDays) {
        this.completeEventsExpiryDays = completeEventsExpiryDays;
    }

    public String getDisplayShortName() {
        return displayShortName;
    }

    public void setDisplayShortName(String displayShortName) {
        this.displayShortName = displayShortName;
    }

    public boolean isWithoutRegistration() {
        return withoutRegistration;
    }

    public void setWithoutRegistration(boolean withoutRegistration) {
        this.withoutRegistration = withoutRegistration;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    //Builder
    public static class Builder {
        private Date lastUpdated;
        private String id;
        private Date created;
        private String name;
        private String shortName;
        private String publicAccess;
        private boolean captureCoordinates;
        private String enrollmentDateLabel;
        private int version;
        private boolean selectIncidentDatesInFuture;
        private String incidentDateLabel;
        private boolean selectEnrollmentDatesInFuture;
        private boolean registration;
        private String displayName;
        private int completeEventsExpiryDays;
        private String displayShortName;
        private boolean withoutRegistration;
        private String programType;
        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder lastUpdated(@NonNull Date lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        @NonNull
        public Builder id(@NonNull String id) {
            this.id = id;
            return this;
        }

        @NonNull
        public Builder created(@NonNull Date created) {
            this.created = created;
            return this;
        }

        @NonNull
        public Builder name(@NonNull String name) {
            this.name = name;
            return this;
        }

        @NonNull
        public Builder shortName(@NonNull String shortName) {
            this.shortName = shortName;
            return this;
        }

        @NonNull
        public Builder captureCoordinates(@NonNull boolean captureCoordinates) {
            this.captureCoordinates = captureCoordinates;
            return this;
        }


        @NonNull
        public Builder publicAccess(@NonNull String publicAccess) {
            this.publicAccess = publicAccess;
            return this;
        }

        public Builder enrollmentDateLabel(String enrollmentDateLabel) {
            this.enrollmentDateLabel = enrollmentDateLabel;
            return this;
        }

        @NonNull
        public Builder version(@NonNull int version) {
            this.version = version;
            return this;
        }

        @NonNull
        public Builder selectIncidentDatesInFuture(@NonNull boolean selectIncidentDatesInFuture) {
            this.selectIncidentDatesInFuture = selectIncidentDatesInFuture;
            return this;
        }

        public Builder incidentDateLabel( String incidentDateLabel) {
            this.incidentDateLabel = incidentDateLabel;
            return this;
        }


        @NonNull
        public Builder selectEnrollmentDatesInFuture(@NonNull boolean selectEnrollmentDatesInFuture) {
            this.selectEnrollmentDatesInFuture = selectEnrollmentDatesInFuture;
            return this;
        }


        @NonNull
        public Builder registration(@NonNull boolean registration) {
            this.registration = registration;
            return this;
        }

        @NonNull
        public Builder displayName(@NonNull String displayName) {
            this.displayName = displayName;
            return this;
        }

        @NonNull
        public Builder completeEventsExpiryDays(@NonNull int completeEventsExpiryDays) {
            this.completeEventsExpiryDays = completeEventsExpiryDays;
            return this;
        }

        @NonNull
        public Builder displayShortName(@NonNull String displayShortName) {
            this.displayShortName = displayShortName;
            return this;
        }

        @NonNull
        public Builder withoutRegistration(@NonNull boolean withoutRegistration) {
            this.withoutRegistration = withoutRegistration;
            return this;
        }

        @NonNull
        public Builder programType(@NonNull String programType) {
            this.programType = programType;
            return this;
        }

        public ProgramModel build() {

            if (id == null) {
                throw new IllegalStateException("UID must be set");
            }

            if ( displayName == null) {
                throw new IllegalStateException("Display name must be set");
            }

            if ( lastUpdated == null) {
                throw new IllegalStateException("Last Updated must be set");
            }

            if ( created == null) {
                throw new IllegalStateException("Created must be set");
            }

            if ( name == null) {
                throw new IllegalStateException("Name must be set");
            }

            if ( shortName == null) {
                throw new IllegalStateException("Short name must be set");
            }

            if ( publicAccess == null) {
                throw new IllegalStateException("Public access must be set");
            }

            if ( displayShortName == null) {
                throw new IllegalStateException("Display short name  must be set");
            }

            if ( programType == null) {
                throw new IllegalStateException("Program type must be set");
            }

            return new ProgramModel( lastUpdated,  id,  created,  name, shortName,  publicAccess,
                    captureCoordinates, enrollmentDateLabel,  version,  selectIncidentDatesInFuture,
                    incidentDateLabel,  selectEnrollmentDatesInFuture,  registration, displayName,
                    completeEventsExpiryDays,  displayShortName, withoutRegistration,  programType);
        }
    }
}
