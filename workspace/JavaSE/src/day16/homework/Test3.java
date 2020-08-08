package day16.homework;

import java.io.File;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径：");
        String lock = sc.nextLine();
        File f = new File(lock);
        if (!f.exists()) {
            System.out.println("您输入错误！");
            return;
        }
        String[] files = f.list((dir, name) -> {
            return name.endsWith(".java");
        });
        if (files.length == 0) {
            System.out.println("该目录下无此文件");
        } else {
            for (String a : files) {
                System.out.println(a);
            }
        }
    }
}
