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
 * Created by regnatpopulus on 02/04/2018.
 * dev@itinordic.com
 */

package com.itinordic.a2d2.user;

import java.util.List;

public class User {

    public final String id;
    public final String name;
    public final String displayName;
    public final String created;
    public final String lastUpdated;
    public final String surname;
    public final String firstName;
    public final String email;
    public final String phoneNumber;
    public final UserCredentials userCredentials;
    public final List<UserOrganisationUnit> organisationUnits;
    public final List<UserUserGroup> userGroups;

    public User(String id, String name, String displayName, String created, String lastUpdated, String surname, String firstName, String email, String phoneNumber, UserCredentials userCredentials, List<UserOrganisationUnit> organisationUnits, List<UserUserGroup> userGroups) {
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.surname = surname;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userCredentials = userCredentials;
        this.organisationUnits = organisationUnits;
        this.userGroups = userGroups;
    }
}
