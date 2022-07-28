package com.chen.reflectdemo4;

public class Student {
    //私有无参无返回
    private void show(){
        System.out.println("私有无参无返回");
    }

    //公有无参无返回
    public void function1(){
        System.out.println("公有无参无返回");
    }

    //公有有参无返回
    public void function2(String name){
        System.out.println("公有有参无返回" + name);
    }

    //公有无参有返回
    public String function3(){
        System.out.println("公有无参有返回");
        return "aaa";
    }
    //公有有参有返回
    public String function4(String name){
        System.out.println("公有有参无返回" + name);
        return "aaa";
    }
}
