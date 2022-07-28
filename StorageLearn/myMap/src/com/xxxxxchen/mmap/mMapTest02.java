package com.xxxxxchen.mmap;
/*Map集合中的一些基本方法*/

import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarOutputStream;

public class mMapTest02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("cx001","小r");
        map.put("cx002","小w");
        map.put("cx003","小x");
        map.put("cx004","小a");

        //mput(map);
        //remove(map);
        //clear(map);
        //conkey(map);
        //convalue(map);
        //empty(map);
        //size(map);

    }

    private static void size(Map<String, String> map) {
        //int size() 集合长度，键值对的个数
        int size = map.size();
        System.out.println(size);//4
    }

    private static void empty(Map<String, String> map) {
        //isEmpty()判断集合是否为空
        boolean empty = map.isEmpty();
        System.out.println(empty);
    }

    private static void convalue(Map<String, String> map) {
        //boolean contains value(v) 判断集合中是否包含指定的值
        boolean value1 = map.containsValue("小x");
        System.out.println(value1);//true
        boolean value2 = map.containsValue("df");
        System.out.println(value2);//false
    }

    private static void conkey(Map<String, String> map) {
        //boolean contains key(k) 判断集合中是否包含指定的健
        boolean b = map.containsKey("cx002");
        System.out.println(b); //true
        boolean b1 = map.containsKey("cx008");
        System.out.println(b1);//false
    }

    private static void clear(Map<String, String> map) {
        //clear()清除所有键值对元素
        map.clear();
        System.out.println(map);//{ }
    }

    private static void remove(Map<String, String> map) {
        //remove(k)根据键删除键值对应的元素
        String s = map.remove("cx003");
        System.out.println(s);//小x
        System.out.println(map);//{cx004=小a, cx001=小r, cx002=小w}
    }

    private static void mput(Map<String, String> map) {
        //put();添加元素
        //如果添加的元素存在，就会覆盖原先值
        map.put("cx005","小b");
        System.out.println(map);
    }
}
