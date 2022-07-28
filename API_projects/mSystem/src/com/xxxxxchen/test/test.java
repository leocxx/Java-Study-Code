package com.xxxxxchen.test;

public class test {
    public static void main(String[] args) {
        //public static void exit​(int status)	终止当前运行的 Java 虚拟机，非零表示异常终止
       /* System.out.println(1111);
        System.exit(0);  //程序在这就停止
        System.out.println(3333);*/
        //public static long currentTimeMillis​()  返回当前时间(以毫秒为单位)
       /* long start = System.currentTimeMillis();
        System.out.println(start);
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end - start);*/
        //arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数)	数组copy
        int[] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = new int [10];
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
