package day15.homework;

import java.util.Random;

public class ProSum3 {
    public static void main(String[] args) {
        consumer con = new consumer();
        producer pro = new producer();
        new Thread(con, "消费者").start();
        new Thread(pro, "生产者").start();
    }
}

class consumer implements Runnable {//消费者
    Goods2 g = Goods2.getGoods2("肥皂", 50, 50);

    @Override
    public void run() {
        Random r = new Random();
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (g) {
                int num = r.nextInt(50) + 1;
                if (num > g.getNum()) {
                    System.out.println("缺货！" + name + "需要：" + num + "个，库存只有：" + g.getNum());
                } else {
                    g.setNum(g.getNum() - num);
                    System.out.println(name + "购买了" + num + "个" + g.getName() + "库存还剩：" + g.getNum());
                }
                g.notifyAll();
                try {
                    g.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class producer implements Runnable {//生产者
    Goods2 g = Goods2.getGoods2("肥皂", 50, 50);

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (g) {
                if (g.getNum() < g.getMaxNum()) {
                    System.out.println(name + "生产了" + (g.getMaxNum() - g.getNum()) +
                            "个" + g.getName() + "现在库存为：" + g.getMaxNum());
                    g.setNum(g.getMaxNum());
                } else {
                    System.out.println("库存已满");
                }
                g.notifyAll();
                try {
                    g.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
