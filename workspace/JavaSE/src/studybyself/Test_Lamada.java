package studybyself;

public class Test_Lamada {
    public static void main(String[] args) {
        A a = (b) ->
                System.out.println("a" + b);
        a.a(10);
    }
}

interface A {
    public abstract void a(int a);
}