package com.xxxxxchen.test03;

public class StingLambdaDemo {
    public static void main(String[] args) {
        //匿名内部类
        UseStringLam(new StringLam() {
            @Override
            public void message(String msg) {
                System.out.println("匿名内部类" + msg);
            }
        });
        //Lambda
        UseStringLam(  msg ->  System.out.println("Lambda" + msg) );
    }

    public static void UseStringLam(StringLam stringLam){
        stringLam.message("cx");
    }
}

interface StringLam{
    void message (String msg);
}
