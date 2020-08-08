package day20.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File oldFile = null;
        while (true) {
            System.out.print("请输入需要复制的文件地址：");
            String oldLocation = sc.nextLine();
            oldFile = new File(oldLocation);
            if (!oldFile.exists()) {
                System.out.println("输入文件地址不存在！请重新输入！");
            } else break;
        }
        System.out.print("请输入目标地址：");
        String newLocation = sc.nextLine();
        File newFile = new File(newLocation);
        if (!newFile.exists()) {
            //创建目录和文件
            int index = newLocation.lastIndexOf("\\");
            String sub = newLocation.substring(0, index + 1);
            File directory = new File(sub);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            try {
                newFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //获取文件字节数
        long oldLen = oldFile.length();

        //复制
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(oldFile);
            fos = new FileOutputStream(newFile);

            byte[] b = new byte[1024];
            int length;
            long add = 0;
            while ((length = fis.read(b)) != 0) {
                add += length;
                fos.write(b, 0, length - 1);
                double per = (double) add / oldLen;
                if (per == 0.2)
                    System.out.println(oldFile + "文件已经复制" + per * 100 + "%");
                else if (per > 0.5)
                    System.out.println(oldFile + "文件已经复制" + per * 100 + "%");
                else if (per == 1)
                    System.out.println(oldFile + "文件已经复制" + per * 100 + "%");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(oldFile + "复制完成！");
    }
}
