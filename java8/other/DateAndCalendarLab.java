/*
 * @Author: Dzzzzzzy
 * @Date: 2023-03-15 16:09:45
 */
package java8.other;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendarLab {
    
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        System.out.println("date: " + date);
        System.out.println("calendar: " + calendar);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM hh:mm:ss");
        Date date2 = null;
        try {
            date2 = dateFormat.parse("2023-03 5:34:12");
            System.out.println(dateFormat.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date2);
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM a hh:mm:ss");
        System.out.println(dateFormat2.format(date2));
    }

}
// ┌ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ┐

// │   (\_(\     (\_/)     (\_/)     (\_/)      (\(\   │
//     ( -.-)    (•.•)     (>.<)     (^.^)     (='.')
// │  C(")_(")  (")_(")   (")_(")   (")_(")   O(_")")  │

// └ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ┘
