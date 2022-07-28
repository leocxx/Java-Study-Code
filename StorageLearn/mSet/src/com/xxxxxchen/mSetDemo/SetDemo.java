package com.xxxxxchen.mSetDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("a");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");


        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("----------------------");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
