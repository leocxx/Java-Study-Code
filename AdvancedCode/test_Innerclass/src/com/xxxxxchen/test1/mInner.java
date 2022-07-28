package com.xxxxxchen.test1;

public class mInner {
    public static void main(String[] args) {
        /*
        创建内部类对象格式：
        外部类名.内部类名 对象名 = new 外部类对象.new 内部类对象

        */
        Outer.Inner inner = new Outer().new Inner();
        System.out.println(inner.num);
        inner.show();

        Dog.Hdog xx = new Dog().new Hdog();
        System.out.println(xx.name);
        xx.eat();
    }
}
class Outer{
    class Inner{
        int num = 10;
        public void show(){
            System.out.println("inner....show");
            System.out.println(num);
        }
    }

}
class Dog{
    class Hdog{
        String name = "x";
        public void eat(){
            System.out.println("小狗喝奶");
        }
    }
}