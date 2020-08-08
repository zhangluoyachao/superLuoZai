package day4;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choose = "";
        String username = "";
        String password = "";
        String inUsername = "";
        String inPassword = "";
        boolean denglu = false;
        int card;
        do {
            System.out.println("*******欢迎进入SC200503抽奖系统*******");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.抽奖");
            System.out.println("请选择菜单：");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("————————————注册————————————————");
                    System.out.println("请输入您的账户信息：");
                    System.out.print("用户名：");
                    username = sc.next();
                    System.out.print("密码：");
                    password = sc.next();
                    //生成四位随机卡号
                    card = (int)(Math.random()*8999 + 1000);
                    System.out.println("您的信息如下：");
                    System.out.println("用户名："+username+"\t密码："+password+"\t会员卡号："+card);
                    break;
                case 2:
                    //循环结构 三次退出系统
                    int i = 0;
                    do {
                        System.out.println("——————————登录————————————");
                        System.out.print("请输入用户名：");
                        inUsername = sc.next();
                        System.out.print("请输入密码：");
                        inPassword = sc.next();
                        //判断是否相同 相同退出循环
                        if(inUsername.equals(username)&&inPassword.equals(password)){
                            System.out.println("登录成功！");
                            denglu = true;
                            break;
                        }else {
                                System.out.println("输入错误！还剩"+(2-i)+"次机会");
                                i++;
                            }


                        if(i==3){
                            System.out.println("您3次输入错误，退出系统");
                            System.exit(1);
                        }
                    }while (1==1);

                    break;
                case 3:
                    System.out.println("————————————抽奖——————————");
                    if(denglu){

                    }else {
                        System.out.println("您未登录，请返回登录！");
                    }
                    break;

            }
            System.out.println("继续吗？Y/N");
            choose = sc.next();
            //nextLine直接跳出

        }while (choose.equals("y"));
        System.out.println("退出系统");
    }
}

