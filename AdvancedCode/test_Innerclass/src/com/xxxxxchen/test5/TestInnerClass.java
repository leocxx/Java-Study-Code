package com.xxxxxchen.test5;

public class TestInnerClass {
   /*  正常使用接口中的方法：
   * 1.创建实现类，通过implement关键字去实现接口
   * 2.重写方法
   * 3.创建实现类对象
   * 4.调用重写后的方法
   *
   *    匿名内部类：
   *         前提：存在一个接口
   *          格式：
   *              new  类名/接口名 (){重写方法}
   * */
    public static void main(String[] args) {
        InterImpl i = new InterImpl();
        i.show();
        //匿名内部类理解：将继承\实现，方法重写，创建对象，放在了一步进行
        // 实现了Inter接口的，一个实现类对象
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类对象!");
            }
        }.show();   //通过对象.方法来调用
        //一个接口有多个方法
        Inter2 dc = new Inter2(){
            @Override
            public void show1() {
                System.out.println("show1");
            }
            @Override
            public void show2() {
                System.out.println("show1");
            }
        };
        dc.show1();
        dc.show2();
    }
}
interface Inter{
    void show();
}
interface Inter2{
    void show1();
    void show2();
}
class InterImpl implements Inter{
    @Override
    public void show() {
        System.out.println("重写后的方法！");
    }
}
