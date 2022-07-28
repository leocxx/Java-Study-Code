package com.xxxxxchen.demo2;

public class mBubbleDemo02 {
    /*冒泡排序*/
    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 7, 5, 4, 2};
        bubble(arr);
        printarr(arr);
        //最终结果：1,2,3,4,5,6,7
    }

    private static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //外层循环控制的是次数，要比数组的长度少一次
            //内层循环是实际比较的
            //-1:是为了不让索引超过范围
            //-i:每一轮结束后，就会少一个数字
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
