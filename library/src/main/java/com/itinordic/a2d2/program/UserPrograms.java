package com.itinordic.a2d2.program;

import java.util.List;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class UserPrograms {
    public final List<Program> programs;

    public UserPrograms(List<Program> programs) {
        this.programs = programs;
    }

    public List<Program> getPrograms() {
        return programs;
    }
}
