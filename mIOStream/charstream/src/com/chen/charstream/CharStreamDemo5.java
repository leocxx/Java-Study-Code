package com.chen.charstream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {
        /*键盘录入用户名和密码实现永久化存储*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.next();
        System.out.println("请输入密码:");
        String passwd = sc.next();

        FileWriter fw = new FileWriter("charstream\\admin.txt");
        fw.write(username);
        fw.write("\r\n");//换行
        fw.write(passwd);
        //刷新和释放资源
        fw.flush();
        fw.close();
    }
}
