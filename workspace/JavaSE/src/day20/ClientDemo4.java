package day20;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//多人聊天客户端
public class ClientDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的名字：(输入exit时退出)");
        String name = sc.next();

        Socket s = null;
        try {
            s = new Socket("192.168.190.121", 9999);
            //同时使用两个输入流,非常的混乱,推荐使用两个线程
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            OutputStream os = s.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            //一个从服务端接受数据的线程
            new Thread(new ClientServer4(s)).start();
            while (true) {
                String mess = br.readLine();
                if (mess.equals("exit")) {
                    bw.write(name + "退出了聊天室");
                    break;
                } else {
                    bw.write(name + "说：" + mess + "\n");
                }
                bw.flush();
            }
        } catch (IOException e) {

        }
        System.out.println("退出聊天室");
        ServerDemo4.list.remove(s);
        System.exit(0);
    }
}

class ClientServer4 implements Runnable {
    Socket s;

    public ClientServer4() {
    }

    public ClientServer4(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while (true) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}