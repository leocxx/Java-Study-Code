package com.xxxxxchen.toStream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan,26");
        list.add("lisi,37");
        list.add("wangwu,23");
        list.add("zhaoliu,16");

        Map<String, Integer> map = list.stream().filter(
                (String s) -> {
                    String[] split = s.split(",");
                    int age = Integer.parseInt(split[1]);
                    return age >= 25;
                }
        ).collect(Collectors.toMap(
                (String s) -> {
                    return s.split(",")[0];
                },
                (String s) -> {
                    return Integer.parseInt(s.split(",")[1]);
                }

        ));
        System.out.println(map);
    }
}
