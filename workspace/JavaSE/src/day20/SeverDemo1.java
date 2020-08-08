package day20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class SeverDemo1 {
    //客户端向服务端发送简单字符串
    public static void main(String[] args) throws IOException {
        //1、创建服务端对象 ServerSocket    并且规定端口  不要冲突
        //参数可以有也可以没有 为int类型的端口号
        ServerSocket ss = new ServerSocket(8848);
        //2、等待客户端链接 类似IO操作，等待
        //Socket对象就是客户端对象
        Socket socket = ss.accept();
        //如果连接成功，再执行下面的语句
        System.out.println("————客户端连接成功————");

        //进行数据传递
        //1、通过服务端获取客户端传递的数据
        //通过服务端获取的IO流进行数据传输
        //读
        InputStream is = socket.getInputStream();//获取字节输入流，返回一个字节输入流
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String info;

        while ((info = br.readLine()) != null) {
            System.out.println(info);
        }
        socket.shutdownInput();//给客户端一个回应，读取结束

        //
        OutputStream os = socket.getOutputStream();//获取字节输出流，返回一个字节输出流
        OutputStreamWriter osw = new OutputStreamWriter(os);
        //BufferedWriter bw = new BufferedWriter(osw);
        os.write("客户端：欢迎您访问".getBytes());
        //socket.shutdownOutput();

        //关流
        osw.close();
        os.close();

        isr.close();
        is.close();


    }
}
