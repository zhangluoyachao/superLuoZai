package day4;

public class TestDog {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.color = "白色";
        d.type = "哈士奇";

        d.eat("food");
        d.print();
        Dog2 c = new Dog2();
        d.print();
    }
}
class Dog2 {
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