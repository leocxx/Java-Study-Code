package com.xxxxxchen.mmap;

import java.util.HashMap;
import java.util.Map;

public class mMapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("cx001","zhangsan");
        map.put("cx002","lisi");
        map.put("cx003","wangwu");

        System.out.println(map);
    }
}
