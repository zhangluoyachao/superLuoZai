package day18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo4 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("d:\\IO\\testWriter.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write("傻逼时磊\n");
            osw.write("我是你爹");
            osw.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
