package day12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    @Test
    public void testArrayList() {
        //最常用
        List list = new ArrayList();
        System.out.println(list.size());//0 获取集合中元素的个数
        list.add(123);

        list.add(new Test_Error());
        System.out.println(list.size());
        System.out.println(list);
        list.add(1, "在1插入");
        System.out.println(list);
        list.addAll(list);
        System.out.println(list);
    }
}
