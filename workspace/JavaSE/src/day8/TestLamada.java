package day8;

public class TestLamada {
    public static void main(String[] args) {
//        Apple a = new Apple() {//匿名内部类实现接口
//            @Override
//            public void juick() {
//                System.out.println("喝果汁");
//            }
//        };
//        a.juick();

        //    Lamada表达式
//        Apple a = (c) -> c;
//        a.juick("桃子");
    }
}

interface Apple {
    public void juick(int a);

    public default void a() {
        System.out.println("默认方法");
    }

    public static void b() {
        System.out.println("抽象类的静态方");
    }
}