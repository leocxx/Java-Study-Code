package com.xxxxxchen.arrayList;

import java.util.ArrayList;

/*
*      集合的定义格式，
*      成员方法
*       <>: 泛型，起限制作用，只用于引用数据类型
*
* */
public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        list.add(2,"666");
        System.out.println(list);
    }
}
