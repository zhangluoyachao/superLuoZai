package day5;

public class Animal {
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void move() {
        System.out.println("移动");
    }
}

class Rabbit {
    public void eat() {
        System.out.println("吃草");
    }

    public void move() {
        System.out.println("跳");
    }
}

class Tiger {
    public void eat() {
        System.out.println("吃兔子");
    }

    public void move() {
        System.out.println("跑");
    }
}

class Eagle2 {
    public void eat() {
        System.out.println("吃兔子");
    }

    public void move() {
        System.out.println("飞");
    }
}