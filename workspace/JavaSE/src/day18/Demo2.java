package day18;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader("d:\\IO\\testReader.txt");
            fw = new FileWriter("d:\\IO\\testWriter.txt");
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                bw.close();
                fr.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
