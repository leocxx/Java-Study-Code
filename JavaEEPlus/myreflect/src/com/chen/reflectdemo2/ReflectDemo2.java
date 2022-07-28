package com.chen.reflectdemo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*Constructor用于创建对象的方法*/
        //T newInstance（参数）
        //method1();
        //metho2();
        //metho3();
    }

    private static void metho3() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //1.获取Class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo2.Student");
        //2获取Constructor构造方法对象 （演示返回单个公共构造方法）空参
        Constructor constructor = aClass.getConstructor();
        //3.newInstance来创建对象
        Student zhangsan = (Student) constructor.newInstance();
        System.out.println(zhangsan);
    }

    private static void metho2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //1.获取Class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo2.Student");
        //2获取Constructor构造方法对象 （演示返回单个私有构造方法）
        Constructor constructor = aClass.getDeclaredConstructor(String.class);
        //私有的注意点
        //3.被private修饰的不能直接使用，需要临时取消访问检查
        constructor.setAccessible(true);
        //4.newInstance来创建对象
        Student zhangsan = (Student) constructor.newInstance("zhangsan");
        System.out.println(zhangsan);
    }

    private static void method1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //1.获取Class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo2.Student");
        //2获取Constructor构造方法对象 （演示返回单个公共构造方法）
        Constructor constructor = aClass.getConstructor(String.class, int.class);
        //3.newInstance来创建对象
        Student zhangsan = (Student) constructor.newInstance("zhangsan", 15);
        System.out.println(zhangsan);
    }
}
