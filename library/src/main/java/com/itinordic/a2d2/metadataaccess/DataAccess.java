package com.itinordic.a2d2.metadataaccess;

/**
 * Created by regnatpopulus on 01/10/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class DataAccess {
    public final boolean read;
    public final boolean write;

    public DataAccess(boolean read, boolean write) {
        this.read = read;
        this.write = write;
    }
}
