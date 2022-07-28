package com.xxxxchen.Array;

/*
数组的常见操作1:遍历
        访问数组中的所有数据（元素）
        动态获取元素个数： 数组名.length
*/
public class Demo03Array {
    public static void main(String[] args) {
        int [] arr = {12,23,44,545,6,7,8};
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
