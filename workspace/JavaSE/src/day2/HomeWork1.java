package day2;
import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args){
        boolean a = true;
        int price = 0;
        int discount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入消费金额：");
        if(sc.hasNextInt()){
            price = sc.nextInt();
            System.out.print("请输入抽到的折扣：");
            if(sc.hasNextInt()){
                discount = sc.nextInt();
                System.out.print("请需要支付的金额为："+price*discount/10);
            } else {
                System.out.println("您输入的数字有误，请重新输入！");
            }

        } else {
            System.out.println("您输入的数字有误，请重新输入！");
        }
    }
}
