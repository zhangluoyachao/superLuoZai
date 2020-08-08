package day3;

public class HomeWork2 {
    public static void main(String[] args) {
        int a[] = {12,25,45,81,24,78,99};
        int addOdd = 0;
        int addEven = 0;
        //奇数和 偶数和
        for (int i = 0;i < a.length;i++){
            if((a[i] & 1 )== 0){
                addOdd += a[i];
            }else {
                addEven += a[i];
            }
        }
        // 最大值最小值
        for(int i = 0;i < a.length-1;i++){
            for(int j = i+1; j < a.length ;j++){
               if (a[i]>a[j]){
                   a[i] ^= a[j];
                   a[j] ^= a[i];
                   a[i] ^= a[j];
               }
            }
        }
        System.out.println("奇数和为："+ addOdd);
        System.out.println("偶数和为："+ addEven);
        System.out.println("最小值为："+ a[0]);
        System.out.println("最大值为："+ a[a.length-1]);

    }
}
