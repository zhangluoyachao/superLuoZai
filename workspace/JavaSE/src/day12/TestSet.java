package day12;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    @Test
    public void test() {
        Set set = new HashSet<>();
        set.add(10);
        set.add(2112);

        set.add(30);
        set.add("Aa");
        set.add(10);
        set.add(20);
        set.add("BB");
        System.out.println(set);

    }

    @Test
    public void testString() {
        Student s = new Student();
        Integer i = new Integer(100);
        String str = "abc";
        System.out.println("对象的哈希码：" + s.hashCode());
        System.out.println("integer的哈希码：" + i.hashCode());
        System.out.println("字符串的哈希码：" + str.hashCode());
        System.out.println(s.toString());
    }
}
