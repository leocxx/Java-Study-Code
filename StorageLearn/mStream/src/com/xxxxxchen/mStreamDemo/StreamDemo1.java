package com.xxxxxchen.mStreamDemo;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {

        //集合的批量添加
        ArrayList<String> list1 = new ArrayList<>(List.of("张三丰","张翠山","张无忌","谢四","王六","陈麻子"));
        //
        ArrayList<String> list2 = new ArrayList<>();
        //遍历list1，得到张开头
        for (String s : list1) {
            if(s.startsWith("张")){
                list2.add(s);
            }
        }
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if(list2.size() == 3){
                list3.add(s);
            }
        }
        for (String s : list3) {
            System.out.println(s);
        }
        System.out.println("=================");

        list1.stream().filter(s -> s.startsWith("张"))
                .filter(s ->s.length()==3)
                .forEach(s -> System.out.println(s));
    }
}
