package com.xxxxxchen.InStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class InStreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张翠山");
        list.add("张无忌");
        list.add("谢四");
        list.add("王六");
        list.add("张良");
        //filter
        list.stream().forEach(s -> System.out.println(s));

    }
}
