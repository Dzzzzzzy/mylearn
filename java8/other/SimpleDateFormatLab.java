/*
 * @Author: Dzzzzzzy
 * @Date: 2023-08-31 10:41:25
 */
package java8.other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

public class SimpleDateFormatLab {

    private static final AtomicBoolean STOP = new AtomicBoolean();
    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyy-M-d"); // 非线程安全

    public static void main(String[] args) throws ParseException {
        Runnable runnable = () -> {
            int count = 0;
            while (!STOP.get()) {
                try {
                    FORMATTER.parse("2023-7-15");
                } catch (Exception e) {
                    e.printStackTrace();
                    if (++count > 3) {
                        STOP.set(true);
                    }
                }
            }
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
