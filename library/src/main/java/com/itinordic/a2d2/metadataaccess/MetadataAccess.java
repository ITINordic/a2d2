package com.itinordic.a2d2.metadataaccess;

/**
 * Created by regnatpopulus on 01/10/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class MetadataAccess {
    public final boolean read;
    public final boolean update;
    public final boolean externalize;
    public final boolean delete;
    public final boolean write;
    public final boolean manage;
    public final DataAccess data;

    public MetadataAccess(boolean read, boolean update, boolean externalize, boolean delete, boolean write, boolean manage, DataAccess data) {
        this.read = read;
        this.update = update;
        this.externalize = externalize;
        this.delete = delete;
        this.write = write;
        this.manage = manage;
        this.data = data;
    }
}
