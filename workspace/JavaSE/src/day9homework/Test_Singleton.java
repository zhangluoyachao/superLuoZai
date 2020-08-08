package day9homework;

public class Test_Singleton {
    public static void main(String[] args) {

    }
}

class Singleton {
    //私有化构造方法，使得外部无法创建对象
    private Singleton() {

    }

    //提供方法输出 饿汉式
//    Singleton s = new Singleton();
//
//    public static Singleton getSingleton() {
//        return s;
//    }
    //懒汉式
    static Singleton s = null;

    public static Singleton getSingleton() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}
