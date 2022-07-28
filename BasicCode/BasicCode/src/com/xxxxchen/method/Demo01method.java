package com.xxxxchen.method;

/*
  方法的定义：  public static void 方法名 (){
                //方法体
              }
  调用：方法名();

  注意：方法之间是平级关系，不能嵌套带定义
  */
public class Demo01method {
    public static void main(String[] args) {
    //调用创建的方法
        eat();
        study();
    }
    //定义一个名字为eat的方法
    public static void eat (){
        System.out.println("吃饭");
    }
    //定义一个名字为study的方法
    public static void study (){
        System.out.println("学习");
    }
}
