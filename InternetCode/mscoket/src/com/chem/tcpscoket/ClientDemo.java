package com.chem.tcpscoket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //1.创建一个Socket对象
        Socket socket = new Socket("127.0.1.0",10000);
        //2.获取一个IO流，来写数据
        OutputStream stream = socket.getOutputStream();
        stream.write("Hello".getBytes());
        //3.释放资源
        socket.close();
        stream.close();
    }
}
