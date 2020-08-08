package day9homework;

public class Test_SingletonEnum {
}

class Singleton2 {
    //私有化构造方法，使得外界无法创建对象
    private Singleton2() {
    }


    //提供静态方法输出对象
    public static Singleton2 getSingleton2() {
        return TestSingleton2.ONE.s;
    }

    //枚举法
    private enum TestSingleton2 {
        ONE;
        private Singleton2 s = null;

        private TestSingleton2() {
            s = new Singleton2();
        }
    }
}