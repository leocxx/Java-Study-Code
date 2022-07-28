package com.xxxxchen.method;
/*案例：设计一个方法，用于获取数组元素的最大值*/
public class Test02 {
    public static void main(String[] args) {
        //1.定义一个数组，静态初始化
        int [] arr = {11,22,33,44,55};

//        getMax(arr);
        System.out.println( getMax(arr));
    }
    //2.编写一个方法，获取最大值
      /*
      参数：int [] arr
      *返回值类型： int
      */
    public static int getMax(int [] arr){
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(Max < arr[i]){
                Max = arr[i];
            }
        }
        return Max;
    }
}
