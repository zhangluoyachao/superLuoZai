package day8Door;

public abstract class Door implements Lock {
    public void open() {
        System.out.println("门打开了");
    }

    public void close() {
        System.out.println("门关上了");
    }

    @Override
    public void openLock() {
        System.out.println("嘀嘀嘀！锁打开了");
    }

    public void lock() {
        System.out.println("嘀嘀嘀！锁上了");
    }

}
