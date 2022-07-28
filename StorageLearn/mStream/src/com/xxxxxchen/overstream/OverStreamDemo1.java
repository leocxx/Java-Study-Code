package com.xxxxxchen.overstream;

import java.util.ArrayList;
import java.util.function.Consumer;

public class OverStreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张翠山");
        list.add("张无忌");
        list.add("谢四");
        list.add("王六");
        list.add("张良");

        foreach(list);
        count(list);
    }

    private static void count(ArrayList<String> list) {
        //long count 返回此流中的元素数
        long count = list.stream().count();
        System.out.println(count);//6
    }

    private static void foreach(ArrayList<String> list) {
    /* list.stream().forEach(
             new Consumer<String>() {
                 @Override
                 public void accept(String s) {
                     System.out.println(s);
                 }
             }
     );*/
        /*使用lambda
        因为接口中只有一个方法
        list.stream().forEach(
                (String s) -> {
                    System.out.println(s);
                }
        );*/
        list.stream().forEach(s -> System.out.println(s));
    }
}
