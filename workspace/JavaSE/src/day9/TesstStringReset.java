package day9;

public class TesstStringReset {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String[] strAry = str1.split("");
        //数组反转
        String[] newStrAry = new String[strAry.length];
        for (int i = 0; i < strAry.length; i++) {
            newStrAry[strAry.length - 1 - i] = strAry[i];
        }
        System.out.println(newStrAry.toString());
    }
}
