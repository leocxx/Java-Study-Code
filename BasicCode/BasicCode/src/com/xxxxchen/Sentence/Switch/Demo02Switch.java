package com.xxxxchen.Sentence.Switch;
import java.util.Scanner;
/*
  case穿透现象，优化代码
  当开始穿透时，后续的case不具备穿透效果，直到遇到break，或者整条语句结束。
  * */
public class Demo02Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("错误！");
                break;
        }
    }
}
