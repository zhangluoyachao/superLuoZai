package day5;

import java.util.Scanner;

public class A {
    int v = 100;
    int num;
    int add=0;
    boolean a = true;
    public void guess(){
        Scanner sc = new Scanner(System.in);

        do {
            add++;
            System.out.print("请输入数字：");
            num = sc.nextInt();
            if (num > v){
                System.out.println("猜大了，您猜了"+add+"次");
            }
            if(num == v){
                System.out.println("猜中了，您猜了"+add+"次");
                a = false;
            }
            if (num < v){
                System.out.println("猜小了，您猜了"+add+"次");
            }

        }while (a);

        switch (add){
            case 1:
                System.out.println("王者");break;
            case 2:
            case 3:
                System.out.println("宗师");break;
            case 4:
            case 5:
                System.out.println("钻石");break;
            case 6:
            case 7:
                System.out.println("黄金");break;
            case 8:
            case 9:
                System.out.println("白银");break;
            case 10:

                System.out.println("青铜");break;
            default:
                System.out.println("黑铁，丢人。不会真有人十下猜不出来吧？不会吧！不会吧！");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.guess();
    }
}
