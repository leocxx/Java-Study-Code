package com.xxxxxchen.test;

public class Demo {
    //需求：有一个字符串：“12 33 45 67 82 99”，把其中的每一个数存到int类型的数组中
    //步骤：
    //   定义一个数字符串
    //   把字符串中的数组数据存储到int类型的数组中
    //   遍历数组，输出
    public static void main(String[] args) {
        String s ="12 33 45 67 82 99";
        //获取字符串中的每一个数字
        String [] strarr = s.split(" ");

        //创建一个int类型的数组
        int [] numarr = new int[strarr.length];
        //把strarr的数据进行类型转换存入到int数组
        for (int i = 0; i < strarr.length; i++) {
            int number = Integer.parseInt(strarr[i]);
            numarr[i]=number;
        }
        //遍历int数组
        for (int i = 0; i < numarr.length; i++) {
            int num = numarr[i];
            System.out.println(num);
        }
    }
}
