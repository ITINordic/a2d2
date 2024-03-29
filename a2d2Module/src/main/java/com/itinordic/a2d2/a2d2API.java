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
 * Created by regnatpopulus on 06/04/2018.
 * dev@itinordic.com
 */

package com.itinordic.a2d2;

import com.itinordic.a2d2.attribute.AttributeTask;
import com.itinordic.a2d2.dataelement.DataElementTask;
import com.itinordic.a2d2.oauthclient.OAuthClientTask;
import com.itinordic.a2d2.option.OptionTask;
import com.itinordic.a2d2.optionset.OptionSetTask;
import com.itinordic.a2d2.organisationunit.OrganisationUnitTask;
import com.itinordic.a2d2.program.ProgramTask;
import com.itinordic.a2d2.programenrolment.ProgramEnrolmentTask;
import com.itinordic.a2d2.programevent.ProgramEventTask;
import com.itinordic.a2d2.programrule.ProgramRuleTask;
import com.itinordic.a2d2.programruleaction.ProgramRuleActionTask;
import com.itinordic.a2d2.programrulevariable.ProgramRuleVariableTask;
import com.itinordic.a2d2.programstage.ProgramStageTask;
import com.itinordic.a2d2.programstagesection.ProgramStageSectionTask;
import com.itinordic.a2d2.token.AccessTokenTask;
import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeTask;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceTask;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeTask;
import com.itinordic.a2d2.user.UserTask;
import com.itinordic.a2d2.usergroup.UserGroupTask;
import com.itinordic.a2d2.userrole.UserRoleTask;

import okhttp3.OkHttpClient;

public interface a2d2API {

    UserTask userTaskBuilder();

    OAuthClientTask oAuthClientTaskBuilder();

    AccessTokenTask accessTokenTaskBuilder();

    OrganisationUnitTask organisationUnitTaskBuilder();

    UserRoleTask userRoleTaskBuilder();

    UserGroupTask userGroupTaskBuilder();

    ProgramTask programTaskBuilder();

    TrackedEntityTypeTask trackedEntityTypeTaskBuilder();

    TrackedEntityAttributeTask trackedEntityAttributeTaskBuilder();

    OptionSetTask optionSetTaskBuilder();

    OptionTask optionTaskBuilder();

    TrackedEntityInstanceTask trackedEntityInstanceTaskBuilder();

    ProgramStageTask programStageTaskBuilder();

    DataElementTask dataElementTaskBuilder();

    ProgramRuleTask programRuleTaskBuilder();

    ProgramRuleActionTask programRuleActionTaskBuilder();

    ProgramRuleVariableTask programRuleVariableTaskBuilder();

    ProgramStageSectionTask programStageSectionTaskBuilder();

    AttributeTask attributeTaskBuilder();

    ProgramEnrolmentTask programEnrolmentTaskBuilder();

    ProgramEventTask programEventTaskBuilder();

}
