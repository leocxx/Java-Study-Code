package com.xxxxxchen.DateDemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDemo08 {
    public static void main(String[] args) {
        /*格式化和解析*/
        format();
        parse();


    }

    private static void parse() {
        //解析
        String t = "2022年2月18日 8:07:12";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(t, pattern);
        System.out.println(parse);

    }

    private static void format() {
        //格式化
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        //parse = new DateTimeFormatter("yyyy-MM-dd HH:mm:ss");
        String s = localDateTime.format(pattern);
        System.out.println(s);
    }
}
