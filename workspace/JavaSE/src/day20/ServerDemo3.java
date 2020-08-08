package day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//多线程实现Socket
public class ServerDemo3 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8848);
            System.out.println("————服务器创建成功————");
            while (true) {
                Socket socket = ss.accept();//一个socket代表一个客户端
                new Thread(new ServerThread3(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ServerThread3 implements Runnable {
    //区分不同客户端
    private Socket socket;

    public ServerThread3() {
    }

    public ServerThread3(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println(socket.getInetAddress() + "连接成功");//获取客户端IP地址
            InputStream is = socket.getInputStream();
            //OutputStream os = socket.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while (true) {
                String info = br.readLine();
                System.out.println(info);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}