package com.xxxxxchen.test4;
/*    局部内部类
*      位置：  方法中
*      访问   只能在方法里面创建对象，然后访问
 */
public class TestInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();

    }
}
class Outer{
    int a =10;
    public void method(){
        int b =4;
        class Inner{
            public void show(){
                System.out.println("inner");
                System.out.println(a);
                System.out.println(b);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
