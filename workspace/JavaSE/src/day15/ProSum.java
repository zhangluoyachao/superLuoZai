package day15;

/*
 *   有两个线程   模拟生产和消费
 *   生产线程   会生产一个商品
 *   消费线程   会消费一个线程
 *
 */
public class ProSum implements Runnable {
    Integer num = 0;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (this) {
                if (name.equals("生产者")) {
                    System.out.println(name + "生产了一个商品" + ++num);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    notifyAll();
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(name + "消费了一个商品" + --num);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    notifyAll();
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }//如果出了同步代码块 代表对象同时释放同步代码块
        }
    }
}

class Test {
    public static void main(String[] args) {
        ProSum p = new ProSum();
        new Thread(p, "生产者").start();
        new Thread(p, "消费者").start();

    }
}