package day16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool2 {
    public static void main(String[] args) {
        /*
         * 2、可定长线程池 FixedThreadPool
         *   定义一个长度固定，支持最高并发数量
         *   如果超过数量了，会进入等待
         * */
        ExecutorService es = Executors.newFixedThreadPool(100);
        //表示最多支持五个 无论使用多少次 都是在等待这五个线程
        for (int i = 0; i < 10; i++) {
            es.execute(() -> {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
