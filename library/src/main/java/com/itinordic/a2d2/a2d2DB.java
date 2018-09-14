/**
 * Created by regnatpopulus on 08/04/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.itinordic.a2d2;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.itinordic.a2d2.common.Utils;
import com.itinordic.a2d2.db.join.OAuthGrantTypeJoinModel;
import com.itinordic.a2d2.db.join.OAuthGrantTypeJoinDao;
import com.itinordic.a2d2.db.join.UserOrganisationUnitJoinDao;
import com.itinordic.a2d2.db.join.UserOrganisationUnitJoinModel;
import com.itinordic.a2d2.db.join.UserUserGroupJoinDao;
import com.itinordic.a2d2.db.join.UserUserGroupJoinModel;
import com.itinordic.a2d2.db.join.UserUserRoleJoinDao;
import com.itinordic.a2d2.db.join.UserUserRoleJoinModel;
import com.itinordic.a2d2.deskbell.DeskBellDao;
import com.itinordic.a2d2.deskbell.DeskBellModel;
import com.itinordic.a2d2.granttype.*;
import com.itinordic.a2d2.oauthclient.OAuthClientModel;
import com.itinordic.a2d2.oauthclient.OAuthClientDao;
import com.itinordic.a2d2.organisationunit.OrganisationUnitDao;
import com.itinordic.a2d2.organisationunit.OrganisationUnitModel;
import com.itinordic.a2d2.token.AccessTokenModel;
import com.itinordic.a2d2.token.AccessTokenDao;
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
        UserUserGroupJoinModel.class, DeskBellModel.class, UserCredentialsModel.class}, version = 4)
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



}
