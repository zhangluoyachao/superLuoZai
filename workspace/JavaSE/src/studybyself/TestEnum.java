package studybyself;

public class TestEnum {
    public static void main(String[] args) {
        for (Color a : Color.values()) {
            System.out.println(a);
        }
    }
}

enum Color {
    RED, BLACK, YELLOW;
}