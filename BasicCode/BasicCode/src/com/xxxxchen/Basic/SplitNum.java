package com.xxxxchen.Basic;

import java.util.Scanner;

/*
        案例：数值拆分（以1234为例）
        键盘录入一个数值，分别打印个位十位百位
        个位：数值%10
        十位：数值/10%10
        百位：数值/10/10%10
        千位：数值/10/10/10%10
        .....
 */
public class SplitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        int ge = num % 10;     //商123 余4 ge=4
        int shi = num / 10 % 10;
        int bai = num / 10 / 10 % 10;
        int qian = num / 10 / 10 / 10 % 10;
        System.out.println("整数" + num + "个位是：" + ge);
        System.out.println("整数" + num + "十位是：" + shi);
        System.out.println("整数" + num + "百位是：" + bai);
        System.out.println("整数" + num + "千位是：" + qian);
    }
}
