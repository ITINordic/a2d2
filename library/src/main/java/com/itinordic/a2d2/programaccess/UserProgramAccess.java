package com.itinordic.a2d2.programaccess;

import com.itinordic.a2d2.programdataccess.ProgramDataAccess;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class UserProgramAccess {

    public final boolean read;
    public final boolean update;
    public final boolean externalize;
    public final boolean delete;
    public final boolean write;
    public final boolean manage;
    public final ProgramDataAccess data;

    public UserProgramAccess(boolean read, boolean update, boolean externalize, boolean delete, boolean write, boolean manage, ProgramDataAccess data) {
        this.read = read;
        this.update = update;
        this.externalize = externalize;
        this.delete = delete;
        this.write = write;
        this.manage = manage;
        this.data = data;
    }
}
