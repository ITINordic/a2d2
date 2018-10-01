package com.itinordic.a2d2.programdataccess;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class UserProgramDataAccess {
    public final boolean read;
    public final boolean write;

    public UserProgramDataAccess(boolean read, boolean write) {
        this.read = read;
        this.write = write;
    }


}
