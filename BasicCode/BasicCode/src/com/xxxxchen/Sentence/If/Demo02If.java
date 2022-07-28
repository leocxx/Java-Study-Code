package com.xxxxchen.Sentence.If;

import java.util.Scanner;

/*案例：
  键盘录入一个数
  判断奇偶
*/
public class Demo02If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("你输入的是偶数");
        }else {
            System.out.println("你输入的是奇数");
        }
    }
}
