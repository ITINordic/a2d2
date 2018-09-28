package com.itinordic.a2d2.programstage;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */


@Entity
public class ProgramStageModel {

    private String lastUpdated;
    @NonNull
    @PrimaryKey
    private String id;
    private String created;
    private String name;
    private String executionDateLabel;
    private String allowGenerateNextVisit;
    private String validCompleteOnly;
    private String preGenerateUID;
    private String displayName;
    private String publicAccess;
    private String externalAccess;
    private String openAfterEnrollment;
    private String repeatable;
    private String formType;
    private String remindCompleted;
    private String displayGenerateEventBox;
    private String generatedByEnrollmentDate;
    private String hideDueDate;
    private String blockEntryForm;
    private String minDaysFromStart;
    private String dueDateLabel;

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

    public String getExecutionDateLabel() {
        return executionDateLabel;
    }

    public void setExecutionDateLabel(String executionDateLabel) {
        this.executionDateLabel = executionDateLabel;
    }

    public String getAllowGenerateNextVisit() {
        return allowGenerateNextVisit;
    }

    public void setAllowGenerateNextVisit(String allowGenerateNextVisit) {
        this.allowGenerateNextVisit = allowGenerateNextVisit;
    }

    public String getValidCompleteOnly() {
        return validCompleteOnly;
    }

    public void setValidCompleteOnly(String validCompleteOnly) {
        this.validCompleteOnly = validCompleteOnly;
    }

    public String getPreGenerateUID() {
        return preGenerateUID;
    }

    public void setPreGenerateUID(String preGenerateUID) {
        this.preGenerateUID = preGenerateUID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPublicAccess() {
        return publicAccess;
    }

    public void setPublicAccess(String publicAccess) {
        this.publicAccess = publicAccess;
    }

    public String getExternalAccess() {
        return externalAccess;
    }

    public void setExternalAccess(String externalAccess) {
        this.externalAccess = externalAccess;
    }

    public String getOpenAfterEnrollment() {
        return openAfterEnrollment;
    }

    public void setOpenAfterEnrollment(String openAfterEnrollment) {
        this.openAfterEnrollment = openAfterEnrollment;
    }

    public String getRepeatable() {
        return repeatable;
    }

    public void setRepeatable(String repeatable) {
        this.repeatable = repeatable;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public String getRemindCompleted() {
        return remindCompleted;
    }

    public void setRemindCompleted(String remindCompleted) {
        this.remindCompleted = remindCompleted;
    }

    public String getDisplayGenerateEventBox() {
        return displayGenerateEventBox;
    }

    public void setDisplayGenerateEventBox(String displayGenerateEventBox) {
        this.displayGenerateEventBox = displayGenerateEventBox;
    }

    public String getGeneratedByEnrollmentDate() {
        return generatedByEnrollmentDate;
    }

    public void setGeneratedByEnrollmentDate(String generatedByEnrollmentDate) {
        this.generatedByEnrollmentDate = generatedByEnrollmentDate;
    }

    public String getHideDueDate() {
        return hideDueDate;
    }

    public void setHideDueDate(String hideDueDate) {
        this.hideDueDate = hideDueDate;
    }

    public String getBlockEntryForm() {
        return blockEntryForm;
    }

    public void setBlockEntryForm(String blockEntryForm) {
        this.blockEntryForm = blockEntryForm;
    }

    public String getMinDaysFromStart() {
        return minDaysFromStart;
    }

    public void setMinDaysFromStart(String minDaysFromStart) {
        this.minDaysFromStart = minDaysFromStart;
    }

    public String getDueDateLabel() {
        return dueDateLabel;
    }

    public void setDueDateLabel(String dueDateLabel) {
        this.dueDateLabel = dueDateLabel;
    }
}
