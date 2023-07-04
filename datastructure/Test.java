/*
 * @Author: Dzzzzzzy
 * @Date: 2023-02-10 15:02:47
 */
package datastructure;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class Test{

    public static void main(String[] args) throws ParseException {
        Date toDeliveryTime = new Date();
        String dateString;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateString = dateFormat.format(toDeliveryTime);
        System.out.println(dateString);
        toDeliveryTime = dateFormat.parse(dateString);
        System.out.println(toDeliveryTime);
        Locale loc = Locale.getDefault();
        Calendar calendar = new GregorianCalendar(loc);
        calendar.setTime(toDeliveryTime);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.HOUR, 24);
        System.out.println(calendar.getTime());

    }

}