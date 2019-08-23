/*A2D2 is an Android library for accessing the DHIS2 API
        Copyright (C) 2019  ITINORDIC AS

        This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU General Public License as published by
        the Free Software Foundation, version 3 of the License.

        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU General Public License for more details.

        You should have received a copy of the GNU General Public License
        along with this program.  If not, see https://www.gnu.org/licenses/.

 */


/**
 * Created by regnatpopulus on 30/03/2018.
 * dev@itinordic.com
 */

package com.itinordic.a2d2;

import androidx.annotation.NonNull;

import com.itinordic.a2d2.attribute.AttributeTask;
import com.itinordic.a2d2.attribute.AttributeTaskImpl;
import com.itinordic.a2d2.dataelement.DataElementTask;
import com.itinordic.a2d2.dataelement.DataElementTaskImpl;
import com.itinordic.a2d2.oauthclient.OAuthClientTask;
import com.itinordic.a2d2.oauthclient.OAuthClientTaskImpl;
import com.itinordic.a2d2.option.OptionTask;
import com.itinordic.a2d2.option.OptionTaskImpl;
import com.itinordic.a2d2.optionset.OptionSetTask;
import com.itinordic.a2d2.optionset.OptionSetTaskImpl;
import com.itinordic.a2d2.organisationunit.OrganisationUnitTask;
import com.itinordic.a2d2.organisationunit.OrganisationUnitTaskImpl;
import com.itinordic.a2d2.program.ProgramTask;
import com.itinordic.a2d2.program.ProgramTaskImpl;
import com.itinordic.a2d2.programrule.ProgramRuleTask;
import com.itinordic.a2d2.programrule.ProgramRuleTaskImpl;
import com.itinordic.a2d2.programruleaction.ProgramRuleActionTask;
import com.itinordic.a2d2.programruleaction.ProgramRuleActionTaskImpl;
import com.itinordic.a2d2.programrulevariable.ProgramRuleVariableTask;
import com.itinordic.a2d2.programrulevariable.ProgramRuleVariableTaskImpl;
import com.itinordic.a2d2.programstage.ProgramStageTask;
import com.itinordic.a2d2.programstage.ProgramStageTaskImpl;
import com.itinordic.a2d2.programstagesection.ProgramStageSectionTask;
import com.itinordic.a2d2.programstagesection.ProgramStageSectionTaskImpl;
import com.itinordic.a2d2.token.AccessTokenTask;
import com.itinordic.a2d2.token.AccessTokenTaskImpl;
import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeTask;
import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeTaskImpl;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceTask;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceTaskImpl;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeTask;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeTaskImpl;
import com.itinordic.a2d2.user.UserTask;
import com.itinordic.a2d2.user.UserTaskImpl;
import com.itinordic.a2d2.usergroup.UserGroupTask;
import com.itinordic.a2d2.usergroup.UserGroupTaskImpl;
import com.itinordic.a2d2.userrole.UserRoleTask;
import com.itinordic.a2d2.userrole.UserRoleTaskImpl;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

public final class a2d2 implements a2d2API {

    private final OkHttpClient okHttpClient;

    private final HttpUrl baseUrl;

    private a2d2Component a2d2component;

    //a2d2 class constructor. It is instantiated by the builder method below
    private a2d2(HttpUrl baseUrl, OkHttpClient okHttpClient) {

        this.baseUrl = baseUrl;
        this.okHttpClient = okHttpClient;
        a2d2component = Daggera2d2Component.builder()
                .a2d2Module(new a2d2Module(baseUrl,okHttpClient ))
                .build();

    }

    //builder that returns a new a2d2 instance when it is passed a URL
    public static class Builder
    {
        private HttpUrl httpUrl;
        private OkHttpClient okHttpClient;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder serverUrl(@NonNull HttpUrl url){
            this.httpUrl = url;
            return this;
        }

        @NonNull
        public Builder okHttpClient(@NonNull OkHttpClient okHttpClient){
            this.okHttpClient = okHttpClient;
            return this;
        }


        public a2d2 build(){

            if (httpUrl == null) {
                throw new IllegalStateException("Server Url must be set first");
            }

            if (okHttpClient == null) {
                throw new IllegalStateException("Okhttp client must be set first");
            }

            return new a2d2(httpUrl, okHttpClient);
        }

    }

    public UserTask userTaskBuilder(){

        return new UserTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public OAuthClientTask oAuthClientTaskBuilder(){

        return new OAuthClientTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public AccessTokenTask accessTokenTaskBuilder(){
        return new AccessTokenTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public OrganisationUnitTask organisationUnitTaskBuilder(){
        return new OrganisationUnitTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public UserRoleTask userRoleTaskBuilder(){
        return new UserRoleTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public UserGroupTask userGroupTaskBuilder(){
        return new UserGroupTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public ProgramTask programTaskBuilder(){
        return new ProgramTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    public TrackedEntityTypeTask trackedEntityTypeTaskBuilder(){
        return new TrackedEntityTypeTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    @Override
    public TrackedEntityAttributeTask trackedEntityAttributeTaskBuilder() {
        return new TrackedEntityAttributeTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    @Override
    public OptionSetTask optionSetTaskBuilder() {
        return new OptionSetTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    @Override
    public OptionTask optionTaskBuilder() {
        return new OptionTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    @Override
    public TrackedEntityInstanceTask trackedEntityInstanceTaskBuilder() {
        return new TrackedEntityInstanceTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    @Override
    public ProgramStageTask programStageTaskBuilder() {
        return new ProgramStageTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    @Override
    public DataElementTask dataElementTaskBuilder() {
        return new DataElementTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    @Override
    public ProgramRuleTask programRuleTaskBuilder() {
        return new ProgramRuleTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    @Override
    public ProgramRuleActionTask programRuleActionTaskBuilder() {
        return new ProgramRuleActionTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    @Override
    public ProgramRuleVariableTask programRuleVariableTaskBuilder() {
        return new ProgramRuleVariableTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    @Override
    public ProgramStageSectionTask programStageSectionTaskBuilder() {
        return new ProgramStageSectionTaskImpl.Builder().a2d2Component(a2d2component).build();
    }

    @Override
    public AttributeTask attributeTaskBuilder() {
        return new AttributeTaskImpl.Builder().a2d2Component(a2d2component).build();
    }


}
