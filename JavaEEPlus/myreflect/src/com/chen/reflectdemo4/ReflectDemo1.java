package com.chen.reflectdemo4;

import java.lang.reflect.Method;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        /*获得Method对象*/
        //getMethods()返回所有公共成员方法对象，包括继承的（父类）
        //method1();
        //getDeclaredMethods()返回所有成员方法对象，不包括继承的（父类）
        //method2();
        //getMethod(方法名，带参方法里面的参数)返回单个公共成员方法对象
        //method3();
        //getDeclaredMethod("show")返回单个成员方法对象
        //method4();
    }

    private static void method4() throws ClassNotFoundException, NoSuchMethodException {
        //1.获取class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo4.Student");
        //2.获得Method对象
        Method show = aClass.getDeclaredMethod("show");
        System.out.println(show);
    }

    private static void method3() throws ClassNotFoundException, NoSuchMethodException {
        //1.获取class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo4.Student");
        //2.获得Method对象
        Method function1 = aClass.getMethod("function1");
        System.out.println(function1);
    }

    private static void method2() throws ClassNotFoundException {
        //1.获取class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo4.Student");
        //2.获得Method对象
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    private static void method1() throws ClassNotFoundException {
        //1.获取class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo4.Student");
        //2.获得Method对象
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
