package day10;

public class Test_StringBuilder {
    public static void main(String[] args) {
        //1、创建对象
        StringBuffer sb = new StringBuffer("StringBuffer");
        StringBuilder sb2 = new StringBuilder("StringBuilder");
        //修改sb的原数组 不需要重新赋值
        sb.append("这是一个增强型字符串");
        sb.delete(0, 6);
        sb.deleteCharAt(2);
        sb.insert(2, "f");
//        System.out.println(sb);
//        String str1 = "abc123";
//        String str2 = "abc";
//        String str3 = str2 + 123;//str2的引用+123  两者不是指向同一个位置
//        System.out.println(str1 == str3); false
//
//        String str1 = "abc123";
//        final String str2 = "abc";//常量
//        String str3 = str2 + 123;//将str2的值和123进行拼接
//        System.out.println(str1 == str3);//true

        String str1 = "abc123";
        final String str2 = getString();//只有当运行时 才会出现具体的值
        String str3 = str2 + 123;//这时str2既然没有实际的值 就代表str2的引用 指向堆内存
        System.out.println(str1 == str3);//false


    }

    public static String getString() {
        return "abc";
    }
}
