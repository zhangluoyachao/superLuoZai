package studybyself;

public class Test_ninming {
    public static void main(String[] args) {
        new niMing().a = 1;

    }
}

class niMing {
    public int a;

    niMing() {
        System.out.println("构造方法");
    }

    public void aa() {
        System.out.println(a);
    }
}