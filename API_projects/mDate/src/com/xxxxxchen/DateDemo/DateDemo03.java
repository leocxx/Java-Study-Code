package com.xxxxxchen.DateDemo;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo03 {
    public static void main(String[] args) throws ParseException {
        /*
        * SimpleDateFormat
        * 对Date对象进行格式化和解析
        * yyyy-MM-dd HH:mm:ss 或者 yyyy年MM月dd日
        * */
        time1(); //格式化
        time2();  //解析

    }

    private static void time2() throws ParseException {
        String s = "2022-06-18 18:59:19";
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date parse = time.parse(s);
        System.out.println(parse);//Sat Jun 18 18:59:19 CST 2022
    }

    private static void time1() {
        Date date = new Date(); //获取当前的时间

        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = time.format(date);
        System.out.println(format);  //2022-06-18 18:59:19
    }
}
