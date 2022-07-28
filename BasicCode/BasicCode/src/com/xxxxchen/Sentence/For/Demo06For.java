package com.xxxxchen.Sentence.For;

/*
案例：在控制台输出所有的水仙花数
        水仙花数：个位，十位，百位的立方数加起来等于原数的三位数
        最后统计结果两行两行输出
        *print和println区别
*/
public class Demo06For {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.print(i + " ");
                count++;
                if (count % 2 == 0) {
                    System.out.println();
                    /*
               打印结果为：   153 370
                            371 407
                      */
                }
            }
        }
    }
}
