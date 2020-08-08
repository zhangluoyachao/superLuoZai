package day5;

public class Bird {
    String wing;
    String leg;

    public static void main(String[] args) {

    }
}
class MaQue extends Bird{
    int age;
    double weight;
}

class TuoNiao extends Bird{
    double height;
    int speed;
}
class Eagle extends Bird{
    double flyHeight;

    public void eat(){
        System.out.println("老鹰捕食");
    }
}