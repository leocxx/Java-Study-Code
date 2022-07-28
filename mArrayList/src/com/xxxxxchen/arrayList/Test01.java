package com.xxxxxchen.arrayList;

import java.util.ArrayList;

/*
       需求：创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合

       思路：
           1. 创建集合对象
           2. 往集合中添加字符串对象
           3. 遍历集合
                 获取到集合中的每一个元素，这个通过get(int index)方法实现
                 获取到集合的长度，这个通过size()方法实现

    */
public class Test01 {
    public static void main(String[] args) {
        //1. 创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //2. 往集合中添加字符串对象
        list.add("1");
        list.add("2");
        list.add("3");

        //3. 遍历集合
        //  获取到集合中的每一个元素，这个通过get(int index)方法实现
        //  获取到集合的长度，这个通过size()方法实现
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(i);
        }
    }
}
