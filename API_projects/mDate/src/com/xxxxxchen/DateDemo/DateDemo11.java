package com.xxxxxchen.DateDemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateDemo11 {
    public static void main(String[] args) {
        /*时间间隔*/
        //时分秒
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 1, 1, 10, 10, 10);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, 1, 1, 12, 45, 36);
        Duration duration = Duration.between(localDateTime1, localDateTime2);
        System.out.println(duration); //PT2H35M26S
        //获取时
        long hours = duration.toHours();
        System.out.println(hours);//2
        //获取分
        long minutes = duration.toMinutes();
        System.out.println(minutes);//155
        //获取秒
        long millis = duration.toMillis();
        System.out.println(millis); //9326000
    }
}
