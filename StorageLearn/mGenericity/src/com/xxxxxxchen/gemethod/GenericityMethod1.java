package com.xxxxxxchen.gemethod;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericityMethod1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cx1");
        list.add("cx2");
        list.add("cx3");
        list.add("cx4");

        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        String[] array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
    }
}
