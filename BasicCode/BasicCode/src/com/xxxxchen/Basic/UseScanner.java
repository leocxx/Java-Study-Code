package com.xxxxchen.Basic;
import java.util.Scanner; //导包
public class UseScanner {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);  //创建对象
       int i = sc.nextInt();  //使用变量来接收数据
        System.out.println(i);   //键盘录入什么，i就输出什么
    }
}
