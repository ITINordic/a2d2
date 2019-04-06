/**
 * Created by regnatpopulus on 08/04/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

package com.itinordic.a2d2;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.itinordic.a2d2.common.Utils;
import com.itinordic.a2d2.dataelement.DataElementModel;
import com.itinordic.a2d2.db.join.OAuthGrantTypeJoinModel;
import com.itinordic.a2d2.db.join.OAuthGrantTypeJoinDao;
import com.itinordic.a2d2.db.join.TrackedEntityAttributeOptionSetJoinDao;
import com.itinordic.a2d2.db.join.TrackedEntityAttributeOptionSetJoinModel;
import com.itinordic.a2d2.db.join.UserOrganisationUnitJoinDao;
import com.itinordic.a2d2.db.join.UserOrganisationUnitJoinModel;
import com.itinordic.a2d2.db.join.UserUserGroupJoinDao;
import com.itinordic.a2d2.db.join.UserUserGroupJoinModel;
import com.itinordic.a2d2.db.join.UserUserRoleJoinDao;
import com.itinordic.a2d2.db.join.UserUserRoleJoinModel;
import com.itinordic.a2d2.deskbell.DeskBellDao;
import com.itinordic.a2d2.deskbell.DeskBellModel;
import com.itinordic.a2d2.granttype.*;
import com.itinordic.a2d2.metadataaccess.DataAccessDao;
import com.itinordic.a2d2.metadataaccess.DataAccessModel;
import com.itinordic.a2d2.metadataaccess.MetadataAccessDao;
import com.itinordic.a2d2.metadataaccess.MetadataAccessModel;
import com.itinordic.a2d2.oauthclient.OAuthClientModel;
import com.itinordic.a2d2.oauthclient.OAuthClientDao;
import com.itinordic.a2d2.option.OptionDao;
import com.itinordic.a2d2.option.OptionModel;
import com.itinordic.a2d2.optionaccess.OptionAccessDao;
import com.itinordic.a2d2.optionaccess.OptionAccessModel;
import com.itinordic.a2d2.optionset.OptionSetDao;
import com.itinordic.a2d2.optionset.OptionSetModel;
import com.itinordic.a2d2.optionsetaccess.OptionSetAccessDao;
import com.itinordic.a2d2.optionsetaccess.OptionSetAccessModel;
import com.itinordic.a2d2.organisationunit.OrganisationUnitDao;
import com.itinordic.a2d2.organisationunit.OrganisationUnitModel;
import com.itinordic.a2d2.program.ProgramDao;
import com.itinordic.a2d2.program.ProgramModel;
import com.itinordic.a2d2.programaccess.UserProgramAccessDao;
import com.itinordic.a2d2.programaccess.UserProgramAccessJoinModel;
import com.itinordic.a2d2.programstage.ProgramStageModel;
import com.itinordic.a2d2.programstageaccess.UserProgramStageAccessJoinModel;
import com.itinordic.a2d2.programstagedataelement.UserProgramStageDataElementAccessJoinModel;
import com.itinordic.a2d2.programtrackedentityattribute.UserProgramTrackedEntityAttributeAccessJoinModel;
import com.itinordic.a2d2.programtrackedentitytype.ProgramTrackedEntityTypeDao;
import com.itinordic.a2d2.programtrackedentitytype.ProgramTrackedEntityTypeJoinModel;
import com.itinordic.a2d2.token.AccessTokenModel;
import com.itinordic.a2d2.token.AccessTokenDao;
import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeDao;
import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;
import com.itinordic.a2d2.trackedentityattributeaccess.TrackedEntityAttributeAccessDao;
import com.itinordic.a2d2.trackedentityattributeaccess.TrackedEntityAttributeAccessModel;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstance;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceDao;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceAgeValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceAgeValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceBooleanValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceBooleanValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceCoordinateValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceCoordinateValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceDateTimeValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceDateTimeValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceEmailValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceEmailValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceIntegerValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceIntegerValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceLetterValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceLetterValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceLongTextDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceLongTextValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceMultiPolygonValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceMultiPolygonValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceNumberValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceNumberValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceOrgUnitValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceOrgUnitValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstancePhoneNumberValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstancePhoneNumberValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstancePolygonValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstancePolygonValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceTextValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceTextValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceTimeValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceTimeValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceTrackerAssociateValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceTrackerAssociateValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceURLValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceURLValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceUnitIntervalValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceUnitIntervalValueModel;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceUsernameValueDao;
import com.itinordic.a2d2.trackedentityinstanceattributevalue.TrackedEntityInstanceUsernameValueModel;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeDao;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;
import com.itinordic.a2d2.trackedentitytypeaccess.UserTrackedEntityTypeAccessJoinDao;
import com.itinordic.a2d2.trackedentitytypeaccess.UserTrackedEntityTypeAccessJoinModel;
import com.itinordic.a2d2.trackedentitytypeattribute.TrackedEntityTypeAttributeDao;
import com.itinordic.a2d2.trackedentitytypeattribute.TrackedEntityTypeAttributeModel;
import com.itinordic.a2d2.user.UserCredentialsDao;
import com.itinordic.a2d2.user.UserCredentialsModel;
import com.itinordic.a2d2.user.UserModel;
import com.itinordic.a2d2.user.UserDao;
import com.itinordic.a2d2.granttype.GrantTypeModel;
import com.itinordic.a2d2.usergroup.UserGroupDao;
import com.itinordic.a2d2.usergroup.UserGroupModel;
import com.itinordic.a2d2.userrole.UserRoleDao;
import com.itinordic.a2d2.userrole.UserRoleModel;

@Database(entities = {UserModel.class, AccessTokenModel.class,
        OAuthClientModel.class, GrantTypeModel.class,
        OAuthGrantTypeJoinModel.class, OrganisationUnitModel.class, UserRoleModel.class,
        UserGroupModel.class, UserOrganisationUnitJoinModel.class, UserUserRoleJoinModel.class,
        UserUserGroupJoinModel.class, DeskBellModel.class, UserCredentialsModel.class,
        TrackedEntityTypeModel.class, TrackedEntityAttributeModel.class, ProgramTrackedEntityTypeJoinModel.class,
        UserProgramTrackedEntityAttributeAccessJoinModel.class, UserProgramStageDataElementAccessJoinModel.class,
        UserProgramStageAccessJoinModel.class, ProgramStageModel.class, UserProgramAccessJoinModel.class,
        ProgramModel.class, DataElementModel.class, UserTrackedEntityTypeAccessJoinModel.class,
        DataAccessModel.class, MetadataAccessModel.class,
        TrackedEntityTypeAttributeModel.class, TrackedEntityAttributeAccessModel.class, OptionSetAccessModel.class,
        OptionSetModel.class, OptionAccessModel.class, OptionModel.class, TrackedEntityAttributeOptionSetJoinModel.class,
        TrackedEntityInstanceAgeValueModel.class, TrackedEntityInstanceBooleanValueModel.class,
        TrackedEntityInstanceCoordinateValueModel.class, TrackedEntityInstanceDateTimeValueModel.class,
        TrackedEntityInstanceEmailValueModel.class,
        TrackedEntityInstanceIntegerValueModel.class, TrackedEntityInstanceLetterValueModel.class,
        TrackedEntityInstanceLongTextValueModel.class, TrackedEntityInstanceMultiPolygonValueModel.class,
        TrackedEntityInstanceNumberValueModel.class, TrackedEntityInstanceOrgUnitValueModel.class,
        TrackedEntityInstancePhoneNumberValueModel.class, TrackedEntityInstancePolygonValueModel.class,
        TrackedEntityInstanceTextValueModel.class, TrackedEntityInstanceTimeValueModel.class,
        TrackedEntityInstanceTrackerAssociateValueModel.class, TrackedEntityInstanceUnitIntervalValueModel.class,
        TrackedEntityInstanceURLValueModel.class, TrackedEntityInstanceUsernameValueModel.class,
        TrackedEntityInstanceModel.class}, version = 22)
@TypeConverters({Utils.class})
public abstract class a2d2DB extends RoomDatabase {

    //Users
    public abstract UserDao userDao();
    public abstract UserRoleDao userRoleDao();
    public abstract UserGroupDao userGroupDao();
    public abstract UserCredentialsDao userCredentialsDao();

    //AccessTokens
    public abstract AccessTokenDao accessTokenDao();

    //OAuth Client
    public abstract GrantTypeDao grantTypeDao();
    public abstract OAuthGrantTypeJoinDao oAuthGrantTypeJoinDao();
    public abstract OAuthClientDao oAuthClientDao();

    //org units
    public abstract OrganisationUnitDao organisationUnitDao();

    //user org unit
    public abstract UserOrganisationUnitJoinDao userOrganisationUnitJoinDao();

    //User user role
    public abstract UserUserRoleJoinDao userUserRoleJoinDao();

    //User user group
    public abstract UserUserGroupJoinDao userUserGroupJoinDao();

    //Desk Bell
    public abstract DeskBellDao deskBellDao();

    //Programs
    public abstract ProgramDao programDao();

    //ProgramTrackedEntityTypes
    public abstract ProgramTrackedEntityTypeDao programTrackedEntityTypeDao();

    //programs for which user has metadata access
    public abstract UserProgramAccessDao userProgramAccessDao();

    //TrackedEntityTypes
    public abstract TrackedEntityTypeDao trackedEntityTypeDao();

    //Tracked Entity Data Access
    //Insert Metadata Access
    public abstract MetadataAccessDao metadataAccessDao();

    //Insert data Access
    public abstract DataAccessDao dataAccessDao();

    //insert tracked entity data access join
    public abstract UserTrackedEntityTypeAccessJoinDao userTrackedEntityTypeAccessJoinDao();

    //trackedentitytypeattribute
    public abstract TrackedEntityTypeAttributeDao trackedEntityTypeAttributeDao();
    public abstract TrackedEntityAttributeAccessDao trackedEntityAttributeAccessDao();
    public abstract TrackedEntityAttributeOptionSetJoinDao trackedEntityAttributeOptionSetJoinDao();
    public abstract TrackedEntityAttributeDao trackedEntityAttributeDao();

    //optionsets
    public abstract OptionSetAccessDao optionSetAccessDao();
    public abstract OptionSetDao optionSetDao();
    public abstract OptionAccessDao optionAccessDao();
    public abstract OptionDao optionDao();

    //tracked entity instances
    public abstract TrackedEntityInstanceDao trackedEntityInstanceDao();
    public abstract TrackedEntityInstanceAgeValueDao trackedEntityInstanceAgeValueDao();
    public abstract TrackedEntityInstanceBooleanValueDao trackedEntityInstanceBooleanValueDao();
    public abstract TrackedEntityInstanceCoordinateValueDao trackedEntityInstanceCoordinateValueDao();
    public abstract TrackedEntityInstanceDateTimeValueDao trackedEntityInstanceDateTimeValueDao();
    public abstract TrackedEntityInstanceEmailValueDao trackedEntityInstanceEmailValueDao();
    public abstract TrackedEntityInstanceIntegerValueDao trackedEntityInstanceIntegerValueDao();
    public abstract TrackedEntityInstanceLetterValueDao trackedEntityInstanceLetterValueDao();
    public abstract TrackedEntityInstanceLongTextDao trackedEntityInstanceLongTextDao();
    public abstract TrackedEntityInstanceMultiPolygonValueDao trackedEntityInstanceMultiPolygonValueDao();
    public abstract TrackedEntityInstanceNumberValueDao trackedEntityInstanceNumberValueDao();
    public abstract TrackedEntityInstanceOrgUnitValueDao trackedEntityInstanceOrgUnitValueDao();
    public abstract TrackedEntityInstancePhoneNumberValueDao trackedEntityInstancePhoneNumberValueDao();
    public abstract TrackedEntityInstancePolygonValueDao trackedEntityInstancePolygonValueDao();
    public abstract TrackedEntityInstanceTextValueDao trackedEntityInstanceTextValueDao();
    public abstract TrackedEntityInstanceTimeValueDao trackedEntityInstanceTimeValueDao();
    public abstract TrackedEntityInstanceTrackerAssociateValueDao trackedEntityInstanceTrackerAssociateValueDao();
    public abstract TrackedEntityInstanceUnitIntervalValueDao trackedEntityInstanceUnitIntervalValueDao();
    public abstract TrackedEntityInstanceURLValueDao trackedEntityInstanceURLValueDao();
    public abstract TrackedEntityInstanceUsernameValueDao trackedEntityInstanceUsernameValueDao();

}
