package com.xxxxxchen.mTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class mTreeSet4 {
    public static void main(String[] args) {
        /*TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length()-o2.length();
                result = result == 0 ? o1.compareTo(o2) : result;
                return result;
            }
        });*/
        //lambda表达式
        TreeSet<String> set = new TreeSet<>(
                (String o1, String o2)->{
                    int result = o1.length()-o2.length();
                    result = result == 0 ? o1.compareTo(o2) : result;
                    return result;
                }
        );
        set.add("aa");
        set.add("df");
        set.add("d");
        set.add("cx");
        set.add("wer");
        System.out.println(set);
    }
}
