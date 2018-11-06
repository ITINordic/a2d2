/**
 * Created by regnatpopulus on 09/04/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source name must retain the above copyright notice, this
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

package com.itinordic.a2d2.db.join;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.annotation.NonNull;

import com.itinordic.a2d2.granttype.GrantTypeModel;
import com.itinordic.a2d2.oauthclient.OAuthClientModel;

@Entity(tableName = "oauth_granttype_model_join",
        primaryKeys = { "oAuthId", "grantTypeId" },
        foreignKeys = {
                @ForeignKey(entity = OAuthClientModel.class,
                        parentColumns = "id",
                        childColumns = "oAuthId"),
                @ForeignKey(entity = GrantTypeModel.class,
                        parentColumns = "id",
                        childColumns = "grantTypeId")
        }, indices = {@Index("grantTypeId")})

public class OAuthGrantTypeJoinModel {

    @NonNull
    private String oAuthId;
    private int grantTypeId;

    public String getOAuthId() {
        return oAuthId;
    }

    public void setOAuthId(String oAuthId) {
        this.oAuthId = oAuthId;
    }

    public int getGrantTypeId() {
        return grantTypeId;
    }

    public void setGrantTypeId(int grantTypeId) {
        this.grantTypeId = grantTypeId;
    }
}
