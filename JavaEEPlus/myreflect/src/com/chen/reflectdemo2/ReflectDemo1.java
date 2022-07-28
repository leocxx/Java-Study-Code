package com.chen.reflectdemo2;

import java.lang.reflect.Constructor;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        /*Constructor构造方法对象*/
//        第一种getConstructors() 返回所有公共构造方法的数组
//        method1();
//        第二种 getConstructor(参数和构造方法参数一致)返回单个公共构造方法
//        method2();
//        第三种getDeclaredConstructors() 返回所有构造方法的数组
//        method3();
//        第二种getDeclaredConstructor(参数和构造方法参数一致)返回单个私有构造方法的数组
        //method4();
    }

    private static void method4() throws ClassNotFoundException, NoSuchMethodException {
        Class aClass = Class.forName("com.chen.reflectdemo2.Student");
        Constructor constructor = aClass.getDeclaredConstructor(String.class);
        System.out.println(constructor);
    }

    private static void method3() throws ClassNotFoundException {
        Class aClass = Class.forName("com.chen.reflectdemo2.Student");
        Constructor[] constructors = aClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }

    private static void method2() throws ClassNotFoundException, NoSuchMethodException {
        Class aClass = Class.forName("com.chen.reflectdemo2.Student");
        Constructor constructor = aClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
    }

    private static void method1() throws ClassNotFoundException {
        Class aClass = Class.forName("com.chen.reflectdemo2.Student");
        Constructor[] constructors1 = aClass.getConstructors();
        for (Constructor constructor : constructors1) {
            System.out.println(constructor);
        }
    }
}
