package test;

public class Demo {
    public static void main(String[] args) {
        //请使用递归知识，求10的阶乘是多少
        int result = getJc(10);
        System.out.println(result);
        //3628800
    }

    private static int getJc(int i) {
        if(i == 1){
            return 1;
        }else {
            return i * getJc(i-1);
        }
    }
}
