package com.chem.tcpscoket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //1.创建一个ServerSocket对象
        ServerSocket ss = new ServerSocket(10000);
        //2.监听客户端，返回一个Socket对象
        System.out.println("11111");
        Socket socket = ss.accept();
        System.out.println("22222");
        //3.获取一个IO输入流
        InputStream is = socket.getInputStream();
        int b;
        while ((b = is.read()) != -1){
            System.out.print((char) b);
        }
        //4.释放资源
        ss.close();
        is.close();
    }
}
