package day5;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = -1;
        int add = 0;
        Monster mon = new Monster("史莱姆", 1000, 50, 50);
        Hero hero = new Hero("傻逼时磊", 1500, 100, 100);
        int monHp = mon.hp;
        do {
            mon.hp = monHp;
            System.out.println("你遇到了一只" + mon.name );
            mon.information();
            System.out.println("是否攻击?y/n");
            String yn = sc.next();
            if (yn.equals("y")) {
                do {
                    if (hero.hp > 0) {
                        mon.fangyu(hero.attackPower);
                        if (mon.hp > 0) {
                            hero.fangyu(mon.attackPower);
                        }
                    }

                } while (hero.hp > 0 && mon.hp > 0);

                if (hero.hp > 0) {
                    hero.hp += monHp * 0.2;
                    hero.attackPower += mon.attackPower * 0.2;
                    hero.fangYuLi += mon.fangYuLi * 0.2;
                    System.out.println("您击杀的怪物！攻击力增加：" + mon.attackPower * 0.2 + "点 防御力增加："
                            + mon.fangYuLi * 0.2 + "点 HP增加" + monHp * 0.2 + "点");
                    hero.information();
                    System.out.println("是否继续？y/n");
                    yn = sc.next();
                    if (yn.equals("y")) {
                        continue;
                    } else {
                        i = 1;
                        add++;
                        break;
                    }
                }
                if (hero.hp < 0) {
                    System.out.println("你被怪物击杀了，垃圾！");
                    i = 0;
                    break;
                }
            } else System.out.println("你逃跑成功，怂逼！");
        } while (true);
        System.out.println("游戏结束！");
        if (i == 1) {
            System.out.println("你打败了" + add + "只" + mon.name);

        } else if (i == 0) {
            System.out.println("你连" + mon.name + "都打不过，丢人");
        }
    }

}

class Model {
    public String name;
    public int hp;
    public int attackPower;
    public int fangYuLi;

    public Model(String name, int hp, int attackPower, int fangYuLi) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.fangYuLi = fangYuLi;
    }

    public int attack() {
        return attackPower;
    }

}

class Monster extends Model {
    public Monster(String name, int hp, int attackPower, int fangYuLi) {
        super(name, hp, attackPower, fangYuLi);
    }

    public void fangyu(int attackPower) {
        int shanghai = 0;
        if (attackPower >= 0) {
            if (attackPower > fangYuLi) {
                shanghai = attackPower - fangYuLi;
                System.out.println("你攻击怪物");
                System.out.println("攻击" + name + "成功,造成" + shanghai + "点伤害！");
                System.out.println("怪物的防御力为：" + fangYuLi);
                hp -= shanghai;
                System.out.println("怪物HP：" + hp);
                System.out.println();
            } else {
                System.out.println("你攻击怪物");
                System.out.println("未破防，无法造成伤害，推荐溜溜球，别嗯送！");
                System.out.println("怪物的防御力为：" + fangYuLi);
                System.out.println("怪物HP:" + hp);
                System.out.println();
            }
        }
    }

    public void information() {
        System.out.println("——————怪物信息——————");
        System.out.println("名称：" + name);
        System.out.println("攻击力:" + attackPower);
        System.out.println("防御力：" + fangYuLi);
        System.out.println("生命值：" + hp);
        System.out.println("———————————————————");
    }
}

class Hero extends Model {
    public Hero(String name, int hp, int attackPower, int fangYuLi) {
        super(name, hp, attackPower, fangYuLi);
    }

    public void information() {
        System.out.println("——————玩家信息——————");
        System.out.println("昵称：" + name);
        System.out.println("攻击力:" + attackPower);
        System.out.println("防御力：" + fangYuLi);
        System.out.println("生命值：" + hp);
        System.out.println("———————————————————");
    }

    public void fangyu(int attackPower) {
        int shanghai = 0;
        if (attackPower >= 0) {
            if (attackPower > fangYuLi) {
                shanghai = attackPower - fangYuLi;
                System.out.println("怪物攻击你");
                System.out.println("怪物攻击你成功,造成" + shanghai + "点伤害！");
                hp -= shanghai;
                System.out.println("玩家HP：" + hp);
                System.out.println();

            } else {
                System.out.println("怪物攻击你");
                System.out.println("未破防，无法造成伤害，他是个渣渣，别怂干就完事了！");
                System.out.println("玩家HP:" + hp);
                System.out.println();
            }
        }
    }
}
