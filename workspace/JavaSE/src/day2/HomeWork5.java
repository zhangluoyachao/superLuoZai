package day2;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        double length = 0;
        double width = 0;
        double radius = 0;
        double height = 0;
        System.out.println("请选择图形：\n1、长方形\t2、正方形\t3、三角形\t4、圆形");
        if(sc.hasNextInt()){
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.print("请输入长方形的长：");
                    length = sc.nextDouble();
                    System.out.print("请输入长方形的宽：");
                    width = sc.nextDouble();
                    System.out.print("长方形的面积为：" + length * width);
                    break;
                case 2:
                    System.out.print("请输入正方形的边长：");
                    length = sc.nextDouble();
                    width = length;
                    System.out.print("正方形的面积为：" + length * width);
                    break;
                case 3:
                    System.out.print("请输入三角形的底边长：");
                    height = sc.nextDouble();
                    System.out.print("请输入三角形的底边长：");
                    width = sc.nextDouble();
                    System.out.print("三角形的面积为：" + 1/2 * height * width);
                    break;
                case 4:
                    System.out.print("请输入圆形的半径：");
                    radius = sc.nextDouble();
                    System.out.print("圆形的面积为：" + 3.14 * radius * radius);
                    break;
                default: System.out.print("您输入的数字有误！");
            }
        }else {
            System.out.print("输入的不是数字！");
        }
    }
}
