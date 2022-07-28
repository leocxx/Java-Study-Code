package com.xxxxchen.Basic;
import java.util.Random;
/*
  Random 用于产生一个随机数
  步骤和使用Scanner一致
  第一步导包：import java.util.Random;
  第二步创建对象：Random r = new Random();
  第三步使用：int number = r.nextInt(10);   括号里的是10是指随机产生0-9 不包含10，
     如有需要可以在后加上1如:
           int number = r.nextInt(10) + 1;  这时随机产生的就是1-10
  */
public class UserRandom {
    public static void main(String[] args) {
        for(int i =0;i<=10;i++){
            Random r = new Random();
            int number = r.nextInt(10);
            System.out.println(number);  //输出打印10个0-9之间的数
        }

    }
}
