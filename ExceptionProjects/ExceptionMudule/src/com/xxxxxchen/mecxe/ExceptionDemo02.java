package com.xxxxxchen.mecxe;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        try {
            int [] arr = {1,2,3,4,5,6};
            System.out.println(arr[10]); //ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
           /* String s = e.toString();
            System.out.println(s);//java.lang.ArrayIndexOutOfBoundsException: 10*/
            e.printStackTrace();
        }
        System.out.println("----------");
    }
}
