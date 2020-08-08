package day20;

import doudou5G.User;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

//客户端
public class ClientDemo2 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8848);
            OutputStream os = s.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            User u = new User("时磊", "123", 1);

            oos.writeObject(u);
            s.shutdownOutput();

            oos.close();
            os.close();

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
