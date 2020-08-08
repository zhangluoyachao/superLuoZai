package day16;

public class Demo2 {
    public static void main(String[] args) {
        ThreeThread t = new ThreeThread();
        new Thread(() -> {

            t.one();
        }).start();
        new Thread(() -> t.two()).start();
        new Thread(() -> t.three()).start();
    }
}

class ThreeThread {
    public synchronized void one() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A");

        }
    }

    public synchronized void two() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B");
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void three() {
        for (int i = 0; i < 5; i++) {
            System.out.println("C");
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}