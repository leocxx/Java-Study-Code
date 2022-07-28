package com.xxxxchen.TwoArray;

/*
 *     二维数组的动态初始化
 *         数据类型 [][] 变量名字 = new 数据类型[m][n]
 *           m指的是二维数组可以放几个一维数组
 *           n指的是一维数组可以放几个元素
 * */
public class TwoArrayDemo01 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        System.out.println(arr);   //[[I@1540e19d

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        //[I@677327b6
        //[I@14ae5a5

        arr[0][0]=11;
        arr[0][1]=11;

        arr[1][0]=33;
        arr[1][1]=33;

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
    }
}
