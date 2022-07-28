package com.xxxxxchen.mCollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        //Collection 单列集合顶层接口
        //创建Collection的对象注意点：1.多态的方式  2.具体的实现类Arraylist
        Collection<String> collection = new ArrayList<>();
        collection.add("ccc");
        collection.add("xxx");
        collection.add("qqq");
        //add(collection);
        //remove(collection);
        //removeIf(collection);
        //clear(collection);
        //contains(collection);
        //isEmpty(collection);
        //size(collection);
    }

    private static void size(Collection<String> collection) {
        //size 返回集合的长度，元素个数
        int size = collection.size();
        System.out.println(size);
    }

    private static void isEmpty(Collection<String> collection) {
        //isEmpty 判断是否为空
        boolean empty = collection.isEmpty();
        System.out.println(empty);
    }

    private static void contains(Collection<String> collection) {
        //contains判断集合是否存在指定元素，返回true和false
        boolean contains = collection.contains("ccc");
        boolean contains1 = collection.contains("cccx");
        System.out.println(contains);
        System.out.println(contains1);
    }

    private static void clear(Collection<String> collection) {
        //clear清空集合
        collection.clear();
        System.out.println(collection);
    }

    private static void removeIf(Collection<String> collection) {
        //removeIf()根据条件删除
        collection.removeIf(
                (String s)->{
                    return s.length() == 3;
                }
        );
        System.out.println(collection);
    }

    private static void remove(Collection<String> collection) {
        //remove 从集合中移除指定元素
        boolean result = collection.remove("ccc");
        //带有返回值，成功返回true，失败返回false
        System.out.println(result);
        System.out.println(collection);
    }

    private static void add(Collection<String> collection) {
        //add 在集合里添加元素
        collection.add("ccc");
        collection.add("xxx");
        collection.add("qqq");
        System.out.println(collection);
    }
}
