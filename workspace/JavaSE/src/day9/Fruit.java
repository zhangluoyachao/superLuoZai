package day9;

public abstract class Fruit {
    public abstract void fruit();
}

class Apple extends Fruit {
    @Override
    public void fruit() {
        System.out.println("苹果汁");
    }
}

class Banana extends Fruit {
    @Override
    public void fruit() {
        System.out.println("香蕉汁");
    }
}

class Orange extends Fruit {
    @Override
    public void fruit() {
        System.out.println("橙汁");

    }
}
