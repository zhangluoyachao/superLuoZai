package day20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//实现多人在线聊天
//原理：通过客户端发送消息到服务器
//服务器再将数据发送给其他服务器
public class ServerDemo4 {
    static List<Socket> list = new ArrayList<>();//聊天室的集合

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8848);
            System.out.println("————聊天室开启成功————");
            while (true) {
                Socket socket = ss.accept();
                list.add(socket);
                new Thread(new ServerThread4(socket)).start();
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }

    }
}

class ServerThread4 implements Runnable {
    private Socket s;

    public ServerThread4() {
    }

    public ServerThread4(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println(s.getInetAddress() + "连接成功！");
        try {
            InputStream is = s.getInputStream();//客户端的数据流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while (true) {
                String clientMess = br.readLine();
                System.out.println(clientMess);
                //给其他人写入该数据
                for (Socket a : ServerDemo4.list) {
                    if (a != s) {
                        OutputStream os = a.getOutputStream();
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
                        bw.write(clientMess + "\n");
                        bw.flush();
                    }
                }
            }
        } catch (IOException e) {

        }
    }

}