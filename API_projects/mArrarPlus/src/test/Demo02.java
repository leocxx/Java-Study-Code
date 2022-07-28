package test;

public class Demo02 {
    public static void main(String[] args) {
        /*二分查找*/
        int [] arr = {1,2,3,4,5,6,7,8,9};

        int number = 6;

        int index = TwoSearch(arr,number);
        System.out.println(index);

    }
    private static int TwoSearch(int[] arr, int number) {
        //4.定义查找范围
        int min = 0;
        int max = arr.length - 1;
        //5.循环查找，条件是min<=max
        while (min <= max) {
            //6.计算中间值mid
            int mid = (min + max) / 2;
            //会产生3种关系
            if (arr[mid] > number) {
                //中间值大于要查找的number说明在左边
                max = mid - 1;
            } else if (arr[mid] < number) {
                //中间值小于要查找的number说明在右边
                min = mid + 1;
            }else {
                //中间值等于要查找的number直接返回mid
                return mid;
            }
        }
        //min>max说明不存在，返回-1
        return -1;
    }
}
