package com.chen.demo3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class aClass = Class.forName("com.chen.demo3.UseTest");

        UseTest useTest = (UseTest) aClass.newInstance();

        Method[] methods = aClass.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)){
                method.invoke(useTest);
            }
        }
    }
}
