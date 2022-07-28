package com.xxxxchen.Sentence.Switch;
import java.util.Scanner;
/*
    案例：减肥计划
    键盘录入星期数
    周一跑步
    周二游泳
    周三篮球
    周四睡觉
    周五吃肉
* */
public class TestSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("篮球");
                break;
            case 4:
                System.out.println("睡觉");
                break;
            case 5:
                System.out.println("吃肉");
                break;
            default:
                System.out.println("错误!");
                break;
        }
    }
}
