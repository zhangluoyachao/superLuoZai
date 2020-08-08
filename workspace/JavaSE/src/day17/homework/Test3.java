package day17.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        int length = 0;
        Integer AAdd = 0;
        Integer aAdd = 0;
        FileInputStream fis = new FileInputStream("d:\\IO\\testIO.txt");
        FileOutputStream fos = new FileOutputStream("d:\\IO\\result.txt");
        while (length != -1) {
            length = fis.read(b);
        }
        fis.close();
        for (byte a : b) {
            if ((char) a == 'A') {
                AAdd++;
            } else if ((char) a == 'a') {
                aAdd++;
            }
        }
        String result = "A出现的次数：" + AAdd.toString() + " a出现的次数：" + aAdd.toString();
        System.out.println(result);
        fos.write(result.getBytes());
        fos.close();
    }
}
