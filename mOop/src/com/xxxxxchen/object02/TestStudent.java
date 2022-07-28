package com.xxxxxchen.object02;

import com.xxxxxchen.object01.Study;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("星");
        stu.setAge(18);

        System.out.println(stu.getName());
        System.out.println(stu.getAge());

        stu.show();
    }
}
