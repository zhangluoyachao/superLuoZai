package day16.homework;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径：");
        String lock = sc.nextLine();
        File f = new File(lock);
        if (!f.exists() || !f.isDirectory()) {
            System.out.println("您输入错误！目录不存在");
            return;
        }
        //递归遍历返回所有文件集合
        List<File> f1 = recursive(f);
        //遍历List集合
        for (File file : f1) {
            System.out.println(file);
        }
    }

    public static List<File> recursive(File f) {//参数为目录

        File[] fileArr = f.listFiles();
        List<File> f1 = new ArrayList<>();//目录文件的集合
        List<File> f2 = new ArrayList<>();//返回文件的集合

        for (File a : fileArr) {//目录文件遍历存进集合中
            f1.add(a);
        }
        for (File a : f1) {
            //将所有文件存入返回文件集合中
            if (a.isFile()) {
                f2.add(a);
            }
            //目录则再调用方法
            if (a.isDirectory()) {
                f2.addAll(recursive(a));
            }
        }

        return f2;//返回文件集合
    }

}
