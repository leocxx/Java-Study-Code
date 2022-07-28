package com.chen.reflectdemo2;

public class Student {
    private String name;
    private int age;
    /*--------------------------------------*/
    //私有的有参构造方法
    private Student(String name) {
        System.out.println("name的值为" + name);
        System.out.println("私有的有参构造方法");
    }
    //公有的无参构造方法
    public Student() {
        System.out.println("公有无参构造方法");
    }
    //共有的有参构造
    public Student(String name, int age) {
        System.out.println("name的值为" + name + "int的值为" + age);
        System.out.println("公有的有参构造方法");
    }
}
