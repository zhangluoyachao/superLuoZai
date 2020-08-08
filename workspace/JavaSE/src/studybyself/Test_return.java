package studybyself;

public class Test_return {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                //跳出一次循环，进入下一次的执行
                System.out.println("退出");
                return;//退出整个方法，而不是只退出这个循环
            }
            System.out.println(i);
        }
        //由于上面使用了return跳出整个方法，所以这句不被执行
        System.out.println("你好");
    }
}




