package day15.homework;


public class TwoThreadTest {
    public static void main(String[] args) {
        TwoThread rTh = new TwoThread();
        Thread t1 = new Thread(rTh, "1");
        Thread t2 = new Thread(rTh, "2");

        t1.start();
        t2.start();

    }
}


class TwoThread implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        int a = Integer.parseInt(name);
        synchronized (this) {
            if (a == 1) {//打印数字
                int add = 0;
                for (int i = 1; i <= 52; i++) {
                    add++;
                    System.out.print(i);
                    if (add == 2) {
                        add = 0;
                        notifyAll();
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            if (a == 2) {//打印字母
                for (int i = 65; i <= 90; i++) {
                    System.out.print((char) i);
                    notifyAll();
                    try {
                        wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}