package day14;

//实现线程第一种方法
public class MyThread extends Thread {
    @Override
    public void run() {
        //获取线程名称  一般是线程对象调用getName()
        //线程中则获取当前线程
        Thread t = Thread.currentThread();//获取当前线程
        System.out.println("我是一个线程，我的名字是：" + t.getName());

    }
}

//实现线程的第二种方式：实现Runnable接口，重写Run方法
class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();//获取当前线程
        for (int i = 0; i < 20; i++) {
            System.out.println(i + "我是另一个线程，我的名字是：" + t.getName());
        }
    }
}
