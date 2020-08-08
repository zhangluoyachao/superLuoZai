package day7homework;

import java.util.Scanner;

public class Person {
    public void play(YueQi yueQi) {
        yueQi.play();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        YueQi y = null;
        System.out.println("请输入要弹奏的乐器（1、二胡 2、钢琴 3、小提琴）：");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                y = new ErHu();
                break;
            case 2:
                y = new Piano();
                break;
            case 3:
                y = new Violin();
                break;
        }
        y.play();
    }
}
