package com.chen.waitnotify;


public class Demo {
    public static void main(String[] args) {

        Desk desk = new Desk();
        Foodie f = new Foodie(desk);
        Cooker k = new Cooker(desk);

        f.start();
        k.start();
    }

}
