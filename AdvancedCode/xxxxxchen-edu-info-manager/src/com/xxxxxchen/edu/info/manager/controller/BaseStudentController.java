package com.xxxxxchen.edu.info.manager.controller;

import com.xxxxxchen.edu.info.manager.domain.Student;
import com.xxxxxchen.edu.info.manager.service.StudentService;

import java.util.Scanner;

public  abstract class BaseStudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    public final void start() {
        //Scanner sc = new Scanner(System.in);
        studentLoop:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudentById();
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent();
                    break;
                case "4":
                    //System.out.println("查看学生");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢你的使用！");
                    break studentLoop;
                default:
                    System.out.println("你的输入有误，请重新输入！");
                    break;
            }
        }
    }

    //修改学生
    private final void updateStudent() {
        String updateId = inputStudentId();
        Student newstu = inputStudentInfo(updateId);

        studentService.updateById(updateId, newstu);
        System.out.println("修改成功！");

    }

    //删除学生
    public final void deleteStudentById() {
        String delId = inputStudentId();
        //3.调用业务员中的deleteStudentById,删除学生
        studentService.deleteStudentById(delId);
        //4.提示成功
        System.out.println("删除成功！");
    }

    //查看学生
    public final void findAllStudent() {
        //1.调用业务员中的获取方法，得到学生的对象数组
        Student[] stus = StudentService.findAllStudent();
        //2.判断数组的内存地址，是否为null
        if (stus == null) {
            System.out.println("查无信息，请重新输入！");
            return;
        }
        //3.遍历数组，获取信息打印
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }
    }

    //添加学生
    public final void addStudent() {
        String id;
        //1.键盘录入学生信息
        while (true) {
            System.out.println("请输入学生id：");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("你输入的学号已经存在，请重新输入！");
            } else {
                break;
            }
        }
        Student stu = inputStudentInfo(id);
        //3.将学生对象，传递给StudentService（业务员）中的addStudent方法
        Boolean result = studentService.addStudent(stu);
        //4.根据返回的boolean类型结果，在控制台打印 成功 / 失败
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    //录入学生id
    public String inputStudentId() {
        String id;
        while (true) {
            //1.键盘录入要修改的学生id
            System.out.println("输入学生id：");
            id = sc.next();
            //2.判断id是否存在
            boolean exists = studentService.isExists(id);
            if (!exists) {
                System.out.println("不存在，请重新输入！");
            } else {
                break;
            }
        }
        return id;
    }

    public abstract Student inputStudentInfo(String id);
}
