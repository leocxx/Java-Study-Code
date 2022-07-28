package com.chen.demo;

public class Zi extends Fu{
    //这个注解描述了子类重写父类的方法
    @Override
    public void show() {
        super.show();
    }


    @Deprecated //描述的方法已经过时
    public void study(){
        System.out.println("2");
    }


    @SuppressWarnings(value = "all")//压制警告
    public void number(){
        int a = 1;
        int b = 8;
        //System.out.println(a);
        //System.out.println(b);
    }
}
