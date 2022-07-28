package com.xxxxxchen.test3;
/*静态成员内部类*/
public class TestInnerClass {
    public static void main(String[] args) {
        /*静态格式发生了变化
        *
        *   外部类名.内部类名 对象名 = new 外部类.内部类名
        */
        Outer.Inner i = new Outer.Inner();
        i.show();
        Outer.Inner.method();//静态内部类里面静态方法的访问
    }
}
class Outer{
    static class Inner{
        public void show(){
            System.out.println("inner....show");
        }
        public static void method(){
            System.out.println("inner....show");
        }
    }

}
