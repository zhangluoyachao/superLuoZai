package day12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test_add_addAll {
    @Test
    public void test() {
        List<Integer> list1 = new ArrayList<>();
        List list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(10);
        list2.add(20);
        list2.add(30);

        list2.addAll(list1);

        System.out.println(list2);

    }
}
