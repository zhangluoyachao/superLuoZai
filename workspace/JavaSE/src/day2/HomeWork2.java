package day2;
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("请输入一个四位数:");
        if(sc.hasNextInt()){
             num = sc.nextInt();
            if(num < 1000 || num > 9999){
                System.out.print("输入的数字超出范围！");
            }else {
                int ge = num/1%10;
                int shi = num/10%10;
                int bai = num/100%10;
                int qian = num/1000%10;
                int add = ge + shi + bai + qian;
                System.out.println("各个数字之和为：" + add);
            }
        }else {
            System.out.print("输入的不是数字！");
        }
    }
}
