package day4;

public class Dog {
    String name;
    String color;
    String type;
    public void run(){//跑方法
        System.out.println("跑");
    }
    public void eat(String a){
        System.out.println("吃"+a);
    }


    public void print(){
        System.out.println(name+color+type);
    }
}
