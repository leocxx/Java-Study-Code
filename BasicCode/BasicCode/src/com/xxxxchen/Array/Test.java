package com.xxxxchen.Array;

import java.util.Scanner;

/*
案例：  比赛打分：有6个评委为参赛选手打分，分数为0-100的整数
        最后的得分是去点一个最高分和去点一个最低分，剩下的4个分数的平均值
*/
public class Test {
    public static void main(String[] args) {
        //1.定义一个长度为6数组，动态化完成初始化.
        int[] arr = new int[6];
        //2.键盘录入成绩，使用Scanner
        Scanner sc = new Scanner(System.in);
        //3.6个评委，接收数据用循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委分数");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("输入错误，请重新输入正确的分数！");
                i--;
            }
        }
        //4.求数组最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr.length) {
                max = arr[i];
            }
        }
        //4.求数组最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr.length) {
                min = arr[i];
            }
        }
        //5.求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //6.求平均值
        int avg = (sum - max - min) / 4;
        System.out.println(avg);
    }
}
