package com.chen.reflectdemo3;

import java.lang.reflect.Field;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        /*获取Field对象*/
        //getFields()返回所有公共成员变量的对象数组
        //method1();
        //getDeclaredFields()返回所有成员变量的对象数组
        //method2();
        //getField("name")返回单个公共成员变量的对象
        //method3();
        //getDeclaredField("")返回单个成员变量的对象
        //method4();
    }

    private static void method4() throws ClassNotFoundException, NoSuchFieldException {
        //1.获取class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo3.Student");
        //2.获取Field对象
        Field money = aClass.getDeclaredField("money");
        System.out.println(money);
    }

    private static void method3() throws ClassNotFoundException, NoSuchFieldException {
        //1.获取class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo3.Student");
        //2.获取Field对象
        //想要获得的单个成员变量必须是真实存在的
        Field name = aClass.getField("name");
        System.out.println(name);
    }

    private static void method2() throws ClassNotFoundException {
        //1.获取class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo3.Student");
        //2.获取Field对象
        Field[] declaredFields = aClass.getDeclaredFields();
        //3.遍历
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }

    private static void method1() throws ClassNotFoundException {
        //1.获取class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo3.Student");
        //2.获取Field对象
        Field[] fields = aClass.getFields();
        //3.遍历
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
