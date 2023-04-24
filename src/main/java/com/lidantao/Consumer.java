package com.lidantao;


import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @author Cola
 * @Date 2023年04月22日 22:43:00
 */
public class Consumer {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1", 1234); // 连接服务器
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());// 获得输出流

        User user = (User) inputStream.readObject();

        System.out.println(user.toString());

        inputStream.close(); // 关闭通道
        socket.close(); // 关闭socket通道

    }
}
