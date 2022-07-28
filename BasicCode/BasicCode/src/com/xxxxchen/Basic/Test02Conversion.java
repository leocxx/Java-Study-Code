package com.xxxxchen.Basic;

public class Test02Conversion {
    public static void main(String[] args) {
        /*强制转换
           格式： 目标数据类型 变量名 = （目标数据类型）值
        */
        byte a = 4;
        byte b = 8;
        byte c = (byte) (a + b);  //byte short char 会直接提升到int
        //byte c = a + b;

        System.out.println(c);
    }
}
