package com.xxxxxchen.mecxe;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr = null;
        try {
            printArr(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        //try catch 为了让程序继续运行
        System.out.println("------------");
    }

    private static void printArr(int[] arr) {
        if (arr == null) {
            //System.out.println("有误");
            throw new NullPointerException();
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
