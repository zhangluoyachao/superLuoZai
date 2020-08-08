package day3;

public class Demo4 {
    public static void main(String[] args) {
        int[] a = {1,5,8,4,3};
        for(int i = 0;i < a.length - 1;i++){//外层循环
            for(int j = 0;j < a.length - 1 - i;i++){//内层循环
                if(a[j]>a[j+1]){//判断大小
                    a[j] ^= a[j+1];//两数交换
                    a[j+1] ^= a[j];
                    a[j] ^= a[j+1];
                }
            }
        }
    }
}
