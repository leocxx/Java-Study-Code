package com.xxxxxchen.TreeSetTest;

import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) {
        TreeSet<Student> list = new TreeSet<>();

        Student stu1 = new Student("zhangsan",80,80,80);
        Student stu2 = new Student("lisi",90,90,90);
        Student stu3 = new Student("wangwu",100,100,100);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        System.out.println(list);
    }
}
