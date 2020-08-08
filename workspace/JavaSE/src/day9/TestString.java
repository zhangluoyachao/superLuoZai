package day9;

public class TestString {
    public static void main(String[] args) {
        String str = "this is String";
        System.out.println(str.contains("is"));
        System.out.println(str.startsWith("a"));
        System.out.println(str.endsWith("ing"));
        String a = str.replaceAll("i", "java");
        System.out.println(str);
        System.out.println(a);
        char[] b = str.toCharArray();
        System.out.println(b);
    }
}
