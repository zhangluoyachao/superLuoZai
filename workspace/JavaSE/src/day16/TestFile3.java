package day16;

import java.io.File;

public class TestFile3 {
    public static void main(String[] args) {
        File f3 = new File("D:\\File");
        String[] filesName = f3.list();
        File[] files = f3.listFiles();
        String[] filesName2 = f3.list((dir, name) -> {
            //dir是File类型    查找  文件对象
            //name是String类型 查找  文件名称
            //返回值是boolean   用于那些是需要展示用的文件
            //startWith
            //indexOf

            return name.endsWith(".txt");
        });
        for (String a : filesName2) {
            System.out.println(a);
        }
    }
}
