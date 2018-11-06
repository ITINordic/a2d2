package com.itinordic.a2d2.db.join;

import com.itinordic.a2d2.optionset.OptionSetModel;
import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

import static androidx.room.ForeignKey.CASCADE;
/**
 * Created by regnatpopulus on 05/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Entity(tableName = "tracked_entity_attribute_option_set_join_model",
        primaryKeys = { "trackedEntityAttributeId", "optionSetId" },
        foreignKeys = {
                @ForeignKey(entity = TrackedEntityAttributeModel.class,
                        parentColumns = "id",
                        childColumns = "trackedEntityAttributeId",
                        onDelete = CASCADE),
                @ForeignKey(entity = OptionSetModel.class,
                        parentColumns = "id",
                        childColumns = "optionSetId")
        }, indices = {@Index("trackedEntityAttributeId"), @Index("optionSetId")})
public class TrackedEntityAttributeOptionSetJoinModel {

    @NonNull
    private String trackedEntityAttributeId;
    @NonNull
    private String optionSetId;

    public TrackedEntityAttributeOptionSetJoinModel(String trackedEntityAttributeId, String optionSetId) {
        this.trackedEntityAttributeId = trackedEntityAttributeId;
        this.optionSetId = optionSetId;
    }

    public String getTrackedEntityAttributeId() {
        return trackedEntityAttributeId;
    }

    public void setTrackedEntityAttributeId(String trackedEntityAttributeId) {
        this.trackedEntityAttributeId = trackedEntityAttributeId;
    }

    public String getOptionSetId() {
        return optionSetId;
    }

    public void setOptionSetId(String optionSetId) {
        this.optionSetId = optionSetId;
    }

    //Builder
    public static class Builder {
        private String trackedEntityAttributeId;
        private String optionSetId;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder trackedEntityAttributeId(@NonNull String trackedEntityAttributeId) {
            this.trackedEntityAttributeId = trackedEntityAttributeId;
            return this;
        }

        @NonNull
        public Builder optionSetId(@NonNull String optionSetId) {
            this.optionSetId = optionSetId;
            return this;
        }


        public TrackedEntityAttributeOptionSetJoinModel build() {

            if (trackedEntityAttributeId == null) {
                throw new IllegalStateException("Tracked Entity Attribute id must be set");
            }

            if ( optionSetId == null) {
                throw new IllegalStateException("Option Set id must be set");
            }

            return new TrackedEntityAttributeOptionSetJoinModel(trackedEntityAttributeId,optionSetId);
        }
    }
}
