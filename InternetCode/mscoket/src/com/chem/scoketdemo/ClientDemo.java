package com.chem.scoketdemo;

import java.io.IOException;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //1.创建发送端的对象
        DatagramSocket ds = new DatagramSocket();
        //2.创建数据，并把数据打包(参数)
        //发送的数据，长度，
        String s = "这是发送的数据";
        byte[] bytes = s.getBytes();
        //接收端，端口号
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
        //3.调用方法，发送数据
        ds.send(dp);
        //4.释放资源
        ds.close();
    }
}
