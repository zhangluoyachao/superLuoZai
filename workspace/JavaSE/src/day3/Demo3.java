package day3;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0; i < a.length; i++){
            System.out.println("请输入第"+ (i+1) + "个数字");
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);

        }


    }
}
