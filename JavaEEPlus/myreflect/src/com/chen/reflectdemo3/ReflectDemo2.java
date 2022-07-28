package com.chen.reflectdemo3;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, ClassNotFoundException {
        /*赋值或者获取值*/
        //赋值void set(Student,"lisi")指定对象的成员变量赋值
        //method1();
        //赋值void get() 返回指定对象的Field值
        //method2();
    }

    private static void method2() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        //1.获取class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo3.Student");
        //2.获取Field对象
        Field money = aClass.getDeclaredField("money");
        //3.因为是私有变量需要取消访问检查
        money.setAccessible(true);
        //4.创建对象
        Student Student = (com.chen.reflectdemo3.Student) aClass.newInstance();
        //5.获取值
        Object s = money.get(Student);
        System.out.println(s);
    }

    private static void method1() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        //1.获取class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo3.Student");
        //2.获取Field对象
        //想要获得的单个成员变量必须是真实存在的
        Field name = aClass.getField("name");
        //3.创建对象来进行赋值
        Student Student = (com.chen.reflectdemo3.Student) aClass.newInstance();
        //4.赋值
        name.set(Student,"lisi");
        System.out.println(Student);
    }
}
