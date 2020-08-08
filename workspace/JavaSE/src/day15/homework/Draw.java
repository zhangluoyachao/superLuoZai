package day15.homework;

import java.util.Random;

public class Draw {
    public static void main(String[] args) {
        RunThread1 run = new RunThread1();

        new Thread(run, "抽奖箱1").start();
        new Thread(run, "抽奖箱2").start();

    }
}

class RunThread1 implements Runnable {
    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300};
        Random rd = new Random();
        while (true) {
            synchronized (this) {
                int num = rd.nextInt(arr.length);
                System.out.println(name + "又产生了一个" + arr[num] + "元大奖");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}