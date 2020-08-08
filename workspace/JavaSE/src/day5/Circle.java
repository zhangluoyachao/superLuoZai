package day5;

public class Circle {
    double r;
    public static final double PI = 3.14;
    double result;

    public Circle() {
        this.r = 4;
    }

    public double S() {
        result = 0.5 * PI * r * r;
        return result;
    }

    public double C() {
        result = 2 * PI * r;
        return result;
    }

    public static void main(String[] args) {
        Circle a = new Circle();
        System.out.println(a.C());
        System.out.println(a.S());
    }

}
