package com.xxxxxchen.myString;

import com.xxxxxchen.domain.Student;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");

        String s = sc.nextLine();

        String[] sArr = s.split(",");
        Student stu = new Student(sArr[0],sArr[1]);
        System.out.println(stu.getAge()+"....."+stu.getName());
    }
}
