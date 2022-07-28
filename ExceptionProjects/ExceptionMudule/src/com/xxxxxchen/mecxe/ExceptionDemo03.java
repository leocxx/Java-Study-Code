package com.xxxxxchen.mecxe;

import java.util.Scanner;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("名字");
        String name = sc.nextLine();
        s.setName(name);
        while (true) {
            System.out.println("年龄");
            String age = sc.nextLine();
            try {
                int i = Integer.parseInt(age);
                s.setAge(i);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入正确的格式！");
                continue;
            } catch (AgeOutOfBoundsException e) {
                System.out.println(e.toString());
                System.out.println("请在范围要求里输入！");
                continue;
            }
        }
        System.out.println(s);
    }
}
