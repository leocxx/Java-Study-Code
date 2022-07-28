package com.xxxxxchen.arrayList;

import com.xxxxxchen.domain.Student;

import java.util.ArrayList;

/*
      需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

      思路：
          1. 定义学生类
          2. 创建集合对象
          3. 创建学生对象
          4. 添加学生对象到集合中
          5. 遍历集合，采用通用遍历格式实现
   */
public class Test02 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象
        Student stu1 = new Student("张三1",23);
        Student stu2 = new Student("张三2",23);
        Student stu3 = new Student("张三3",23);

        //添加学生对象到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //遍历集合，采用通用遍历格式实现
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "   " + stu.getAge());
        }
    }
}
