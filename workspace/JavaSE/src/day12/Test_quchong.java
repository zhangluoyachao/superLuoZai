package day12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_quchong {
    @Test
    public void test1() {
        List<Integer> list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
//        List<Integer> list2 = new ArrayList();
//        for (Integer a : list1) {
//            if (!list2.contains(a)) {
//                list2.add(a);
//            }
//        }
//        for (Integer a : list1) {
//            list1.contains(a);
//            list1.remove(a);
//        }
        System.out.println(list1.toString());
        List<Integer> list2 = new ArrayList<>();
        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            int i = it.next();
            if (!list2.contains(i)) {
                list2.add(i);
            }
        }
        list1 = list2;
        System.out.println(list1.toString());


    }
}
