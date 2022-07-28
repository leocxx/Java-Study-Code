package com.xxxxxchen.object03;

public class Testperson {
    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("星子");
        p1.setAge(18);
        p1.show();

        person p2 = new person("奶粉",99);
        p2.show();
    }
}
