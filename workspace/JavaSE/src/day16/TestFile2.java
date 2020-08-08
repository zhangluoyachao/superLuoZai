package day16;

import java.io.File;
import java.io.IOException;

public class TestFile2 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\File\\A\\a.txt");
        if (!file.exists()) {
            boolean c = file.createNewFile();
            System.out.println(c);
        }
        String fileName = file.getName();
        long len = file.length();
        System.out.println(fileName + "所占字节:" + len);
        System.out.println(file);

    }
}
