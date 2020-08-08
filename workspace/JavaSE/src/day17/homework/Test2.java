package day17.homework;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:\\IO\\testOutPut");
        if (!f.exists()) {
            boolean b = f.mkdirs();
            if (b) System.out.println("目录不存在，创建成功！");
        }
        FileInputStream fis = new FileInputStream("d:\\1.jpg");
        FileOutputStream fos = new FileOutputStream("d:\\IO\\testOutPut\\1.jpg");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] b = new byte[1024];
        int length = 0;
        while ((length = bis.read(b)) != -1) {
            bos.write(b, 0, length);
        }
        bis.close();
        bos.close();
        fis.close();
        fos.close();
    }
}
