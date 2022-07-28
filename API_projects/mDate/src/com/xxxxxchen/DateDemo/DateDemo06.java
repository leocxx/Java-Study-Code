package com.xxxxxchen.DateDemo;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DateDemo06 {
    public static void main(String[] args) {
        /*LocalDateTime获取对象*/
        LocalDateTime time = LocalDateTime.of(2022, 3, 20, 15, 22, 31);
        //获取年
        int year = time.getYear();
        System.out.println(year+" 年");
        //获取月
        int month = time.getMonthValue();
        System.out.println(month+" 月");
        //获取天
        int day = time.getDayOfMonth();
        System.out.println(day+" 天");
        //获取一年中的第几天
        int day1 = time.getDayOfYear();
        System.out.println(day1);
        //获取星期
        DayOfWeek week = time.getDayOfWeek();
        System.out.println(week);
        //获取分钟
        int minute = time.getMinute();
        System.out.println(minute);
        //获取小时
        int hour = time.getHour();
        System.out.println(hour);
    }
}
