package day10;

public class Test_Integer {
    public static void main(String[] args) {
        long b = Integer.MIN_VALUE;
        System.out.println(b);
        int n = 10;
        Integer n2 = 10;
        Integer n3 = new Integer(10);
        System.out.println(n == n2);
        System.out.println(n2 == n3);//基本类型 判断相同 只是判断值
        //String和int 之间的相互转换

        //int转String
        int num1 = 123;
        String str = 123 + "";//1、拼接空字符串
        String str2 = Integer.toString(num1);//2、通过封装类中的toString方法
        String str3 = String.valueOf(num1);//3、通过String中的方法
        //String转int
        String str4 = "123456";
        int num2 = Integer.parseInt(str4);//1、封装类中的parseInt()方法 返回值是int
        int num3 = Integer.valueOf(str4);//2、封装类中的valueof()方法 返回值是Integer

        //String==其他基本类型封装里转换跟int几乎类似
    }
}
