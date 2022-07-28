package com.xxxxchen.Array;

import java.util.Scanner;

/*案例：已知一个数组，键盘录入一个数据，查找该数据在数组中的索引*/
public class CheckArray {
    public static void main(String[] args) {
        //1.静态初始化一个数组变量
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //2.键盘输入一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        //3.定义一个索引变量，初始值为-1，假设这个索引不存在
        int index = -1;
        //4.遍历数组，获取到每个数组中的元素
        for (int i = 0; i < arr.length; i++) {
            //5.拿键盘录入的数值进行比较，如果相同就把对应的索引赋值过去
            if (num == arr[i]) {
                //相同就赋值给索引变量，并且用break结束循环
                index = i;
                break;
            }
        }
        //6.输出打印查询的索引
        System.out.println(index);
    }
}
