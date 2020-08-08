package day16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool4 {
    public static void main(String[] args) {
        /*
         * 4、可周期定长线程池：ScheduledThreadPool
         *       定义一个长度固定，执行最高并发数量的线程池
         *       相比第二种可定长线程池，还支持延迟操作、周期操作
         *       存在三种不同的执行方式：
         *           a.  execute(Runnable类型)
         *           b.  延迟方法
         *           c.  周期方法
         * */
        // ExecutorService es = Executors.newScheduledThreadPool(5);
        //只支持a a为ExecutorService所有的方法 无法调用子类方法
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(5);
        //a 基础  execute
//            for (int i = 0; i < 20; i++) {
//            ses.execute(() -> {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//
        //b 线程延迟操作  schedule
//        for (int i = 0; i < 10; i++) {
//            ses.schedule(() -> {
//                System.out.println(Thread.currentThread().getName());
//            }, 2000, TimeUnit.MILLISECONDS);//延迟2秒
//            //ses.schedule(Runnable,延迟时间，时间单位)
//            //时间单位：TimeUnit.常量  调用
//        }

        //c 周期操作

        ses.scheduleAtFixedRate(() -> {
            Date d = new Date();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sf.format(d));
        }, 0, 1000, TimeUnit.MILLISECONDS);
        //ses.scheduleAtFixedRate(Runnable,首次延迟时间，周期时间，时间单位)
    }
}
