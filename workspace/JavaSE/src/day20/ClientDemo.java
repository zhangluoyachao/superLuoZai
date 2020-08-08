package day20;

import java.io.*;
import java.net.Socket;

//客户端
//注：先运行服务端再运行客户端
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //1、客户端先连接服务端
        //创建客户端对象
        //不能直接连接，需要提供IP和端口号，直接连会报错ConnectException连接错误
        //Socket可以无参，可以有参：（String IP地址，int 端口号）
        //注：本机IP：1、直接写IP地址  2、127.0.0.1     3、localhost
        Socket clientSocket = new Socket("localhost", 8848);

        //写
        OutputStream os = clientSocket.getOutputStream();
//        OutputStreamWriter osw = new OutputStreamWriter(os);
//        BufferedWriter bw = new BufferedWriter(osw);
        os.write("我是客户端".getBytes());
        clientSocket.shutdownOutput();

        //读
        InputStream is = clientSocket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String mess;

        while ((mess = br.readLine()) != null) {
            System.out.println(mess);
        }


//        isr.close();
//        is.close();
//        osw.close();
//        os.close();
//        clientSocket.close();
    }
}
