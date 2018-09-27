package com.itinordic.a2d2.programdataccess;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class ProgramDataAccess {
    public final String read;
    public final String write;

    public ProgramDataAccess(String read, String write) {
        this.read = read;
        this.write = write;
    }
}
