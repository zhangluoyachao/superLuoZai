package day12;

public class Test_Error {
    public static void main(String[] args) {
        //1、栈溢出异常 递归调用main函数无限创建args数组
        //java.lang.StackOverflowError
//        main(args);
        //2、堆溢出异常 java.lang.NegativeArraySizeException
        int[] a = new int[10086 * 10086 * 10086];
    }
}
