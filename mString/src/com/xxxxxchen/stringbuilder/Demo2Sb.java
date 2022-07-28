package com.xxxxxchen.stringbuilder;
/*
*      StringBuilder 常用成员方法
*     append(任意数据)   添加数据，返回对象本身
*     reverse()    返回相反的字符
*     length()    返回字符长度
*     toString()    将StringBuilder转换为String
* */
public class Demo2Sb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //append(任意数据)   添加数据，返回对象本身
        sb.append(123);
        //链式编程
        sb.append(321).append("abc");
        System.out.println(sb);  //123321abc

        //reverse()    返回相反的字符
        sb.reverse();
        System.out.println(sb);//cba123321

        //length()    返回字符长度
        System.out.println( sb.length());

        // toString()    将StringBuilder转换为String
        String s = sb.toString();
        System.out.println(s);
    }

}
