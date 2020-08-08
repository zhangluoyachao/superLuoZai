package day17;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class TestInputStream {
    public static void main(String[] args) {
        //如果想去读取本地文件的内容
        File file = new File("D:\\IO\\TestInput.txt");
        FileInputStream fin = null;
        try {

            fin = new FileInputStream(file);
            for (int i = 0; i < file.length(); i++) {
                System.out.print((char) fin.read() + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Test
    public void test2() throws IOException {
        File f = new File("D:\\IO\\TestInput.txt");
        FileInputStream fis = new FileInputStream(f);
        byte[] b = new byte[(int) f.length()];
        fis.read(b);//一次性读一段数据  通过b数组保存
        System.out.println(Arrays.toString(b));
        String str = new String(b, 0, b.length, "utf-8");
        System.out.println(str);
        fis.close();
    }

    @Test
    public void test3() throws IOException {
        File f = new File("D:\\IO\\TestInput.txt");
        FileInputStream fis = new FileInputStream(f);
        byte[] b = new byte[1024];
        int len = 0;
        while ((len = fis.read(b)) != -1) {
            System.out.println(new String(b, 0, len, "utf-8"));
        }
        fis.close();
    }


}
