package com.chen.reflectdemo4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        /*运行方法*/
        //invoke(参数1，参数2)
        //参数一：用对象调用该方法
        //参数二：调用方法传递的参数
        //返回值；方法的返回值
        //1.获取class类的对象
        Class aClass = Class.forName("com.chen.reflectdemo4.Student");
        //2.获得Method对象
        Method method = aClass.getMethod("function4", String.class);
        //3.创建对象
        Student Student = (com.chen.reflectdemo4.Student) aClass.newInstance();
        //4.运行方法
        Object o = method.invoke(Student, "zhangsan");
        System.out.println(o);
    }
}
