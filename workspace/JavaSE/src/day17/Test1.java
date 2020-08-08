package day17;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        //测试delete
        File f = new File("D:\\IOTest");
        deleteFile(f);
    }

    public static void deleteFile(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length > 0) {
            for (File f : files) {

                deleteFile(f);
            }
        } else {//空目录删除
            boolean b = file.delete();
            if (b) System.out.println("删除成功：" + file.getAbsolutePath());
        }
//        boolean b = file.delete();
//        if (b) System.out.println("删除成功：" + file.getAbsolutePath());
    }
}
