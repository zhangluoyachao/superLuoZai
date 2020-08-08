package day3;

public class Test1 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int ary[] = new int[a.length+1];
        int index = -1;
        int num = 33;
        //比较取下标
        for(int i = 0; i < a.length;i++){
            if(num < a[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
