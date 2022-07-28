package com.xxxxchen.TwoArray;

/*
 *      二维数组求和
 * */
public class Test02 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = {{11, 22, 33, 44}, {11, 22, 33, 44}, {33, 44, 55, 66}, {1, 2, 3, 4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
