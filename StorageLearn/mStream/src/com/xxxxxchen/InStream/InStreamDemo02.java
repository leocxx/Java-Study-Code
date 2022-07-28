package com.xxxxxchen.InStream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.stream.Stream;

public class InStreamDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三丰");
        list1.add("张翠山");
        list1.add("张无忌");
        list1.add("谢四");
        list1.add("王六");
        list1.add("张良");

        //limit,截取指定参数的数值,去后留前
        //list.stream().limit(2).forEach(s -> System.out.println(s));

        //skip.跳过指定参数个数的数据,去前留后
        //list.stream().skip(3).forEach(s -> System.out.println(s));

        //static concat（a,b） 合并a b 两流为一流
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三丰");
        list2.add("张翠山");
        list2.add("张无忌");
        list2.add("张无忌");
        list2.add("张无忌");
        list2.add("谢四");
        list2.add("王六");
        list2.add("张良");
        list2.add("张良");
        list2.add("张良");
        list2.add("张良");

       /* Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();*/

       // Stream.concat(list1.stream(),list2.stream()).forEach(s -> System.out.println(s));

        //distinct 去除流中重复的元素
        list2.stream().distinct().forEach(s -> System.out.println(s));
    }
}
