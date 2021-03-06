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

package com.itinordic.a2d2.common;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 */
public class Access {
    public final boolean read;
    public final boolean update;
    public final boolean externalize;
    public final boolean delete;
    public final boolean write;
    public final boolean manage;

    public Access(boolean read, boolean update, boolean externalize, boolean delete, boolean write, boolean manage) {
        this.read = read;
        this.update = update;
        this.externalize = externalize;
        this.delete = delete;
        this.write = write;
        this.manage = manage;
    }
}
