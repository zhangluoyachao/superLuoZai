package day6;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(System.currentTimeMillis());
//        int a = sc.nextInt();
//        System.out.println(System.currentTimeMillis());

        long lt1 = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long lt2 = System.currentTimeMillis();
        double t = Math.ceil((double) (lt2 - lt1) / 1000);
        System.out.println(t);


    }
}
