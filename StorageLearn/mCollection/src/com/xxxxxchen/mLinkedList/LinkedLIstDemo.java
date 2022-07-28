package com.xxxxxchen.mLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLIstDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //普通
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------");
        //迭代器
        Iterator<String> li = list.iterator();
        while (li.hasNext()) {
            String s = li.next();
            System.out.println(s);
        }
        System.out.println("-----------------------");
        //增强
        for (String s : list) {
            System.out.println(s);
        }
    }
}
