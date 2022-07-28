package com.xxxxxchen.mList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    /*List 特有方法*/
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //add(list);
        //remove(list);
        //set(list);
        //get(list);
    }

    private static void get(List<String> list) {
        String s = list.get(2);
        System.out.println(s); //ccc
    }

    private static void set(List<String> list) {
        String s = list.set(2, "sss");
        System.out.println(s);//ccc
        System.out.println(list);//[aaa, bbb, sss]
    }

    private static void remove(List<String> list) {
        //remove删除指定索引处元素，返回删除元素
        String s = list.remove(0);
        System.out.println(s); //aaa
        System.out.println(list); //[bbb, ccc]
    }

    private static void add(List<String> list) {
        //add 在集合的指定位置添加指定元素
        //添加后其他元素会往后一个索引
        list.add(0,"x");
        System.out.println(list);//[x, aaa, bbb, ccc]
    }
}
