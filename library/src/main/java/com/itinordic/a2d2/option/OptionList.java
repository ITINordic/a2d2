package com.itinordic.a2d2.option;

import java.util.List;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class OptionList {
    public final List<Option> options;

    public OptionList(List<Option> options) {
        this.options = options;
    }

    public List<Option> getOptions() {
        return options;
    }
}
