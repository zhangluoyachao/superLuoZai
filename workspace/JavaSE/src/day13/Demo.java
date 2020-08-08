package day13;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    @Test
    public void testTreeSet() {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(1);
        System.out.println(set);
        Set<String> set2 = new TreeSet<>();
        String a[] = {"aaa", "Aaa", "abc", "bcd", "bbc", "cca", "cac", "1", "11", "3"};
        set2.addAll(Arrays.asList(a));
        System.out.println(set2);
    }

    @Test
    public void testTreeSet2() {
        Set<User> set = new TreeSet<>(new Com());
        set.add(new User(3, "龙少琦", "龙少牙", 123));
        set.add(new User(1, "时磊", "磊酱", 123));
        set.add(new User(2, "陈浩", "浩酱", 123));
        set.add(new User(4, "李国兴", "老司机", 123));
        System.out.println(set);
    }

    @Test
    public void testTreeSet3() {
        Set<User> set = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getId() - o2.getId();
            }
        });
        set.add(new User(3, "龙少琦", "龙少牙", 123));
        set.add(new User(1, "时磊", "磊酱", 123));
        set.add(new User(2, "陈浩", "浩酱", 123));
        set.add(new User(4, "李国兴", "老司机", 123));
        System.out.println(set);
    }

    @Test
    public void testTreeSet4() {
//        Comparator<User> com = (o1, o2) -> o1.getId() - o2.getId();
//        Set<User> set = new TreeSet<>(com);
        Set<User> set = new TreeSet<>((o1, o2) -> o1.getId() - o2.getId());
        set.add(new User(3, "龙少琦", "龙少牙", 123));
        set.add(new User(1, "时磊", "磊酱", 123));
        set.add(new User(2, "陈浩", "浩酱", 123));
        set.add(new User(4, "李国兴", "老司机", 123));
        System.out.println(set);
    }

    @Test
    public void testTreeSet5() {

        Set<User> set = new TreeSet<>();
        set.add(new User(3, "龙少琦", "龙少牙", 123));
        set.add(new User(1, "时磊", "磊酱", 123));
        set.add(new User(2, "陈浩", "浩酱", 123));
        set.add(new User(4, "李国兴", "老司机", 123));
        System.out.println(set);
    }
}
