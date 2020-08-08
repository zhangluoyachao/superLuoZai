package day14;

import org.junit.Test;

public class TestThread {
    public static void main(String[] args) {
        //获取当前线程获取。名字
        System.out.println(Thread.currentThread().getName());
        //使用线程的步骤：
        // 1、定义线程
        // 2、创建线程对象
        // 3、启动线程
        // 4、终止线程

//        MyThread myT = new MyThread();
//        MyThread myT2 = new MyThread();
//        MyRunnable myR = new MyRunnable();//
//        Thread t = new Thread(myR, "a");
////        myT2.setName("a");
//        myT.setName("b");
//        myT.start();
//        myT2.start();
//        t.start();

        //测试线程不连续
        MyThread myT = new MyThread();
        MyThread myT2 = new MyThread();
        MyRunnable myR = new MyRunnable();

        Thread t = new Thread(myR, "a");
        Thread t1 = new Thread(myR, "b");
        Thread t2 = new Thread(myR, "c");
        t.start();
        t1.start();
        t2.start();
        //run()方法 也是开启线程
        t.run();
        t1.run();
        t2.run();

//        run和start的区别：
//        run表示只有一个主线程去执行   类似于方法调用，顺序执行
//        start表示多个线程执行，主线程和子线程交替执行
    }

    //Junit测试方法也是调用了主线程
    @Test
    public void abc() {
        System.out.println(Thread.currentThread().getName());//main
    }
}
