package com.xxxxchen.Sentence;

/*
		for死循环格式 :

			for(;;){

			}

		while死循环格式 :

			while(true){

			}

		do..while死循环格式 :

			do{

			}while(true);


		问题: 死循环有应用场景吗?

				例如: 键盘录入一个1-100之间的整数

				顾虑: 键盘录入是用户操作的, 用户就可能会出现一些误操作的现象

	*/
public class DeadLoop {
    public static void main(String[] args) {
       for(;;){
            System.out.println("我停不下来了~");
        }
        /*
        while(true){
            System.out.println("我停不下来了~");
        }*/

        /*do{
            System.out.println("我停不下来了~");
        }while(true);
        */

    }
}
