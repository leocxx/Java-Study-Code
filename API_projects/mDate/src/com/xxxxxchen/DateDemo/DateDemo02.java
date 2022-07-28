package com.xxxxxchen.DateDemo;

import java.util.Date;

public class DateDemo02 {
    public static void main(String[] args) {
        /*
        * Date类的成员方法
        * */
        //gettime获取时间对象的毫秒值
        method1();
        //gettime设置时间，传递毫秒值
        method2();
    }

    private static void method2() {
        Date date2 = new Date();
        date2.setTime(0L);
        System.out.println(date2); //Thu Jan 01 08:00:00 CST 1970
    }

    private static void method1() {
        Date date1 = new Date();
        long time = date1.getTime();
        System.out.println(time);

        long l = System.currentTimeMillis();
        System.out.println(l);
        //1655548735151
        //1655548735151
    }
}
