package day7;

public /*abstract*/ class Dog extends Pet {
    String type;

    Dog() {
    }

    Dog(String type, String name) {
        this.type = type;
        this.name = name;
    }

    Dog(String type, String name, int health, int love) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.love = love;
    }

    @Override
    public void print() {
        System.out.println("我是一只" + type + "，姓名：" + name + " 健康值：" + health + "，友好度:" + love);
    }

    @Override
    public void eat() {
        System.out.println(name + "开始吃骨头");
    }

    @Override
    public void play() {
        System.out.println(name + "开始玩球");
    }
}
