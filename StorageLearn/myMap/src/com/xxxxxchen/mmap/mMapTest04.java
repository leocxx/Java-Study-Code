package com.xxxxxchen.mmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mMapTest04 {
    public static void main(String[] args) {
        /*Map集合第二种遍历*/
        Map<String, String> map = new HashMap<>();

        map.put("1", "1的值");
        map.put("2", "2的值");
        map.put("3", "3的值");
        map.put("4", "4的值");
        map.put("5", "5的值");
        //先获得集合中的键值对entryset()
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //然后依次获得键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "------" + value);
        }
    }
}
