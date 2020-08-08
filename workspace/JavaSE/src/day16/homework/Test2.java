package day16.homework;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:\\HelloWorld.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        if (f.isDirectory()) {
            System.out.println("它是目录");
        }
        if (f.isFile()) {
            System.out.println("它是文件");
        }


        File f2 = new File("d:\\IOTest");
        if (!f2.exists()) {
            f2.mkdirs();
        }
        System.out.println(f2.getName());

        f.renameTo(new File("d:\\" + f2.getName() + "\\" + f.getName()));

    }
}
