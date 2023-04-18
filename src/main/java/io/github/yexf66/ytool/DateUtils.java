package io.github.yexf66.ytool;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    /**
     * date format
     *
     * @param date   string
     * @param format format
     */
    public static String format(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * add days
     *
     * @param date date
     * @param num  day
     */
    public static Date addDays(Date date, int num) {
        if (date == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, num);
        return cal.getTime();
    }

    /**
     * addHours
     *
     * @param date date
     * @param num  hours
     */
    public static Date addHours(Date date, int num) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, num);
        return calendar.getTime();
    }


    /**
     * add minutes
     *
     * @param date date
     * @param num  min
     */
    public static Date addMinutes(Date date, int num) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, num);
        return calendar.getTime();
    }


}
