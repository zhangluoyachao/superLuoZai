package day7homework;

import java.util.Scanner;

public abstract class Drink {
    static Scanner sc = new Scanner(System.in);
    public double pirce;

    public abstract void buy();

    public static void main(String[] args) {
        Drink drink = null;
        System.out.println("请选择您要买的饮料(1、咖啡 2、矿泉水 3、可乐)：");
        int d = sc.nextInt();
        switch (d) {
            case 1:
                drink = new Coffer();
                break;
            case 2:
                drink = new Water();
                break;
            case 3:
                drink = new Color();
                break;
            default:
                System.out.println("您输入错误！");
                System.exit(1);
        }
        drink.buy();

    }
}

class Coffer extends Drink {
    private String add;

    Coffer() {
        this.pirce = 5.20;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAdd() {
        return add;
    }

    @Override
    public void buy() {
        System.out.println("请选择咖啡要加什么（1、加糖 2、加奶 3、加糖加奶 4、什么都不加）：");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                add = "加糖";
                break;
            case 2:
                add = "加奶";
                break;
            case 3:
                add = "加糖加奶";
                break;
        }
        if (add == null) {
            System.out.println("您购买了一杯什么都不加的咖啡");
        } else {
            System.out.println("您购买了一杯" + add + "的咖啡");
        }
    }
}


class Water extends Drink {
    Water() {
        this.pirce = 2.00;
    }

    @Override
    public void buy() {
        System.out.println("您购买了一瓶水");
    }
}

class Color extends Drink {
    Color() {
        this.pirce = 3.50;
    }

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void buy() {
        System.out.println("请问您需要什么品牌的可乐（1、可口可乐 2、百事可乐）：");
        int a = sc.nextInt();
        if (a == 1) {
            type = "可口";
        } else {
            type = "百事";
        }
        System.out.println("您购买了一瓶" + type + "可乐");
    }
}