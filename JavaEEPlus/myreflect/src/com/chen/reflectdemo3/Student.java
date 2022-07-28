package com.chen.reflectdemo3;

public class Student {
    public String name;
    public int age;
    public String gender;

    private int money = 100;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", money=" + money +
                '}';
    }
}
