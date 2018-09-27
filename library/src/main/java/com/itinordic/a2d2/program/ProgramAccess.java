package com.itinordic.a2d2.program;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class ProgramAccess {

    public final String read;
    public final String update;
    public final String externalize;
    public final String delete;
    public final String write;
    public final String manage;
    public final ProgramDataAccess data;

    public ProgramAccess(String read, String update, String externalize, String delete, String write, String manage, ProgramDataAccess data) {
        this.read = read;
        this.update = update;
        this.externalize = externalize;
        this.delete = delete;
        this.write = write;
        this.manage = manage;
        this.data = data;
    }
}
