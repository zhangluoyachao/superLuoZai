package day3;

public class HomeWork1 {
    public static void main(String[] args) {
        double a = 1;
        double add = a;
        int i = 1;


//        while(a<10){
//            a *= 1.5;
//            add += a;
//            i++;
//        }
//        System.out.println(i);
        do{
            a *= 1.5;
            add += a;
            i++;
        }while(i<30);
        System.out.println(add);
    }
}
