package day7;

public class Penguin extends Pet {
    String sex;

    Penguin() {
    }

    Penguin(String sex, String name) {
        this.sex = sex;
        this.name = name;
    }

    Penguin(String sex, String name, int health, int love) {
        this.sex = sex;
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public void print() {
        System.out.println("我是一只" + sex + "企鹅，姓名：" + name + " 健康值：" + health + "，友好度:" + love);
    }

    @Override
    public void eat() {
        System.out.println(name + "吃鱼");
    }

    @Override
    public void play() {
        System.out.println(name + "开始玩玩具");
    }
}
