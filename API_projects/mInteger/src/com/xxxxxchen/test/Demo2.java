package com.xxxxxchen.test;

public class Demo2 {
    /*
    * 现获取到用户填写的3个年龄信息，但格式是以逗号分隔的字符串形式，例如："23,24,25"（直接定义字符串给出即可）。
    * 现需要求出这三个年龄的平均年龄，请编写程序实现，并将结果打印到控制台。
   思路：
1.    前台给出的字符串都用逗号隔开了，怎么获取每一个数据？
2.    获取到的每一个数据都是字符串，怎么转换为整数？
3.    求平均分打印结果
*    步骤：
1.    使用String类中的split方法进行切割，将数据切割成一个字符串数组
2.    遍历字符串数组，使用Integer.parseInt()方法，将三个数据都转换为整数
3.    将三个整数累加求和，随后除以3，打印最终结果*/
    public static void main(String[] args) {
        String s = "23,24,25";
        String [] agearr = s.split(",");
        int sum = 0;
        for (int i = 0; i < agearr.length; i++) {
            int age = Integer.parseInt(agearr[i]);
            sum += age;
        }
        System.out.println("平均年龄为：" + (sum / 3)); //平均年龄为：24
    }
}
