package day16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {
        /*  ExecutorService：线程池的父类
        Executors类:提供很多静态方法 用于创建线程池
        1、可缓存线程池：CachedThreadPool
          空间可以无限大，当使用时可以线程中获取.
          当长时间不使用会自动回收，如果线程不够了会自动创建新的线程
    */
        ExecutorService es = Executors.newCachedThreadPool();
        //在使用时：线程数量不固定，随着需求增长而增长，如果不使用还会再利用
        for (int i = 1; i < 20; i++) {
            es.execute(() -> {
                String name = Thread.currentThread().getName();
                System.out.println(name);
            });//调用一个可执行的线程
        }


    }
}
