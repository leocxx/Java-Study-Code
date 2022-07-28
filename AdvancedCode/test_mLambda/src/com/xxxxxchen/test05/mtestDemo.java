package com.xxxxxchen.test05;

public class mtestDemo {
    public static void main(String[] args) {
        //匿名
        useJiDemo(new JiDemo() {
            @Override
            public int col(int a, int b) {
                return a + b;
            }
        });
        //Lambda
        /*useJiDemo( (int a, int b) -> {
            return a + b;
        } );*/
        useJiDemo( (a,  b) ->
          a + b
         );
    }
    public static void useJiDemo(JiDemo jiDemo){
        int result = jiDemo.col(10,10);
        System.out.println(result);
    }
}

interface JiDemo{
    int col(int a,int b);
}
