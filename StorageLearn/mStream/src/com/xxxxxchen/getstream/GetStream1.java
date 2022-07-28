package com.xxxxxchen.getstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 *
 * 获取Stream流
 *
 * */
public class GetStream1 {
    public static void main(String[] args) {
        //collectionGet();
        //mapGet();
        //arrayGet();
        //同种数据类型的多个数据
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
    }

    private static void arrayGet() {
        //数组
        int [] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(s -> System.out.println(s));
    }

    private static void mapGet() {
        //双列集合
        HashMap<String,Integer> map = new HashMap<>();
        map.put("zhangsan",23);
        map.put("lisi",24);
        map.put("wangwu",25);
        map.put("zhaoliu",26);
        //间接生成
        //(1)keyset()
        map.keySet().stream().forEach(s -> System.out.println(s));
        System.out.println("=======================");
        //(2)entryset()
        map.entrySet().stream().forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));
    }

    private static void collectionGet() {
        //单列集合
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //直接使用接口方法stream()
        list.stream().forEach(s -> System.out.println(s));
    }
}
