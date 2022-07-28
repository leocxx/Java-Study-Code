package com.xxxxxchen;

public class test6 {
    public static void main(String[] args) {
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        });
    }
    /*
    使用接口的方法
    */
    public static void goSwimming(Swimming swimming){
        swimming.swim();
    }
}
/*游泳接口*/
interface Swimming{
    void swim();
}