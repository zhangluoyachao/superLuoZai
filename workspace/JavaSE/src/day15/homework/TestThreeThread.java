package day15.homework;

public class TestThreeThread {

    public static void main(String[] args) {
        OneThread t1 = new OneThread();

    }

    static class OneThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("A");
            }
        }
    }

    static class TwoThread extends Thread {
        @Override
        public void run() {
            OneThread t1 = new OneThread();
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
            }
        }
    }

    static class ThreeThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("C");
            }
        }
    }
}

//class Thread4 implements Runnable {
//    @Override
//    public void run() {
//
//        String name = Thread.currentThread().getName();
//        for (int i = 0; i < 5; i++) {
//            synchronized (this) {
//                System.out.print(name);
//                this.notifyAll();
//                try {
//                    this.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }
//    }
//}
