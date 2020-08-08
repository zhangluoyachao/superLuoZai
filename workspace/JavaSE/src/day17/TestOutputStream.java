package day17;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {
    @Test
    public void test1() throws IOException {
//        File file = new File("d:\\IO\\output");
//        if (!file.exists()) {
//            boolean b = file.mkdirs();
//            if (b) System.out.println("文件之前不存在，创建成功");
//        }
        FileOutputStream ft = new FileOutputStream("d:\\IO\\output\\a.txt", true);
//        ft.write(97);
        ft.write("11".getBytes("utf-8"));
        ft.write("22".getBytes("utf-8"));
        ft.write("33".getBytes("utf-8"));
        ft.close();

    }

    @Test
    public void test2() throws IOException {
        //实现文件的复制
        //对于IO相当于   先读取目标文件，然后再将读取的内容写入复制的文件中
        //相当ctrl+c ctrl+v
        FileInputStream fis = new FileInputStream("D:\\java面试宝典.pdf");
        FileOutputStream fos = new FileOutputStream("D:\\IO\\output\\java面试宝典.pdf");
        byte[] b = new byte[1024];
        int len = 0;
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }
        fis.close();
        fos.close();
    }
}
