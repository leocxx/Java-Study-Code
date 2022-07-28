package com.xxxxxxchen.gentp;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<Object> list3 = new ArrayList<>();

//        printlist(list1);
//        printlist(list2);
        method1(list1);
        method1(list2);
        //method1(list3);//超出了Number。extends表示的是Number以及它的所有子类
        //method2(list1);//super表示的是Number以及它的父类
        method2(list2);
        method2(list3);
    }

    private static void method1(ArrayList<? extends Number> list) {
    }
    private static void method2(ArrayList<? super Number> list) {
    }
    private static void printlist(ArrayList<?> list) {
    }
}
