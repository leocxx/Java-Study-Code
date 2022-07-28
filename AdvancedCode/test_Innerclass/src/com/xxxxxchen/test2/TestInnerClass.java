package com.xxxxxchen.test2;
/*私有成员内部类*/
public class TestInnerClass {
    public static void main(String[] args) {
        //Outer.Inner i =new Outer().new Inner();  报错原因：已经被私有化
        Outer o = new Outer();
        o.method();
    }
}
class Outer{
    private class Inner{
        public void show(){
            System.out.println("inner....show");
        }
    }
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
