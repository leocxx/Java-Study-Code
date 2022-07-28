package com.xxxxxchen.arrayList;

import com.xxxxxchen.domain.Student;

public class Demo01ArrayList {
    public static void main(String[] args) {
        //动态初始化一个长度为3的数组
        Student[] arr = new Student[3];
        //创建3个对象
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 24);
        Student stu3 = new Student("王五", 25);
        //将学生对象存入数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //遍历数组，取出每一个对象
        for (int i = 0; i < arr.length; i++) {
            //直接取输出的是内存地址，需要一个临时变量
            Student temp = arr[i];
            //调用学生信息，输出打印
            System.out.println(temp.getName() + "...." + temp.getAge());
        }

    }
}
