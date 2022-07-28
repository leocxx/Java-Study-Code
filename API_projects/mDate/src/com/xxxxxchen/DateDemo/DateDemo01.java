package com.xxxxxchen.DateDemo;

import java.util.Date;

public class DateDemo01 {
    /*
     * Date类构造方法
     *
     * */
    public static void main(String[] args) {
        Date dete1 = new Date();   //计算机当前时间 Sat Jun 18 18:16:26 CST 2022
        System.out.println(dete1);

        Date date2 = new Date(3600L * 1000);  //Thu Jan 01 09:00:00 CST 1970
        System.out.println(date2);
    }
}
