package com.xxxxxchen.mhashset;

import java.util.HashSet;

public class mHashSet02 {
    public static void main(String[] args) {
        HashSet<Student> list = new HashSet<>();
        Student stu1 = new Student("张丹",18);
        Student stu2 = new Student("远东",19);

        list.add(stu1);
        list.add(stu2);

        System.out.println(stu1.hashCode());//356573597
        System.out.println(stu1.hashCode());//356573597
        System.out.println(stu2.hashCode());//1735600054
    }
}
