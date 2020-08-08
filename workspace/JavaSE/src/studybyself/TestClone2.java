package studybyself;

public class TestClone2 implements Cloneable {
    private int i;
    private String name;
    private B b = new B();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        TestClone2 t = (TestClone2) super.clone();
        t.b = (B) b.clone();
        return super.clone();
    }

    @Override
    public String toString() {
        return "TestClone2{" +
                "i=" + i +
                ", name='" + name + '\'' +
                ", b=" + b +
                '}';
    }


}

class B implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        TestClone2 clone = new TestClone2();
        TestClone2 c2 = (TestClone2) clone.clone();
        System.out.println(clone);
        System.out.println(c2);
    }
}