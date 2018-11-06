/**
 * Created by regnatpopulus on 02/04/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source name must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.itinordic.a2d2.common;

import androidx.room.TypeConverter;

import java.text.ParseException;
import java.util.Date;

public class Utils {

    public static final SafeDateFormat DATE_FORMAT = new SafeDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
    public static final SafeDateFormat SPACE_DATE_FORMAT = new SafeDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @TypeConverter
    public static Date parseDate(String dateStr) {

        if (dateStr != null) {
            try {
                return Utils.DATE_FORMAT.parse(dateStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        } else {
            return null;
        }
    }

    public static Date parseSpaceDate(String dateStr) throws ParseException {
        return Utils.SPACE_DATE_FORMAT.parse(dateStr);
    }

    @TypeConverter
    public static String formatDate(Date date) {

        if (date != null) {
            try {
                return Utils.DATE_FORMAT.format(date);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        } else {
            return null;
        }
    }

    @TypeConverter
    public static boolean parseBoolean(String boolStr){
        return Boolean.parseBoolean(boolStr);
    }

    @TypeConverter
    public static int parseInt(String intStr){
        return Integer.parseInt(intStr);
    }

}
