package day15;

import java.util.Random;

public class ProSum2 {
    public static void main(String[] args) {
        Goods g = new Goods("肥皂", 50, 50);
        Thread pro = new Thread(new Producer(g), "生产者");
        Thread con = new Thread(new Consumer(g), "消费者");
        pro.start();
        con.start();
    }
}

class Producer implements Runnable {
    Goods g;

    public Producer(Goods g) {
        this.g = g;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (g) {
                if (g.getNum() < g.getMaxNum()) {
                    System.out.println(name + "生产了" + (g.getMaxNum() - g.getNum()) + "个商品，目前库存数量为：" + g.getMaxNum());
                    g.setNum(g.getMaxNum());
                }
                if (g.getNum() == g.getMaxNum()) {
                    System.out.println("库存满了");

                }
                g.notifyAll();
                //this.wait(); 会报异常，该对象必须存在锁标记，如果没有会报异常
                //wait的含义是释放this的锁标记，但是this并没有上锁，所以说会报异常
                //一般情况下，锁了谁，释放谁
                try {
                    g.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}


class Consumer implements Runnable {
    Goods g;

    public Consumer() {
    }

    public Consumer(Goods g) {
        this.g = g;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("-------消费了！--------");
        Random r = new Random();
        while (true) {
            synchronized (g) {

                int num = r.nextInt(g.getMaxNum()) + 1;
                if (g.getNum() >= num) {
                    g.setNum(g.getNum() - num);
                    System.out.println(name + "消费购买" + num + "件" + g.getName());
                    System.out.println("库存还剩：" + g.getNum());
                } else {
                    System.out.println("库存不足！" + name + "需要购买:" + num + "个,库存只有:" + g.getNum());
                    g.notifyAll();
                    try {
                        g.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }
            }

        }
    }
}



