package com.xxxxxchen.mIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class testDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> li = list.iterator();
        while (li.hasNext()) {
            String s = li.next();
            if ("b".equals(s)) {
                li.remove();
            }
        }
        System.out.println(list);
    }
}
