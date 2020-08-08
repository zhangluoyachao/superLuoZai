package day3;

public class HomeWork3 {
    public static void main(String[] args) {
        int quan = 10000/400;
        int time = 50;
        int addTime = 0;
        for(int i = 2;i <= quan; i++){
            time ++;
            addTime += time;
        }
        System.out.println(addTime);
    }
}
