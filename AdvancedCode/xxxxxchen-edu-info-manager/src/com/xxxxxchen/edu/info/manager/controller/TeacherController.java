package com.xxxxxchen.edu.info.manager.controller;

import com.xxxxxchen.edu.info.manager.domain.Teacher;
import com.xxxxxchen.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner sc = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();
    public void start() {
        teacherLoop:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addTeacher();
                    //System.out.println("添加老师：");
                    break;
                case "2":
                    deleteTeacherById();
                    //System.out.println("删除老师：");
                    break;
                case "3":
                    updateTeacher();
                    //System.out.println("修改老师：");
                    break;
                case "4":
                    findAllTeacher();
                    /**/System.out.println("查看老师：");
                    break;
                case "5":
                    System.out.println("感谢使用教师系统！");
                    break teacherLoop;
                default:
                    System.out.println("你的输入有误，请重新输入！");
                    break;
            }
        }


    }
    //修改老师
    public void updateTeacher() {
        String id = inputTeacher();
       Teacher newTeacher = inputTeacherInfo(id);

        TeacherService.updateTeacher(id,newTeacher);
        System.out.println("修改成功！");
    }

    //删除老师
    public void deleteTeacherById() {
         String id = inputTeacher();
        //2,调用service中的删除方法
        teacherService.deleteTeacherById(id);
        //3.提示删除成功
        System.out.println("删除成功！");
    }

    //查询老师
    public void findAllTeacher() {
        //1.在service中获取老师对象数组
        Teacher[] teachers = teacherService.findAllTeacher();
        //2.判断数组中是否有元素
        if(teachers == null){
            System.out.println("没有此人信息");
            return;
        }
        //3.遍历数组，取出元素，打印
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if(t != null){
                System.out.println(t.getId() + "\t" + t.getName() + "\t" + t.getAge() + "\t\t" + t.getBirthday());
            }
        }
    }

    //添加老师
    public void addTeacher() {
        String id;
        while(true){
            //1.接收一个不存在的id
            System.out.println("请输入id：");
            id = sc.next();
            //2.判断id是否存在（属于service）
            boolean exists = teacherService.isExists(id);
            if(exists){
                System.out.println("id已经存在，请重新输入！");
            }else {
                break;
            }
        }
        Teacher t = inputTeacherInfo(id);
        //5.将封装好的老师对象，放在TeacherService中继续完成添加操作
        boolean result = teacherService.addteacher(t);
        if(result){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败，重新添加！");
        }
    }

    public String inputTeacher(){
        String id;
        while (true) {
            System.out.println("请输入id：");
            id = sc.next();
            boolean exists = teacherService.isExists(id);
            if (!exists) {
                System.out.println("id不存在，重新输入！");
            } else {
                break;
            }
        }
        return id;
    }

    public Teacher inputTeacherInfo(String id){
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        String age = sc.next();
        System.out.println("请输入生日：");
        String birthday = sc.next();
        //4.将信息封装到老师对象里面
        Teacher t = new Teacher();
        t.setId(id);
        t.setName(name);
        t.setAge(age);
        t.setBirthday(birthday);
        return t;
    }
}
