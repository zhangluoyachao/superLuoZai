package day7;

import java.util.Scanner;

public class Person {
    String name;
    static Scanner sc = new Scanner(System.in);

    public void feed(Pet p) {//实现宠物喂食
        p.eat();
    }

    public void play(Pet p) {
        p.play();
    }

    public static Dog dog() {
        System.out.println("请选择要领养的狗狗：1、边牧 2、汪汪 3、二哈");
        int a = sc.nextInt();
        String type = "";
        switch (a) {
            case 1:
                type = "边牧";
                break;
            case 2:
                type = "汪汪";
                break;
            case 3:
                type = "二哈";
                break;
        }
        System.out.println("请输入狗狗的姓名");
        String name = sc.next();
        Dog dog = new Dog(type, name);
        return dog;
    }

    public static Penguin penguin() {
        System.out.println("请选择要领养企鹅的性别：1、雄性 2、雌性");
        int a = sc.nextInt();
        String sex = "";
        switch (a) {
            case 1:
                sex = "雄性";
                break;
            case 2:
                sex = "雌性";
                break;
        }
        System.out.println("请输入企鹅的姓名");
        String name = sc.next();
        Penguin pen = new Penguin(sex, name);
        return pen;
    }

    public static void main(String[] args) {
        System.out.println("1、狗 2、企鹅");
        System.out.println("请输入你领养的宠物");
        int a = sc.nextInt();
        Person person = new Person();
        Pet p = null;
        if (a == 1) {
            p = dog();
        } else {
            p = penguin();
        }
        System.out.println("您的宠物领养成功：1、喂食 2、玩耍");
        int i = sc.nextInt();
        if (i == 1) {
            person.feed(p);
        } else if (i == 2) {
            person.play(p);
        }
    }
}