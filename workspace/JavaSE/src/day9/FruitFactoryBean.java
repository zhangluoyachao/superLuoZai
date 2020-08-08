package day9;

import java.util.Scanner;

public class FruitFactoryBean {//水果工厂

    //    public Fruit getFruit(String fru) {
//        Fruit f = null;
//        switch (fru) {
//            case "apple":
//                f = new Apple();
//                break;
//            case "banana":
//                f = new Banana();
//                break;
//            case "orange":
//                f = new Orange();
//                break;
//        }
//        return f;
//    }
    //多工工厂  bean可重用的组件（对象）
    //静态都加static
    public Apple getAppleBean() {
        return new Apple();
    }

    public Banana getBananaBean() {
        return new Banana();
    }

    public Orange getOrangeBean() {
        return new Orange();
    }
}

class TestF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1、苹果汁 2、香蕉汁 3、橙汁");
        int a = sc.nextInt();
        FruitFactoryBean ffb = new FruitFactoryBean();
        Fruit f = null;
        switch (a) {
            case 1:
                f = ffb.getAppleBean();
                break;
            case 2:
                f = ffb.getBananaBean();
                break;
            case 3:
                f = ffb.getOrangeBean();
                break;
        }
        f.fruit();
    }
}