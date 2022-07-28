package com.xxxxxchen.DateDemo;

import java.time.LocalDateTime;

public class DateDemo09 {
    public static void main(String[] args) {
        /*plus增加或者减少月份*/
        /*LocalDateTime localDateTime = LocalDateTime.of(2022, 4, 22, 5, 13, 42);
        LocalDateTime years = localDateTime.plusYears(1);
        System.out.println(years);*/
        LocalDateTime localDateTime = LocalDateTime.of(2022, 4, 22, 5, 13, 42);
        LocalDateTime years = localDateTime.plusYears(-4);
        System.out.println(years);

    }
}
