package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("请输入5位学员的成绩：");
        Scanner sc = new Scanner(System.in);
        int ary[] = new int[5];
        ary[0] = sc.nextInt();
        ary[1] = sc.nextInt();
        ary[2] = sc.nextInt();
        ary[3] = sc.nextInt();
        ary[4] = sc.nextInt();
        //选择排序
        for(int i = 0; i < ary.length-1; i++){
            for(int j = i + 1; j < ary.length ;j++){
               if(ary[i] > ary[j]){
                   ary[i] ^= ary[j];
                   ary[j] ^= ary[i];
                   ary[i] ^= ary[j];
               }
            }
        }
        System.out.println(Arrays.toString(ary));

    }
}
