package com.icyf.dateLearn;

import java.util.Calendar;

/**
 * @Author: ESy
 * @Date: 2020/5/26 20:34
 */
public class CalendarLearn {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
        /**
         * 输出结果：
         * java.util.GregorianCalendar
         * [time=1590496678416,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
         * zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,
         * useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1
         * ,ERA=1,YEAR=2020,MONTH=4,WEEK_OF_YEAR=22,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,
         * DAY_OF_YEAR=147,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,
         * MINUTE=37,SECOND=58,MILLISECOND=416,ZONE_OFFSET=28800000,DST_OFFSET=0]
         */


        /**
         * For the date fields ：
         *
         *  YEAR + MONTH + DAY_OF_MONTH
         *  YEAR + MONTH + WEEK_OF_MONTH + DAY_OF_WEEK
         *  YEAR + MONTH + DAY_OF_WEEK_IN_MONTH + DAY_OF_WEEK
         *  YEAR + DAY_OF_YEAR
         *  YEAR + DAY_OF_WEEK + WEEK_OF_YEAR
         *  For the time of day fields ：
         *  HOUR_OF_DAY
         *  AM_PM + HOUR
         */


        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1; //Calendar中Month是从0开始的
//        int date = calendar.get(Calendar.DAY_OF_MONTH);
        int date = calendar.get(Calendar.DATE); //DATE 和 DAY_OF_MONTH 没有区别

        System.out.println(year+"年"+month+"月"+date+"日"); //2020年5月26日


        calendar.add(Calendar.YEAR,-10); //使年份减去10
        printCalendar(calendar); //2010年4月26日

        calendar.set(2222,11,11); //设置年月日（可继续添加参数设置时间）
        printCalendar(calendar); //2222年11月11日
    }




    public static void printCalendar(Calendar calendar){
        System.out.println(calendar.get(Calendar.YEAR)+"年"+
                calendar.get(Calendar.MONTH)+"月"+
                calendar.get(Calendar.DATE)+"日");
    }
}
