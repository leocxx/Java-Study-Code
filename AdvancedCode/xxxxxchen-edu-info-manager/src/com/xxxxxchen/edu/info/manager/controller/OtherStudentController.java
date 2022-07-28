package com.xxxxxchen.edu.info.manager.controller;

import com.xxxxxchen.edu.info.manager.domain.Student;
import com.xxxxxchen.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController{
    private Scanner sc = new Scanner(System.in);
    @Override
    public Student inputStudentInfo(String id) {
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        String age = sc.next();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();
        //2.将学生信息封装为学生对象
        Student stu = new Student(id,name,age,birthday);
        return stu;
    }
}
