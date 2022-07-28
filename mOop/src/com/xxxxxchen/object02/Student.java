package com.xxxxxchen.object02;

public class Student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void show() {
        System.out.println(name + "..." + age);
    }
}
