package day14;

public class MyThread2 extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 50; i++) {
            if (i == 10) Thread.yield();
            System.out.println(t.getName() + "我在吃饭" + i);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    public static void main(String[] args) {
        MyThread2 myT = new MyThread2();
        myT.setName("aaa");

        Runnable run = () -> {
            Thread t = Thread.currentThread();
            for (int i = 0; i < 50; i++) {
                System.out.println(t.getName() + "我在睡觉" + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        };
        Thread t = new Thread(run, "小王");
//        t.setPriority(Thread.MIN_PRIORITY);
//        myT.setPriority(Thread.MAX_PRIORITY);
        t.start();
        myT.start();
    }
}
