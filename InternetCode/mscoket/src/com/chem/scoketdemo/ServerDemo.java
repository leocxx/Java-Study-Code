package com.chem.scoketdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //1.创建接受端的对象
        DatagramSocket ds = new DatagramSocket(10000);
        //2.创建接收数据的容器对象
        //接受的参数有数据，以及长度
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //3.调用接收端的数据放在新的容器对象中
        System.out.println("--------接收前--------");
        ds.receive(dp);
        System.out.println("--------接收后--------");
        int length = dp.getLength();
        //4.解析数据，放在控制台
        //byte[] data = dp.getData();
        System.out.println(new String(bytes,0,length));
        //5.释放资源
        ds.close();
    }
}
