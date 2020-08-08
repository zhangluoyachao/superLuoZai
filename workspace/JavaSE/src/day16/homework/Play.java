package day16.homework;

import java.util.Random;

public class Play {
    private int maxDistance;
    private String champion;
    private boolean b = false;

    public Play() {
    }

    public Play(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public boolean getB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
}

class Rabbit implements Runnable {
    private Play p;

    public Rabbit(Play p) {
        this.p = p;
    }

    public void setP(Play p) {
        this.p = p;
    }

    @Override
    public void run() {
        int distance = 0;
        Random r = new Random();
        String name = Thread.currentThread().getName();
        while (!p.getB()) {
            synchronized (p) {
                if (distance < p.getMaxDistance()) {
                    int a = r.nextInt(10) + 1;
                    distance += a;
                    System.out.println(name + "跑了" + a + "米,歇会！它已经跑了" + distance + "米");

                    if (distance >= p.getMaxDistance()) {
                        if (!p.getB()) {
                            p.setB(true);
                            p.setChampion(name);
                            System.out.println(name + "第一个到达终点,游戏结束！冠军是：" + name + "!!!");

                        } else {
                            System.out.println(name + "到达终点!");
                        }
                        break;
                    }
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Tortoise implements Runnable {
    private Play p;

    public Tortoise(Play p) {
        this.p = p;
    }

    public void setP(Play p) {
        this.p = p;
    }

    @Override
    public void run() {
        int distance = 0;
        Random r = new Random();
        String name = Thread.currentThread().getName();
        while (!p.getB()) {
            synchronized (p) {
                if (distance < p.getMaxDistance()) {
                    int a = r.nextInt(5) + 1;
                    distance += a;
                    System.out.println(name + "跑了" + a + "米,歇会！它已经跑了" + distance + "米");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (distance >= p.getMaxDistance()) {
                    if (!p.getB()) {
                        p.setB(true);
                        p.setChampion(name);
                        System.out.println(name + "第一个到达终点,游戏结束！冠军是：" + name + "!!!");
                    } else {
                        System.out.println(name + "到达终点");
                    }
                    break;
                }
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
