package day15;

public class Ticket implements Runnable {
    Integer sum = 100;//总票数
    int count;//第几张票

    @Override
    public void run() {
        //如果不加同步 多线程实现时 会数据不一致 可能多人买一张票
        //把整个票对象锁起来，当有一个线程执行购票时，其他线程都不允许购票
        synchronized (this) {//把当前对象锁起来

            //购票的过程
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 100; i++) {

                if (sum == 0) break;
                count++;
                sum--;
                System.out.println(name + "买了第" + count + "张,剩余数量是" + sum);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                //买完票需要释放锁 让其他线程买票
                try {
                    this.notifyAll();
                    this.wait();//释放当前对象锁标记 并且自己处于阻塞状态

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class TestTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket, "时磊").start();
        new Thread(ticket, "浩酱").start();
        new Thread(ticket, "林峰").start();
    }
}