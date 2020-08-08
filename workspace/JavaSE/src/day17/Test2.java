package day17;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("D:\\Test1");
        boolean b = file.delete();
        if (b) System.out.println("删除成功");
    }
}
