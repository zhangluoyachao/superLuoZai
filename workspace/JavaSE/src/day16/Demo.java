package day16;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Goods g = new Goods();
        new Thread(() -> {
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 5; i++) {
                g.buy(name);
            }
        }, "时磊").start();
        new Thread(() -> {
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 5; i++) {
                g.buy(name);
            }
        }, "龙少牙").start();
        new Thread(() -> {
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 5; i++) {
                g.add(name);
            }
        }, "浩酱").start();
    }
}


class Goods {
    int maxNum = 10;
    int num = 0;
    String goodsName = "大鸭梨";

    public synchronized void buy(String name) {
        //把当前对象添加对象锁
        //如果其他线程也要执行这个方法    需要等待线程释放该锁
        //如果其他线程也要执行这个对象中的其他方法  也需要等待其释放该锁
        maxNum--;
        num++;
        System.out.println(name + "购买了第" + num + "个" + goodsName + ",还剩下" + maxNum + "个");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void add(String name) {
        Random r = new Random();
        int add = r.nextInt(5) + 1;
        maxNum += add;
        System.out.println(name + "生产了" + add + "个鸭梨,现在库存还有：" + maxNum);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
