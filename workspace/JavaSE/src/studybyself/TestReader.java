package studybyself;

import java.io.FileReader;
import java.io.IOException;

public class TestReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d:\\IO\\reader.txt");
        int a = 0;
        while ((a = fr.read()) != -1) {
            System.out.println(a);
        }
        fr.close();
    }
}
