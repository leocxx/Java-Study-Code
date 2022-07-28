package com.xxxxxchen.DateDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateDemo07 {
    public static void main(String[] args) {
        /*对象转换*/
        LocalDateTime dateTime = LocalDateTime.of(2022, 4, 22, 4, 13, 44);
        //转换为年月日
        LocalDate date = dateTime.toLocalDate();
        System.out.println(date);
        //转换为时分秒
        LocalTime time = dateTime.toLocalTime();
        System.out.println(time);
    }
}
