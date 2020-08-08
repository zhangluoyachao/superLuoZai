package day12homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //创建54张扑克集合
        List<Poker> pokers = new ArrayList();
        pokers = getPokers();
        System.out.println("打乱前：" + pokers);
        //随机
        Collections.shuffle(pokers);
        System.out.println("打乱后：" + pokers);
        //创建玩家对象
        Player landLord = new Player("地主");
        Player farmers1 = new Player("农民1");
        Player farmers2 = new Player("农民2");

        //随机发牌

        for (int i = 0; i < 3; i++) {
            Player p = null;
            switch (i) {
                case 0:
                    p = landLord;
                    break;
                case 1:
                    p = farmers1;
                    break;
                case 2:
                    p = farmers2;
                    break;
            }
            for (int j = 0; j < 17; j++) {
                Random r = new Random();
                int index = r.nextInt(pokers.size());
                p.keepPoker.add(pokers.get(index));
                pokers.remove(index);
            }
        }

//        //农民1抓
//        for (int j = 0; j < 17; j++) {
//            Random r = new Random();
//            int index = r.nextInt(pokers.size());
//            farmers1.keepPoker.add(pokers.get(index));
//            pokers.remove(index);
//        }
//        //农民2抓
//        for (int j = 0; j < 17; j++) {
//            Random r = new Random();
//            int index = r.nextInt(pokers.size());
//            farmers2.keepPoker.add(pokers.get(index));
//            pokers.remove(index);
//        }
        //地主获得最后三张
        for (Poker p : pokers) {
            landLord.keepPoker.add(p);
        }

        //打印每个人的牌
        System.out.println("地主的牌是：" + landLord.keepPoker);
        System.out.println("农民1的牌是：" + farmers1.keepPoker);
        System.out.println("农民2的牌是：" + farmers2.keepPoker);
    }


    public static List<Poker> getPokers() {//创建一副扑克
        List<Poker> list = new ArrayList<>();
        Suit suit = Suit.SPADE;
        for (int i = 0; i < 13; i++) {
            list.add(new Poker(i + 1, suit));
        }
        suit = Suit.HEART;
        for (int i = 0; i < 13; i++) {
            list.add(new Poker(i + 1, suit));
        }
        suit = Suit.DIAMOND;
        for (int i = 0; i < 13; i++) {
            list.add(new Poker(i + 1, suit));
        }
        suit = Suit.CLUB;
        for (int i = 0; i < 13; i++) {
            list.add(new Poker(i + 1, suit));
        }
        list.add(new Poker(14, suit));
        list.add(new Poker(15, suit));
        return list;
    }


}


class Poker {
    public int point;
    Suit suit;

    public Poker(int point, Suit suit) {
        this.point = point;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String strPoint = "";
        String result = "";
        if (point < 14) {
            if (point == 1) {
                strPoint = "A";
                result = suit.getStr() + strPoint;
            } else if (point > 10) {
                switch (point) {
                    case 11:
                        strPoint = "J";
                        break;
                    case 12:
                        strPoint = "Q";
                        break;
                    case 13:
                        strPoint = "K";
                        break;
                }
                result = suit.getStr() + strPoint;
            } else {

                result = suit.getStr() + point;
            }

        } else {
            switch (point) {
                case 14:
                    strPoint = "🃏小王";
                    break;
                case 15:
                    strPoint = "🃏大王";
                    break;
            }
            result = strPoint;
        }
        return result;
    }
}

enum Suit {

    SPADE("♠"), HEART("♥"), DIAMOND("♦"), CLUB("♣");
    private String str;

    Suit(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}


class Player {
    private String name;

    public List<Poker> keepPoker = new ArrayList<>();

    public Player(String name) {
        this.name = name;

    }
}