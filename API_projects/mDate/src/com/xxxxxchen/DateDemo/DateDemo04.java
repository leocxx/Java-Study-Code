package com.xxxxxchen.DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo04 {
    public static void main(String[] args) throws ParseException {
        /*秒杀活动
        *  开始时间：2022-06-18 00:00:00
        *  结束时间：2022-06-18 00:10:00
        *   小红下单时间:2022-06-18 00:03:47
        *   小化下单时间:2022-06-18 00:11:23
        *    控制台输出打印谁抢上了
        * */
        String start = "2022-06-18 00:00:00";
        String end = "2022-06-18 00:10:00";
        String hong = "2022-06-18 00:03:47";
        String hua = "2022-06-18 00:11:23";

        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long starttime = time.parse(start).getTime();
        long endtime = time.parse(end).getTime();
        long hongtime = time.parse(hong).getTime();
        long huatime = time.parse(hua).getTime();

        if(hongtime >= starttime && hongtime <= endtime){
            System.out.println("小红参加了");
        }else {
            System.out.println("小红没参加上");
        }
        System.out.println("---------------------------------");
        if(huatime >= starttime && huatime <= endtime){
            System.out.println("小花参加了");
        }else {
            System.out.println("小花没参加上");
        }
    }
}
