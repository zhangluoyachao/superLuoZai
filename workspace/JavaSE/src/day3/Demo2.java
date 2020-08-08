package day3;

public class Demo2 {
    public static void main(String[] args) {
        double[] ary = new double[5];
        ary[0] = 15.5;
        ary[1] = 15.6;
        ary[2] = 15.7;
        ary[3] = 15.8;
        ary[4] = 15.9;
        for(int i = 0; i < ary.length ;i++){
            System.out.println(ary[i]);
        }
        for(double i:ary){
            System.out.println(i);
        }

    }
}
