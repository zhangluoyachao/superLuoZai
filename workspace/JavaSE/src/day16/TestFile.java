package day16;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        //File 对操作系统中的文件或目录做操作
        //1、创建一个File对象
        //如果在创建文件时候 没有写具体地址 只写了文件名
        // 只会相对于当前项目目录创建
        File file = new File("D:\\File");
        if (!file.exists()) {//文件不存在
            boolean a = file.mkdir();//创建   父级不存在创建失败 返回false
            // 文件存在返回false
            System.out.println(a);
            boolean b = file.mkdirs();//创建  文件存在返回false 父级不存在逐级创建
            System.out.println(b);
        }
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        System.out.println("目录：" + isDirectory + "文件：" + isFile);
        String path = file.getPath();//获取相对地址
        System.out.println(path);
        String absolutePath = file.getAbsolutePath();//获取绝对路径
        System.out.println(absolutePath);
    }
}
