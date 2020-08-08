package day16.homework;

public class Test1 {
    public static void main(String[] args) {
//        Play p = new Play(100);
//        //创建兔子线程池
//        ScheduledExecutorService exR = Executors.newScheduledThreadPool(10);
//        Rabbit rabbit = new Rabbit();
//        rabbit.setP(p);
//        for (int i = 0; i < 10; i++) {
//            exR.schedule(rabbit, 2, TimeUnit.SECONDS);
//        }
//        //创建乌龟线程池
//        ScheduledExecutorService exT = Executors.newScheduledThreadPool(10);
//        Tortoise tortoise = new Tortoise();
//        tortoise.setP(p);
//        for (int i = 0; i < 10; i++) {
//            exT.schedule(tortoise, 2, TimeUnit.SECONDS);
//        }
        Play p = new Play(100);
        Thread t1 = new Thread(new Rabbit(p), "兔子");
        Thread t2 = new Thread(new Tortoise(p), "乌龟");
        t1.start();
        t2.start();


    }
}
