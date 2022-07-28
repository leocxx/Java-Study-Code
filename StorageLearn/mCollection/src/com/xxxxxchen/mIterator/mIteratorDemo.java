package com.xxxxxchen.mIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class mIteratorDemo {
    public static void main(String[] args) {
        //集合特有的遍历方式：Iterator迭代器
        Collection<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");

        //1.获取迭代器对象,获取之后默认指向0索引位置
        Iterator<String> iterator = list.iterator();
        //2.通过方法来完成遍历
        //hasNext() 判断当前元素是否有取出   next()获取当前元素，迭代器指向下一个元素
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
