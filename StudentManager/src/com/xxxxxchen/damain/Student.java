package com.xxxxxchen.damain;

public class Student {
    private String sid; //学号
    private String name; //姓名
    private int age; //年龄
    private String bir; //生日

    //空参构造
    public Student() {
    }
    //有参构造
    public Student(String sid, String name, int age, String bir) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.bir = bir;
    }
    //get set

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String namr) {
        this.name = namr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }
}
