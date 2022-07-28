package com.xxxxxchen.DateDemo;

import java.time.LocalDateTime;

public class DateDemo05 {
    /*JDK8 LocalDateTime类*/
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime now1 = LocalDateTime.of(2022,11,3,22,33,12);
        System.out.println(now1);
    }
}
