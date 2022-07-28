package com.xxxxxchen.mIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("cx1", "cx", 25);
        Student stu2 = new Student("cx1", "la", 23);
        Student stu3 = new Student("cx2", "fs", 22);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //迭代器遍历
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }
        System.out.println("---------------------");
        //增强for遍历
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
