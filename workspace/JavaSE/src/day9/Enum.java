package day9;

public enum Enum {
    RED("红"),
    Green("绿"),
    BLACK("黑");

    Enum(String a) {
    }

    public void test() {
    }
}

class TestEnum {
    public static void main(String[] args) {
        Enum c = Enum.RED;
        switch (c) {
            case RED:
                System.out.println("红色");
                break;
            case BLACK:
                System.out.println("黑色");
                break;
            case Green:
                System.out.println("绿色");
                break;
        }

    }
}

//一个类实现单例 通过枚举
class Singleton2 {
    //1、私有构造方法
    private Singleton2() {
    }

    //2、定义枚举
    private enum testEnum {//私有化 只能本类能用
        ONE;//只能定义一个
        private Singleton2 s = null;

        private testEnum() {
            s = new Singleton2();//只有一个枚举 所有只会执行一次
        }
    }

    //3、定义一个方法 调用枚举 获取对象
    public Singleton2 getSingleton2() {
        return testEnum.ONE.s;
    }

    String name;
    String age;
}

