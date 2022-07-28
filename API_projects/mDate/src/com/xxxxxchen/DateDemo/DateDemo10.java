package com.xxxxxchen.DateDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateDemo10 {
    public static void main(String[] args) {
        /*时间间隔*/
        //年月日
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2042, 2, 2);
        Period period = Period.between(date1, date2);
        System.out.println(period);//P20Y1M1D
        //获取年
        int years = period.getYears();
        System.out.println(years);  //20
        //获取月
        int months = period.getMonths();
        System.out.println(months);  //1
        //获取日
        int days = period.getDays();
        System.out.println(days); //1
    }
}
