package day16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool3 {
    public static void main(String[] args) {
        /*
         * 3、单线程池 SingleThreadExecutor：
         *       类似单例模式,适用于执行单个线程的任务
         * */
        ExecutorService es = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            es.execute(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
    }
}
