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

package com.itinordic.a2d2.programrulevariable;

import com.itinordic.a2d2.common.BaseIdentifiableObject;
import com.itinordic.a2d2.metadataaccess.MetadataAccess;


/**
 * Created by regnatpopulus on 2019-05-27.
 * dev@itinordic.com
 */
public class ProgramRuleVariable {

    public final String lastUpdated;
    public final String id;
    public final String created;
    public final String name;
    public final String displayName;
    public final String programRuleVariableSourceType;
    public final boolean useCodeForOptionSet;
    public final MetadataAccess access;
    public final BaseIdentifiableObject program;
    public final BaseIdentifiableObject dataElement;
    public final BaseIdentifiableObject trackedEntityAttribute;


    public ProgramRuleVariable(String lastUpdated, String id, String created, String name, String displayName, String programRuleVariableSourceType, boolean useCodeForOptionSet, MetadataAccess access, BaseIdentifiableObject program, BaseIdentifiableObject dataElement, BaseIdentifiableObject trackedEntityAttribute) {
        this.lastUpdated = lastUpdated;
        this.id = id;
        this.created = created;
        this.name = name;
        this.displayName = displayName;
        this.programRuleVariableSourceType = programRuleVariableSourceType;
        this.useCodeForOptionSet = useCodeForOptionSet;
        this.access = access;
        this.program = program;
        this.dataElement = dataElement;
        this.trackedEntityAttribute = trackedEntityAttribute;
    }
}
