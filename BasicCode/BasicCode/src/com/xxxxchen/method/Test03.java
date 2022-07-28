package com.xxxxchen.method;

/*
 *       案例：
 *             设计一个方法，能够同时获得数组元素的最大值和最小值
 *              注意！！！！
 *              return语句只能带会一个结果
 * */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {11, 23, 33, 45, 666, 77};

        int[] And = getMaxAndMin(arr);

        System.out.println(And[0]);
        System.out.println(And[1]);
    }

    //******************************************************
    public static int[] getMaxAndMin(int[] arr) {
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }

        int Min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Min > arr[i]) {
                Min = arr[i];
            }
        }

        int[] MaxAndMin;
        MaxAndMin = new int[]{Min, Max};

        return MaxAndMin;
    }
}