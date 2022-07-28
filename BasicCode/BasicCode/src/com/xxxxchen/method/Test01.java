package com.xxxxchen.method;

/*数组遍历：      设计一个方法，用于数组遍历，同时要求遍历的结果在同一行上，例如：[11，22，33，44，55]*/
public class Test01 {
    public static void main(String[] args) {
        //1.定义一个数组，静态初始化
        int[] arr = {11, 22, 33, 44, 55};

        printArray(arr);
    }

    //2.定义方法
       /*
       1.参数   int [] arr
       2.返回值类型 void
       */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            }else {
                //3.遍历打印不换行
                System.out.print(arr[i] + ", ");
            }

        }
    }
}
