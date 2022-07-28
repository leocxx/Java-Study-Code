package com.xxxxchen.Array;

import java.util.Scanner;

/*案例：键盘录入五个数，存储在数组中，然后求和*/
public class TestSumArray {
    public static void main(String[] args) {
        //1.创建键盘录入
        Scanner sc = new Scanner(System.in);
        //2.定义一个求和变量
        int sum = 0;
        //3.动态初始化一个长度为5的数组
        int[] arr = new int[5];
        //4.将键盘录入的数值存在数组中
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            arr[i] = sc.nextInt();
        }
        //5.遍历数组每一个元素，求和 快捷键：arr.fori
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //6.输出最合的求和
        System.out.println("和值为:" + sum);
    }
}
