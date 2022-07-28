package com.xxxxxchen.mLinkedList;

import java.util.LinkedList;

public class LinkedLIstDemo2 {
    public static void main(String[] args) {
        /*LinkedList 特有方法*/
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        addfrist(list);
        addlast(list);
        getfrist(list);
        getlast(list);
        removefrist(list);
        removelast(list);

    }

    private static void removelast(LinkedList<String> list) {
        //从此列表中删除并返回最后一个元素
        String s = list.removeLast();
        System.out.println(s);
    }

    private static void removefrist(LinkedList<String> list) {
        //从此列表中删除并返回第一个元素
        String s = list.removeFirst();
        System.out.println(s);
    }

    private static void getlast(LinkedList<String> list) {
        //getFrist 返回列表最后一个元素
        String s = list.getLast();
        System.out.println(s);  //o.o
    }

    private static void getfrist(LinkedList<String> list) {
        //getFrist 返回列表第一个元素
        String s = list.getFirst();
        System.out.println(s);//qqq
    }

    private static void addlast(LinkedList<String> list) {
        //addLast 将指定元素追加到此列表末尾
        list.addLast("o.o");
        System.out.println(list);//[qqq, a, b, c, d, e, o.o]
    }

    private static void addfrist(LinkedList<String> list) {
        //addFirst 在该列表开头插入指定元素
        list.addFirst("qqq");
        System.out.println(list);//[qqq, a, b, c, d, e]
    }
}
