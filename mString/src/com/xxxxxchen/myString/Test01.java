package com.xxxxxchen.myString;

import java.util.Scanner;

/*
        案例：用户登录
       已知用户名和密码，实现键盘录入三次模拟检验
*/
public class Test01 {
    public static void main(String[] args) {
        //1.已知用户名和密码
        String username = "chen";
        String userpassword = "123456";

        //2.键盘录入
        Scanner sc = new Scanner(System.in);

        //4.三次机会，使用for循环，并用break结束
        for (int i = 0; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String scUsername = sc.nextLine();
            System.out.println("请输入密码：");
            String scPassword = sc.nextLine();

            //3.拿键盘录入的数据与已知的数据做比较：用equals()方法
            if (scUsername.equals(username) && scPassword.equals(userpassword)) {
                System.out.println("登录成功！");
                break;
            } else {
                if (i == 3) {
                    System.out.println("今天的次数用完，请明天再试！");
                } else {
                    System.out.println("登陆失败,你还有" + (3 - i) + "次机会");
                }
            }
        }
    }
}
