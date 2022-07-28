package com.xxxxxchen.mIterator;

public class Student {
    private String sid;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
