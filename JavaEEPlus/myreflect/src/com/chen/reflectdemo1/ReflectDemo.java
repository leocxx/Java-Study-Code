package com.chen.reflectdemo1;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        /*获取Class类的对象*/
        //第一种方法，forName(全类名)
        Class aClass = Class.forName("com.chen.reflectdemo1.Student");
        System.out.println(aClass);

        //第二种,通过Class属性来获取
        Class aClass2 = Student.class;
        System.out.println(aClass2);

        //第三种，利用对象的getclass
        Student student = new Student();
        Class<? extends Student> aClass3 = student.getClass();
        System.out.println(aClass3);
        System.out.println(aClass == aClass2);
        System.out.println(aClass == aClass3);

    }
}
