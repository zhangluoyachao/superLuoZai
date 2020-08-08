package day5;

public class Demo1 {
    public Demo1(){
        System.out.println("父类无参");
    }
    public static void main(String[] args) {
        Ch c = new Ch();
    }
}

class Ch extends Demo1{
    public Ch(){
        System.out.println("子类无参");
    }
}