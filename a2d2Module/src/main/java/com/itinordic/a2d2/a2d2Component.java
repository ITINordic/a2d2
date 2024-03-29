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
/**
 * Created by regnatpopulus on 01/04/2018.
 * dev@itinordic.com
 */

package com.itinordic.a2d2;

import com.itinordic.a2d2.attribute.AttributeComponent;
import com.itinordic.a2d2.dataelement.DataElementComponent;
import com.itinordic.a2d2.oauthclient.OAuthClientComponent;
import com.itinordic.a2d2.option.OptionComponent;
import com.itinordic.a2d2.optionset.OptionSetComponent;
import com.itinordic.a2d2.organisationunit.OrganisationUnitComponent;
import com.itinordic.a2d2.program.ProgramComponent;
import com.itinordic.a2d2.programenrolment.ProgramEnrolmentComponent;
import com.itinordic.a2d2.programevent.ProgramEventComponent;
import com.itinordic.a2d2.programrule.ProgramRuleComponent;
import com.itinordic.a2d2.programruleaction.ProgramRuleActionComponent;
import com.itinordic.a2d2.programrulevariable.ProgramRuleVariableComponent;
import com.itinordic.a2d2.programstage.ProgramStageComponent;
import com.itinordic.a2d2.programstagesection.ProgramStageSectionComponent;
import com.itinordic.a2d2.token.AccessTokenComponent;
import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeComponent;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstance;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceComponent;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeComponent;
import com.itinordic.a2d2.user.UserComponent;
import com.itinordic.a2d2.usergroup.UserGroupComponent;
import com.itinordic.a2d2.userrole.UserRoleComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        a2d2Module.class
})
public interface a2d2Component {

    //subcomponents
    OAuthClientComponent.Builder oAuthClientComponent();
    UserComponent.Builder userComponent();
    AccessTokenComponent.Builder accessTokenComponent();
    UserGroupComponent.Builder userGroupComponent();
    OrganisationUnitComponent.Builder organisationUnitComponent();
    UserRoleComponent.Builder userRoleComponent();
    ProgramComponent.Builder programComponent();
    TrackedEntityTypeComponent.Builder trackedEntityTypeComponent();
    TrackedEntityAttributeComponent.Builder trackedEntityAttributeComponent();
    OptionSetComponent.Builder optionSetComponent();
    OptionComponent.Builder optionComponent();
    TrackedEntityInstanceComponent.Builder trackedEntityInstanceComponent();
    ProgramStageComponent.Builder programStageComponent();
    DataElementComponent.Builder dataElementComponent();
    ProgramRuleComponent.Builder programRuleComponent();
    ProgramRuleActionComponent.Builder programRuleActionComponent();
    ProgramRuleVariableComponent.Builder programRuleVariableComponent();
    ProgramStageSectionComponent.Builder programStageSectionComponent();
    AttributeComponent.Builder attributeComponent();
    ProgramEnrolmentComponent.Builder programEnrolmentComponent();
    ProgramEventComponent.Builder programEventComponent();

}
