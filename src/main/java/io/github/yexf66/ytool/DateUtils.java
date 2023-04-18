package io.github.yexf66.ytool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    /**
     * 格式化时间
     *
     * @param date   传入时间
     * @param format 格式化字符串
     */
    public static String format(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}
