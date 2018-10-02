package com.itinordic.a2d2.dataelementaccess;

public class UserDataElementAccess {

    public final boolean read;
    public final boolean update;
    public final boolean externalize;
    public final boolean delete;
    public final boolean write;
    public final boolean manage;

    public UserDataElementAccess(boolean read, boolean update, boolean externalize, boolean delete, boolean write, boolean manage) {
        this.read = read;
        this.update = update;
        this.externalize = externalize;
        this.delete = delete;
        this.write = write;
        this.manage = manage;
    }
}
