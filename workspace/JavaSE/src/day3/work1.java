package day3;

import java.util.Scanner;

public class work1 {

    public static void main(String[] args) {
        int enough = 0;
        int not = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <=10 ; i++) {
            System.out.print("请输入第" + i + "位顾客的年龄：");
            int a = sc.nextInt();
            if(a > 30) {
                enough++;
            }else {
                not++;
            }
        }
        double a = enough/10.0;
        System.out.println("30岁以下的比例是:" + a * 100 + "%");
        System.out.println("30岁以下的比例是:" + (1 - a) * 100 + "%");
    }
}
