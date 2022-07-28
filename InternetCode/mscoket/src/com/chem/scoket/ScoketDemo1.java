package com.chem.scoket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ScoketDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-7TSBEGI");

        String hostName = address.getHostName();
        System.out.println("主机名为" +hostName);

        String hostAddress = address.getHostAddress();
        System.out.println("ip地址为" + hostAddress);
    }
}
