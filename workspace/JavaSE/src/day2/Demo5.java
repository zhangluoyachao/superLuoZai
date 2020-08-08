package day2;
import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int price = 0;
        int title = 0;
        String choose = "";
        System.out.println("*******************************************");
        System.out.println("请选择购买的商品编号：");

        System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
        System.out.println("*******************************************");
        System.out.println();
        do{
            System.out.print("请输入商品编号：");
            int num1 = sc.nextInt();
            System.out.print("请输入购买数量：");
            int num2 = sc.nextInt();

            switch (num1){

                case 1:
                    price = 288;
                    System.out.println("T恤￥"+ price + "\t\t数量" + "num2"
                            + "\t\t合计￥" + (price * num2));
                    break;
                case 2:
                    price = 488;
                    System.out.println("网球鞋￥"+ price + "\t\t数量" + "num2"
                            + "\t\t合计￥" + (price * num2));
                    break;
                case 3:
                    price = 1088;
                    System.out.println("网球拍￥"+ price + "\t\t数量" + "num2"
                            + "\t\t合计￥" + (price * num2));
                    break;
                default:System.out.print("您输入有误！\t");
            }

            title += num2 * price;
            System.out.print("是否继续？（Y/N）\t");
            choose = sc.nextLine();


        }while(choose.equals("y"));

    }
}

