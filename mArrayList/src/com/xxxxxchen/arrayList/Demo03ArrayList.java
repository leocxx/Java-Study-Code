package com.xxxxxchen.arrayList;

import java.util.ArrayList;

/*
       集合常用成员方法:

           添加:
               boolean add(E e) 将指定的元素添加到此列表的尾部。
               void add(int index, E element) 将指定的元素插入此列表中的指定位置。

           删除:
               public boolean remove(Object o) 删除指定的元素，返回删除是否成功
               public E remove(int index)  删除指定索引处的元素，返回被删除的元素

           修改:
               public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素

           查询:
               public E get(int index) 返回指定索引处的元素
               public int size() 返回集合中的元素的个数

    */
public class Demo03ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //boolean add(E e) 将指定的元素添加到此列表的尾部。
        //void add(int index, E element) 将指定的元素插入此列表中的指定位置。
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        // public E get(int index) 返回指定索引处的元素
        String s = list.get(1);
        System.out.println(s);//111
        //public int size() 返回集合中的元素的个数
        int size = list.size();
        System.out.println(size);  //6
    }

    private static void setList() {
        ArrayList<String> list = new ArrayList<>();
        //boolean add(E e) 将指定的元素添加到此列表的尾部。
        //void add(int index, E element) 将指定的元素插入此列表中的指定位置。
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        //public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
        String s = list.set(0,"000");
        System.out.println(s);  //abc
        System.out.println(list); //[000, 111, 222, 333, 444, 555]
    }

    private static void removelist() {
        ArrayList<String> list = new ArrayList<>();
        //boolean add(E e) 将指定的元素添加到此列表的尾部。
        //void add(int index, E element) 将指定的元素插入此列表中的指定位置。
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        //  public boolean remove(Object o) 删除指定的元素，返回删除是否成功
        list.remove("abc");
        System.out.println(list);  //  [111, 222, 333, 444, 555]
        //public E remove(int index)  删除指定索引处的元素，返回被删除的元素
        String s = list.remove(0);
        System.out.println(s);   //111
        System.out.println(list);  //  [222, 333, 444, 555]
    }
}
