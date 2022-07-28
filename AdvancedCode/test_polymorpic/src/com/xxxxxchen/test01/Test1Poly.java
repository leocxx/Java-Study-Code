package com.xxxxxchen.test01;

public class Test1Poly {
    public static void main(String[] args) {

        Animal a = new Cat();
        a.eat();
    }

static class Animal{
        public void eat(){
            System.out.println("吃");
        }
}

static class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }
}
}
