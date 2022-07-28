package com.xxxxxchen.mTreeSet;

import java.util.TreeSet;

public class mTreeSet2 {
    public static void main(String[] args) {
        TreeSet<Student> stu = new TreeSet<>(); //空参构造创建Treeset集合
        Student stu1 = new Student("zhangsan",15);
        Student stu2 = new Student("lisi",14);
        Student stu3 = new Student("wangwu",13);
        Student stu4 = new Student("zhaoliu",13);
        Student stu5 = new Student("qianqi",18);


        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        stu.add(stu4);
        stu.add(stu5);

        System.out.println(stu);
        //[Student{name='c3x', age=13}, Student{name='c1x', age=14}, Student{name='cx', age=15}]
    }
}
