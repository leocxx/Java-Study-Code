package com.xxxxxchen.mmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mMapTest03 {
    public static void main(String[] args) {
        /*Map集合遍历*/
        Map<String, String> map = new HashMap<>();
        map.put("1", "1的值");
        map.put("2", "2的值");
        map.put("3", "3的值");
        map.put("4", "4的值");
        map.put("5", "5的值");
        //keyset()获取所有的键
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //通过key来找值
            String value = map.get(key);
            System.out.println(key + "----" + value);
        }
    }
}
