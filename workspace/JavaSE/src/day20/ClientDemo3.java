package day20;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//多线程实现客户端
public class ClientDemo3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的昵称：");
            String name = sc.next();

            Socket client = new Socket("192.168.190.121", 9999);

            //改成手动输入
            InputStream is = System.in;
            OutputStream os = client.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            while (true) {
                String mess = br.readLine();
                bw.write(name + ":" + mess + "\n");
                bw.flush();//必须加 清空缓存
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
