package mfatorialDemo;

public class mFactorialDemo1 {
    /*100之间的和*/
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
