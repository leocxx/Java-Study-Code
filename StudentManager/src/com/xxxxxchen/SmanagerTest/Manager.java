package com.xxxxxchen.SmanagerTest;

import com.xxxxxchen.damain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {

        //键盘录入
        Scanner sc = new Scanner(System.in);

        //创建容器对象
        ArrayList<Student> list = new ArrayList<>();


        lo:
        while (true) {
            //输出语句完成界面
            System.out.println("--------欢迎来到菠萝屋--------");
            System.out.println("1 添加菠萝");
            System.out.println("2 删除菠萝");
            System.out.println("3 修改菠萝");
            System.out.println("4 查看菠萝");
            System.out.println("5 退出菠萝屋");
            System.out.println("请输入您的选择:");
            String chioce = sc.next();

            switch (chioce) {
                case "1":
                    //System.out.println("添加菠萝");
                    addStudent(list);
                    break;
                case "2":
                    //System.out.println("删除菠萝");
                    delStudent(list);
                    break;
                case "3":
                    //System.out.println("修改菠萝");
                    updateStudent(list);
                    break;
                case "4":
                    //System.out.println("查看菠萝");
                    queryStudents(list);
                    break;
                case "5":
                    System.out.println("感谢你参与菠萝计划");
                    break lo;
                default:
                    System.out.println("你的输入有误！");
                    break;
            }
        }


    }

    //修改方法
    public static void updateStudent(ArrayList<Student> list) {
        //1.给出提示信息
        System.out.println("请输入要修改的学生学号！");
        //2，键盘录入接受数据
        Scanner sc = new Scanner(System.in);
        String upsid = sc.next();
        //3.调用getIndex方法
        int index = getIndex(list, upsid);
        if (index == -1) {
            System.out.println("没有数据，请添加后修改！");
        } else {
            System.out.println("请输入新的姓名：");
            String name = sc.next();
            System.out.println("请输入新的年龄：");
            int age = sc.nextInt();
            System.out.println("请输入新的生日：");
            String bir = sc.next();
            //封装在一个新的对象里
            Student stu = new Student(upsid, name, age, bir);
            //调用集合的set方法，完成修改
            list.set(index, stu);
            System.out.println("修改成功！");
        }
    }

    //删除的方法
    public static void delStudent(ArrayList<Student> list) {
        //1.给出提示信息
        System.out.println("请输入要删除的学生学号！");
        //2，键盘录入接受数据
        Scanner sc = new Scanner(System.in);
        String delsid = sc.next();
        //3.调用getIndex方法
        int index = getIndex(list, delsid);
        if (index == -1) {
            System.out.println("没有数据，请添加后删除！");
        } else {
            list.remove(index);
            System.out.println("删除成功！");
        }
    }

    //查看的方法
    public static void queryStudents(ArrayList<Student> list) {
        //1.判断集合中有无数据，给出提示
        if (list.size() == 0) {
            System.out.println("无信息，请输入后查看！");
            return;
        }
        //2.若有数据，展示
        System.out.println("学号\t\t姓名\t\t年龄\t\t\t\t出生日期");
        //3.遍历集合，获取打印信息
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t\t" + stu.getBir());
        }
    }

    //添加的方法
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        //1.给出录入的提示信息
        String sid;
        while (true) {
            System.out.println("请输入学号：");
            sid = sc.next();
            int index = getIndex(list, sid);
            if (index == -1) {
                break;
            }
        }

        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入生日：");
        String bir = sc.next();
        //2.将键盘录入的信息封装为学生对象
        Student stu = new Student(sid, name, age, bir);
        //3.将封装好的对象添加到集合容器里
        list.add(stu);
        //4.给出添加成功的提示
        System.out.println("添加成功！");
    }

    //判断索引
    public static int getIndex(ArrayList<Student> list, String sid) {
         /*
       getIndex : 接收一个集合对象, 接收一个学生学号

       查找这个学号, 在集合中出现的索引位置
    */
        // 1. 假设传入的学号, 在集合中不存在
        int index = -1;
        // 2. 遍历集合, 获取每一个学生对象, 准备进行查找
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            // 3. 获取每一个学生对象的学号
            String id = stu.getSid();
            // 4. 使用获取出的学生学号, 和传入的学号(查找的学号)进行比对
            if (id.equals(sid)) {
                // 存在: 让index变量记录正确的索引位置
                index = i;
            }
        }

        return index;
    }
}
