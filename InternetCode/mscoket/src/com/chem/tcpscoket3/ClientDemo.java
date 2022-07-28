package com.chem.tcpscoket3;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);
        //用本地的流，用来读取本地文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("mscoket\\ClientDir\\1.jpg"));

        //写到服务器 ----网络中的流
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);  //通过网络写到服务器
        }

        //给一个结束标记
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        bis.close();
        socket.close();
    }
}
