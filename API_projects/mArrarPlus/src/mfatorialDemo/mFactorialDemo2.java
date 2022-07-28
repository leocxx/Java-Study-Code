package mfatorialDemo;

public class mFactorialDemo2 {
    public static void main(String[] args) {
        /*递归思想求100之间的和*/
        int sum = getGetsum(100);
        System.out.println(sum);
    }

    private static int getGetsum(int i) {
        if(i == 1){
            return 1;
        }else {
            return i + getGetsum(i-1);
        }
    }
}
