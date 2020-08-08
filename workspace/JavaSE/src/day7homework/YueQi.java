package day7homework;

public abstract class YueQi {
    public abstract void play();
}

class ErHu extends YueQi {
    @Override
    public void play() {
        System.out.println("当当当");
    }
}

class Violin extends YueQi {
    @Override
    public void play() {
        System.out.println("零零零");
    }
}

class Piano extends YueQi {
    @Override
    public void play() {
        System.out.println("噔噔蹬");
    }
}
