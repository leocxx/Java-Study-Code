package com.xxxxchen.TwoArray;

/*
 *     二维数组的遍历
 *     案例：已知一个二位数组，遍历该数组并打印
 * */
public class Test01 {
    public static void main(String[] args) {
        int[][] arr = {{11, 22, 33, 44}, {66, 77, 88, 99}};

        //1.先遍历二维数组，取出每一个一维数组
        for (int i = 0; i < arr.length; i++) {
            //2.再遍历每一个一维数组
            for (int j = 0; j < arr[i].length; j++) {

                System.out.println(arr[i][j]);
            }
        }
    }
}