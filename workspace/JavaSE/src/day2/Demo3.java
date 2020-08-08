package day2;

import  java.text.DecimalFormat;
public class Demo3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.0000");
        String a = df.format(12312335.45445);
        System.out.print(a);
    }
}
