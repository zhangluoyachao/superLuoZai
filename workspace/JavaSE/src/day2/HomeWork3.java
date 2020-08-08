package day2;
import java.util.Scanner;
public class HomeWork3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入消费金额:");
        if(sc.hasNextInt()){
            int price = sc.nextInt();
            if(price * 0.8 >= 1000){
                System.out.print("获得200元代金卷！");
            }else {
                System.out.print("未获得200元代金卷！");
            }
        }else {
            System.out.print("您输入的金额有误！");
        }
    }
}
