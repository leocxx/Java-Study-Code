package com.xxxxxchen.mhashset;

import java.util.HashSet;
import java.util.Iterator;

public class mHashSet01 {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Java");
        list.add("Java");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("========================");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
