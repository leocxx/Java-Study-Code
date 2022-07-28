package com.xxxxxchen.arrayList;

import com.xxxxxchen.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/*
        需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
          学生的姓名和年龄来自于键盘录入

        思路：
            1. 定义学生类
            2. 创建集合对象
            3. 键盘录入学生对象所需要的数据
            4. 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
            5. 往集合中添加学生对象
            6. 遍历集合，采用通用遍历格式实现

     */
public class Test03 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = getStudent();
        Student stu2 = getStudent();
        Student stu3 = getStudent();

        //往集合中添加学生对象
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //遍历集合，采用通用遍历格式实现
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "   " + stu.getAge());
        }

    }

    private static Student getStudent() {
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student stu = new Student(name,age);

        return stu;
    }
}
