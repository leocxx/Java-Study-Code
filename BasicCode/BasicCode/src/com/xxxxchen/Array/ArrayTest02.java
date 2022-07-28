package com.xxxxchen.Array;
/*
 *               案例：已知arr = {18,25,47,88,99}
 *                    数组进行反转
 *                   打印输出arr ={99，88，47，25，18}
 *
 * */
public class ArrayTest02 {
    public static void main(String[] args) {
        int [] arr = {18,25,47,88,99};
        int start = 0;
        int end=arr.length-1;
        for ( ; start < end; start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
