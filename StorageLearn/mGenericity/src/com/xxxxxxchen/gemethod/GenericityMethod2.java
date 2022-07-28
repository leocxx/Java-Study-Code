package com.xxxxxxchen.gemethod;

import java.util.ArrayList;

public class GenericityMethod2 {
    /*自定义一个泛型方法
     * 定义一个方法，传递一个集合和四个元素，再将四个元素放在集合里
     * */
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = addelement(new ArrayList<String>(), "a", "b", "c", "d");
        System.out.println(arrayList1);

        ArrayList<Integer> arrayList2 = addelement(new ArrayList<Integer>(), 1, 2, 3, 4);
        System.out.println(arrayList2);
    }

    public static <T> ArrayList<T> addelement(ArrayList<T> list, T t1, T t2, T t3, T t4) {
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        return list;
    }
}
