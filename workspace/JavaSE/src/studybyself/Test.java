package studybyself;

// 创建Animal类
class Animal {
    protected String name;    // 可被子类访问的name

    public Animal() {
        this.name = "Animal";
    }

    // 封装
    public String getName() {
        return this.name;
    }

}

class Cat extends Animal {
    Cat() {
        name = "Cat";
    }
}

class Dog extends Animal {
    Dog() {
        name = "Dog";
    }
}

public class Test {
    //    static public void board(Animal s) {
//        System.out.println(s.getName());
//    }
//
//    public static void main(String[] args) {
//        Animal animal = new Animal();    //创建Animal对象
//        Animal cat = new Cat();            //创建Cat对象
//        Animal dog = new Dog();            //创建Dog对象
//        // 三块广告牌
//        board(animal);
//        board(cat);
//        board(dog);
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        System.out.println(a.equals(b));
        int a1 = 1, b1 = 2;

        System.out.println(a1 + "" + b1);
    }

}

