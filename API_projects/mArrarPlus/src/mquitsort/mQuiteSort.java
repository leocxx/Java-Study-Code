package mquitsort;

public class mQuiteSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        //定义方法，参数为要排序的数组及范围
        quiteSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quiteSort(int[] arr, int left, int right) {
        //临时存储一下left和right
        int left0 = left;
        int right0 = right;

        //找出基准数
        int baseNumber = arr[left0]; //默认左边第一个为基准数

        while (left != right) {
            //从右边开始找比基准数小的
            while (arr[right] >= baseNumber && right > left) {
                right--;
            }
            //从左边开始找比基准数大的
            while (arr[left] <= baseNumber && right > left) {
                left++;
            }
            //交换两个值的位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;
    }
}
