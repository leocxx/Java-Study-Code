package com.xxxxxchen.test04;

import java.util.Random;

public class RandomLambdaDemo {
    public static void main(String[] args) {
        //匿名
        UseRandomLam(new RandomLam() {
            @Override
            public int getnumber() {
                Random r = new Random();
                int num = r.nextInt(10) + 1;
                return num;
            }
        });
        //Lambda
        UseRandomLam( () -> {
            Random r = new Random();
            int num = r.nextInt(10) + 1;
            return num;
        });
    }

    public static void UseRandomLam(RandomLam randomLam) {
        int result = randomLam.getnumber();
        System.out.println(result);
    }
}


interface RandomLam {
    int getnumber();
}
