package com.xxxxchen.Sentence.If;

import java.util.Scanner;

/*案例：键盘录入学生成绩
        根据对应阶段给予奖励
        95-100  玩游戏一小时
        75-90  洗锅刷碗
        60-70   抄书
        不及格  挨打
*/
public class TestIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (0 <= score && score <= 100) {
             //这里使用了if的嵌套
            if(95 <= score && score <= 100){
                System.out.println("玩游戏一小时");
            }else if (75 <= score && score <= 90){
                System.out.println("洗锅刷碗");
            }else if(60 <= score && score <= 70){
                System.out.println("抄书");
            }else {
                System.out.println("准备挨打！");
            }
        } else {
            System.out.println("你输入的成绩有误！");
        }
    }
}
