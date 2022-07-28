package com.xxxxxchen.mTreeSet;

import java.util.TreeSet;

public class mTreeSet1 {
    /**
     TreeSet 特点：不包含重复元素，不带索引方法  对内部元素可以按照规则排序
     */
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(7);
        set.add(4);
        set.add(2);
        set.add(6);
        set.add(3);
        set.add(5);
        set.add(1);
        System.out.println(set);//[1, 2, 3, 4, 5, 6, 7]
    }
}
