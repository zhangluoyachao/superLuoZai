package day13.homework;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        Set<Student> stu = new TreeSet<>((o1, o2) -> {
            if (o1.getResults() != o2.getResults()) {
                return o2.getResults() - o1.getResults();
            }
            return o1.getNo() - o2.getNo();

        });
        Random r = new Random();
        for (int i = 0; i < 40; i++) {
            int results = r.nextInt(51) + 50;
            String name = "学员" + (180201 + i);
            int no = 180201 + i;
            stu.add(new Student(name, no, results));

        }
        System.out.println(stu);
    }
}

