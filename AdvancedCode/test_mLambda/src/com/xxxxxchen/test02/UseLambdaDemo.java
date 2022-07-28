package com.xxxxxchen.test02;

public class UseLambdaDemo {
    public static void main(String[] args) {
        UseL(new UseLam() {
            @Override
            public void show() {
                System.out.println("匿名内部类的show");
            }
        });
        //Lambda
        UseL( () -> System.out.println("Lambda的show") );
    }

    public static void UseL(UseLam useLam){
        useLam.show();
    }
}

interface UseLam{
    void show();
}
