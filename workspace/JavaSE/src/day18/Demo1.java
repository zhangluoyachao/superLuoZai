package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("d:\\IO\\testReader.txt");
            char[] ch = new char[1024];
            int length;
            String str = "";
            while ((length = fr.read(ch)) != -1) {
                str = String.valueOf(ch, 0, length);
            }
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
