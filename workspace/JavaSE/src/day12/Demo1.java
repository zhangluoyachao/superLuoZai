package day12;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {//集合底层实现原理模拟
    static int num[] = new int[10];

    public static void main(String[] args) {
        for (int i = 0; ; ) {
            Scanner sc = new Scanner(System.in);
        }
    }

    public static void capacity() {
        int num[] = new int[10];
        int newLength = (int) (num.length * 1.5);
        num = Arrays.copyOf(num, newLength);
        System.out.println("" + newLength);
    }
}


