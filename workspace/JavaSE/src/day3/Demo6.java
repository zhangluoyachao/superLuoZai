package day3;

import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int ary[] = new int[a.length+1];
        int index = -1;
        int num = 33;
        //比较取下标
        for(int i = 0; i < a.length;i++){
            if(num > a[i]){
                index = i;

            }

        }

        //循环插入
        for(int i = 0; i < ary.length;i++){

            if (i < index + 1){
                ary[i] = a[i];
            }else if(i==index+1){
                ary[index+1] = num;
            }else if(i > index+1){
                ary[i] = a[i-1];
            }
        }
        System.out.println(Arrays.toString(ary));
    }
}
