package day16;

/*
 * 线程死锁
 *
 */
public class Lock implements Runnable {
    static Object o1 = new Object();
    static Object o2 = new Object();
    int a = 0;

    public Lock(int a) {
        this.a = a;
    }

    @Override
    public void run() {

        if (a == 1) {
            synchronized (o1) {
                System.out.println("线程1锁住了o1");
                synchronized (o2) {
                    System.out.println("线程1锁住了o2");
                }
            }
        }
        if (a == 2) {
            synchronized (o2) {
                System.out.println("线程2锁住了o2");
                synchronized (o1) {
                    System.out.println("线程2锁住了o1");
                }
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Lock l = new Lock(1);
        Lock l2 = new Lock(2);
        new Thread(l, "1").start();
        new Thread(l2, "2").start();
    }
}