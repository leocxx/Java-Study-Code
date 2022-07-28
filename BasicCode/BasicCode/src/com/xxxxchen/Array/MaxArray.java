package com.xxxxchen.Array;

/*
数组的常见操作1:获取最值
        在一组数组中获取最大或者最小值
*/
public class MaxArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
              max = arr1[i];
            }
        }
        System.out.println("最大为" + max);
        System.out.println("---------------");
        int[] arr2 = {1,2,3,4,5,6,7,8};
        int min= arr2[0];
        for(int i = 1;i<arr2.length;i++){
            if(arr2[i] < min){
                min = arr2[i];
            }
        }
        System.out.println("最小为" + min);
    }
}
