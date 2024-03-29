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

package com.itinordic.a2d2.trackedentityinstance;

import androidx.annotation.NonNull;

import com.itinordic.a2d2.programenrolment.ProgramEnrolment;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceAttributeValue;

import java.util.List;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 */
public class TrackedEntityInstance {


    public final String id;
    public final String trackedEntity;
    public final String orgUnit;
    public final String created;
    public final String createdAtClient;
    public final String trackedEntityInstance;
    public final String lastUpdated;
    public final String trackedEntityType;
    public final String lastUpdatedAtClient;
    public final boolean inactive;
    public final boolean deleted;
    public final String featureType;
    public final List<TrackedEntityInstanceAttributeValue> attributes;
    public final List<ProgramEnrolment> enrollments;

    public TrackedEntityInstance(String id, String trackedEntity, String orgUnit,
                                 String created, String createdAtClient,
                                 String trackedEntityInstance,
                                 String lastUpdated,
                                 String trackedEntityType,
                                 String lastUpdatedAtClient,
                                 boolean inactive,
                                 boolean deleted,
                                 String featureType,
                                 List<TrackedEntityInstanceAttributeValue> attributes, List<ProgramEnrolment> enrollments) {
        this.id = id;
        this.trackedEntity = trackedEntity;
        this.orgUnit = orgUnit;
        this.created = created;
        this.createdAtClient = createdAtClient;
        this.trackedEntityInstance = trackedEntityInstance;
        this.lastUpdated = lastUpdated;
        this.trackedEntityType = trackedEntityType;
        this.lastUpdatedAtClient = lastUpdatedAtClient;
        this.inactive = inactive;
        this.deleted = deleted;
        this.featureType = featureType;
        this.attributes = attributes;
        this.enrollments = enrollments;
    }

    public static class Builder {
        private String id;
        private String trackedEntityInstance;
        private String trackedEntity;
        private String orgUnit;
        private List<TrackedEntityInstanceAttributeValue> attributes;
        private String trackedEntityType;
        private List<ProgramEnrolment> enrollments;


        public Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder trackedEntityInstance(String trackedEntityInstance) {
            this.trackedEntityInstance = trackedEntityInstance;
            return this;
        }

        public Builder trackedEntity(String trackedEntity) {
            this.trackedEntity = trackedEntity;
            return this;
        }

        @NonNull
        public Builder trackedEntityType(@NonNull String trackedEntityType) {
            this.trackedEntityType = trackedEntityType;
            return this;
        }

        @NonNull
        public Builder orgUnit(@NonNull String orgUnit) {
            this.orgUnit = orgUnit;
            return this;
        }

        @NonNull
        public Builder attributes(@NonNull List<TrackedEntityInstanceAttributeValue> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder enrollments(List<ProgramEnrolment> enrollments) {
            this.enrollments = enrollments;
            return this;
        }

        public TrackedEntityInstance build() {
            if (trackedEntityType == null) {
                throw new IllegalStateException("trackedEntityType must be set");
            }

            if (orgUnit == null) {
                throw new IllegalStateException("orgUnit must be set");
            }

            if (attributes == null || attributes.size()==0 ) {
                throw new IllegalStateException("instance attribute value list must be set");
            }

            return new TrackedEntityInstance(id, trackedEntity, orgUnit, null, null,
                    trackedEntityInstance, null, trackedEntityType, null,
                    false, false, null, attributes, enrollments);
        }
    }
}
