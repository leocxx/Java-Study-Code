package com.xxxxxchen.stringbuilder;

/*
 *      字符串拼接
 *
 *
 * */
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        String s = arrStr(arr);

        System.out.println(s);

    }

    public static String arrStr(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }
}
