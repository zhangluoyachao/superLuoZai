package day3;

public class HomeWork4 {
    public static void main(String[] args) {
        double x = 0;
        int i = 0;
        while (x < 56.7){
            i++;
            x += 5;
            if(x < 56.7){
                x-=3.5;
            }
        }
        System.out.println(i);
    }
}
