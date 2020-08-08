package day7;

public abstract class Pet {
    String name;
    int health;
    int love;

    public abstract void print();

    public abstract void eat();

    public abstract void play();

//    public static void main(String[] args) {
////        Pet a = new Pet() {
////            public void print() {
////
////            }
////        };
//        Dog d = new Dog();
//        d.print();
//        d.eat();
//        Penguin pen = new Penguin();
//        pen.print();
//        pen.eat();
//    }
}
