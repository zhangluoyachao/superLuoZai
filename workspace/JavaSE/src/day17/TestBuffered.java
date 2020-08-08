package day17;

import org.junit.Test;

import java.io.*;

public class TestBuffered {
    @Test
    public void testBuffered1() throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\IO\\output\\java面试宝典.txt");
        FileInputStream fis = new FileInputStream("D:\\java面试宝典.pdf");

        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedInputStream bis = new BufferedInputStream(fis);

        byte[] b = new byte[1024];

        long start = System.currentTimeMillis();
        int length = 0;
        while ((length = bis.read(b)) != -1) {
            bos.write(b, 0, length);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
        bos.close();
        bis.close();
        fos.close();
        fis.close();

    }

    public void testBuffered2() {
    }
}
