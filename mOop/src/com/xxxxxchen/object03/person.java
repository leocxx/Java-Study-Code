package com.xxxxxchen.object03;

public class person {
    private String name;
    private int age;

    //无参数构造方法
    public person() {

    }

    //有参数构造方法
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //get和set方法

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

    //
    public void show() {
        System.out.println(name + "..." + age);
    }
}
