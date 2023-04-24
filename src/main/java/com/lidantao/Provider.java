package com.lidantao;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Cola
 * @Date 2023年04月22日 22:43:00
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1234); // 建立通信，端口为1234
        while (true) {
            System.out.println("========等待客户端连接中========");
            System.out.println();
            Socket client = serverSocket.accept();
            System.out.println("========新的客户端接入========");
            System.out.printf("客户端ip地址为: %s", client.getInetAddress().toString());
            System.out.println();
            ObjectOutputStream outputStream = null;
            outputStream = new ObjectOutputStream(client.getOutputStream()); // 获得输入流
            outputStream.writeObject(new User("1", "可乐manman")); // 传送资源
            outputStream.flush(); // 刷到缓存区发送
            outputStream.close();
            System.out.println("========客户端断开连接========");
            System.out.println();
        }
    }
}
