package day12homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
    static Set<Integer> userRed = new HashSet<>();
    static Set<Integer> sysRed = new HashSet<>();
    static Integer userBlue = 0;
    static Integer sysBlue = 0;
    static Integer redAdd = 0;
    static Integer blueAdd = 0;

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        while (userRed.size() != 6) {
            System.out.println("请输入红色球号：（1-33）：");
            int n = sc.nextInt();
            if (n > 0 && n < 34) {
                userRed.add(n);
            }
        }
        while (true) {
            System.out.println("请输入蓝色球号：（1-16）：");
            int n = sc.nextInt();
            if (n > 0 && n < 17) {
                userBlue = n;
                break;
            } else {
                System.out.println("输入错误请重新输入！");
            }
        }
        System.out.println("您输入的红色球为：" + userRed + "蓝色球为：" + userBlue);
        System.out.println("系统正在生成双色球... ...");
        Thread.sleep(2000);
        //生成系统的双色球
        Random rd = new Random();
        //生成红球集合
        while (sysRed.size() != 6) {
            int num = rd.nextInt(33) + 1;
            sysRed.add(num);
        }
        //生成蓝球
        sysBlue = rd.nextInt(16) + 1;
        System.out.println("生成的红色球为：" + sysRed + "蓝色球为：" + sysBlue);
        System.out.println("开奖了！");
        Thread.sleep(2000);
        win();
        reward();
    }

    public static void win() {

        for (Integer a : sysRed) {
            for (Integer b : userRed) {
                if (a == b) {
                    redAdd++;
                }
            }
        }
        if (sysBlue == userBlue) {
            blueAdd++;

            System.out.println("您红色球中了：" + redAdd + "个，蓝色球中了：" + blueAdd + "个");
        }
    }

    public static void reward() {
        int reward = 0;
        String no = "";
        switch (redAdd) {
            case 3:
                no += "六等奖";
                reward = 10;
                break;
            case 4:
                switch (blueAdd) {
                    case 0:
                        no += "五等奖";
                        reward = 50;
                        break;
                    case 1:
                        no += "四等奖";
                        reward = 200;
                        break;
                }
                break;
            case 5:
                switch (blueAdd) {
                    case 0:
                        no += "三等奖";
                        reward = 500;
                        break;
                    case 1:
                        no += "二等奖";
                        reward = 5000;
                        break;
                }
                break;
            case 6:
                if (blueAdd == 1) {
                    no += "一等奖";
                    reward = 100000;
                }
                break;
            default:
                no += "没中奖";
                reward = 0;

        }
        System.out.println(no + ",奖金:" + reward + "元");

    }
}
