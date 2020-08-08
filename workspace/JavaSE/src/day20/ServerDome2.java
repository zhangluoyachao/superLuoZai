package day20;


import doudou5G.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端 传输对象
public class ServerDome2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(8848);
        Socket socket = ss.accept();//客户端
        InputStream is = socket.getInputStream();
//        OutputStream os = socket.getOutputStream();

        ObjectInputStream ois = new ObjectInputStream(is);
        User u = (User) ois.readObject();
        System.out.println("客户端传递来的数据：" + u.getUseName() + " " + u.getPassWord());

        socket.shutdownInput();//如果没有别的操作可以不写

        ois.close();
        is.close();
        socket.close();
    }
}
