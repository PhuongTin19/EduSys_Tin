package com.eduSys.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XDate {

    static SimpleDateFormat formater = new SimpleDateFormat();

    //Chuyển từ chuỗi sang date
    public static Date toDate(String date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    //Chuyển từ date sang chuỗi
    public static String toString(Date date, String pattern) {
        formater.applyPattern(pattern);
        return formater.format(date);
    }

    //
    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }
    
    
    
}
