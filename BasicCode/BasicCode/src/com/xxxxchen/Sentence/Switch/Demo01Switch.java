package com.xxxxchen.Sentence.Switch;

public class Demo01Switch {
    public static void main(String[] args) {
        int week = 3;
        switch (week) {
            case 1:
                System.out.println("今天周一");
                break;
            case 2:
                System.out.println("今天周二");
                break;
            case 3:
                System.out.println("今天周三");
                break;
            case 4:
                System.out.println("今天周四");
                break;
            case 5:
                System.out.println("今天周五");
                break;
            default:
                System.out.println("错误！");
                break;
        }
    }
}
