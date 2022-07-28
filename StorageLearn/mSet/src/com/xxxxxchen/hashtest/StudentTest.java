package com.xxxxxchen.hashtest;

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> list = new HashSet<>();
        Student stu1 = new Student("xiaohei",23);
        Student stu2 = new Student("xiaohei",23);
        Student stu3 = new Student("xiaowang",21);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        System.out.println(list);
    }
}
