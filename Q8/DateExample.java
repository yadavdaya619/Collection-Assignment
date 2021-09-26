package com.ttn.Q8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateExample {
    public static void main(String[] args)throws Exception {

        String pattern="dd-MM-yyyy";
        SimpleDateFormat dateFormat= new SimpleDateFormat(pattern);
        String date = dateFormat.format(new Date());
        System.out.println(date);
    }
}
