package day2;
import java.util.Scanner;
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integral = 0;
        double discount = 0;
        double consumption = 0;

        System.out.print("请输入消费金额：");
        if(sc.hasNextInt()){
            consumption = sc.nextDouble();

            System.out.print("请输入积分数：");
            if(sc.hasNextInt()){
                integral = sc.nextInt();
                if(integral > 0 && integral <= 2000){
                    discount = 0.9;
                }else if(integral>2000 && integral <= 4000){
                    discount = 0.8;
                }else if(integral>4000 && integral <= 8000){
                    discount = 0.75;
                }else {
                    discount = 0.7;
                }
                System.out.print("您需要支付的金额为：" + consumption * discount);
            }else {
                System.out.print("输入的不是数字！");
            }


        }else {
            System.out.print("输入的不是数字！");
        }


    }
}
