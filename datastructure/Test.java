/*
 * @Author: Dzzzzzzy
 * @Date: 2023-02-10 15:02:47
 */
package datastructure;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Test{

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy:MM:dd");
    try {
        dateFormat.set2DigitYearStart(new Date(978278400000L));
        System.out.println(dateFormat.parse("00:12:01"));
    } catch (ParseException e) {
        e.printStackTrace();
    }
    }


}