package com.chen.charstream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharStreamDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*字符串的编码解码问题*/
        //编码
        method1();
        //解码
        method2();
    }

    private static void method2() throws UnsupportedEncodingException {
        byte[] bytes1 = {-23, -103, -120, -26, -104, -97, -27, -92, -89, -27, -72, -123, -23, -128, -68};
        String s = new String(bytes1);
        System.out.println(s);  //陈星大帅逼

        //指定格式来解码
        byte[] bytes2 = {-77, -62, -48, -57, -76, -13, -53, -89, -79, -58};
        String l = new String(bytes2,"GBK");
        System.out.println(l);  //陈星大帅逼
    }

    private static void method1() throws UnsupportedEncodingException {
        String s = "陈星大帅逼";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));//默认utf-8,一个中文三个字节
        //[-23, -103, -120, -26, -104, -97, -27, -92, -89, -27, -72, -123, -23, -128, -68]
        //指定编码
        byte[] gbks = s.getBytes("GBK"); //gbk一个中文两个字节
        System.out.println(Arrays.toString(gbks));
        //[-77, -62, -48, -57, -76, -13, -53, -89, -79, -58]
    }
}
