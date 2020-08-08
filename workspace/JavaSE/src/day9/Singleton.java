package day9;

public class Singleton {
    private Singleton() {
    }

    ;

    static Singleton s = new Singleton();//静态变量

    public static Singleton getSingleton() {
        //必须使用静态方法
        //return new Singleton(); 一样不同
        return s;
    }
}

class Test {
    public static void main(String[] args) {
        Singleton a = Singleton.getSingleton();

    }
}