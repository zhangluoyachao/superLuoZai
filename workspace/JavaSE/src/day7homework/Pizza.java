package day7homework;

import java.util.Scanner;

import static java.lang.Math.random;

public abstract class Pizza {
    double size;

    public abstract void make();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要选择的披萨（1、培根披萨 2、海鲜披萨）：");
        int type = sc.nextInt();
        System.out.println("请输入披萨的尺寸（1、7寸 2、11寸）：");
        int size = sc.nextInt();
        Pizza pizza = null;
        if (type == 1) {
            pizza = new BaconPizza();
        } else {
            pizza = new SeafoodPizza();
        }
        if (size == 1) {
            pizza.size = 7;
        } else {
            pizza.size = 11;
        }
        double a = random();

        pizza.make();


    }
}

class BaconPizza extends Pizza {
    @Override
    public void make() {
        System.out.println("正在制作一个" + size + "寸的培根披萨!");
    }
}

class SeafoodPizza extends Pizza {
    @Override
    public void make() {
        System.out.println("正在制作一个" + size + "寸的海鲜披萨!");
    }
}