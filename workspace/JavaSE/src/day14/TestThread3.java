package day14;

public class TestThread3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        t.setName("普通号");
        Thread Vip = new Thread(() -> {
            Thread thread = Thread.currentThread();
            for (int i = 1; i <= 50; i++) {
                System.out.println(thread.getName() + "：第" + i + "号看病");

            }
        }, "VIP");
        Vip.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.NORM_PRIORITY);

        Vip.start();
        for (int i = 1; i <= 50; i++) {
            System.out.println(t.getName() + "：第" + i + "号看病");
            if (i == 10) Vip.join();
        }

    }
}

