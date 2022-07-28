package com.xxxxchen.Array;

public class Demo01Array {
    public static void main(String[] args) {
        //数组的动态初始化定义格式
        int[] arr = new int[3];
        //访问数组的内存地址
        System.out.println(arr);  //[I@1540e19d
        //访问内部保存的数据
        //通过索引，索引是数组容器中空间的编号，从0开始。
        System.out.println(arr[0]);
        System.out.println(arr[1]);     //0
        System.out.println(arr[2]);
        //数组在创建后，即使没有赋值，也可以取出，但是取出的都是默认的。
        System.out.println("----------------");
        //对数组进行赋值
        arr[0] =2;
        arr[1] =44;
        arr[2] =88;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //输出打印后为2，44，88
    }
}
