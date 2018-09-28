package com.itinordic.a2d2.programstage;

import com.itinordic.a2d2.programstagedataelement.ProgramStageDataElement;
import com.itinordic.a2d2.programaccess.UserProgramAccess;

import java.util.List;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class ProgramStage {
    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String name;
    public final String executionDateLabel;
    public final String allowGenerateNextVisit;
    public final String validCompleteOnly;
    public final String preGenerateUID;
    public final String displayName;
    public final String publicAccess;
    public final String externalAccess;
    public final String openAfterEnrollment;
    public final String repeatable;
    public final String formType;
    public final String remindCompleted;
    public final String displayGenerateEventBox;
    public final String generatedByEnrollmentDate;
    public final String hideDueDate;
    public final String blockEntryForm;
    public final String minDaysFromStart;
    public final String dueDateLabel;
    public final UserProgramAccess access;
    public final List<ProgramStageDataElement> programStageDataElements;

    public ProgramStage(String lastUpdated, String id, String created, String name, String executionDateLabel, String allowGenerateNextVisit, String validCompleteOnly, String preGenerateUID, String displayName, String publicAccess, String externalAccess, String openAfterEnrollment, String repeatable, String formType, String remindCompleted, String displayGenerateEventBox, String generatedByEnrollmentDate, String hideDueDate, String blockEntryForm, String minDaysFromStart, String dueDateLabel, UserProgramAccess access, List<ProgramStageDataElement> programStageDataElements) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.executionDateLabel = executionDateLabel;
        this.allowGenerateNextVisit = allowGenerateNextVisit;
        this.validCompleteOnly = validCompleteOnly;
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
        this.dueDateLabel = dueDateLabel;
        this.access = access;
        this.programStageDataElements = programStageDataElements;
    }
}
