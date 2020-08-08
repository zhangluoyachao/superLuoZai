package day8Lol;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你要使用的英雄：（1、暗裔剑魔 2、诡术妖姬 3、武器大师）");
        int num = sc.nextInt();
        Hero hero = null;
        switch (num) {
            case 1:
                hero = new AttackHero();
                break;
            case 2:
                hero = new MagicHero();
                break;
            case 3:
                hero = new BothHero();
                break;
        }
        System.out.println("发动攻击");
        hero.attack2();


    }
}
