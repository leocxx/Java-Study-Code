package com.xxxxxchen.object01;

public class TestStudy {
    public static void main(String[] args) {
        Study stu = new Study();

        System.out.println(stu.age);   //0
        System.out.println(stu.name);   //null

        stu.name = "张三";
        stu.age = 18;
        System.out.println(stu.age);
        System.out.println(stu.name);

        stu.study();
        //com.xxxxxchen.object01.Study@1540e19d 全类名
        System.out.println(stu);
    }
}
