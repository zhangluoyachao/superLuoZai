package day12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList2 {
    @Test
    public void testList2() {
        List list = new ArrayList();
        List<Integer> list2 = new ArrayList();
    }

    @Test   //遍历集合
    public void testList3() {
        List<Student> list = new ArrayList();
        list.add(new Student(10, "时磊", "傻逼"));
        list.add(new Student(10, "陈浩", "傻逼"));
        list.add(new Student(10, "龙少爷", "傻逼"));
        list.add(new Student(10, "老司机", "傻逼"));
        list.add(new Student(10, "皮皮嗨", "傻逼"));
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu);
        }
        //2、增强for
        List<Student> list2 = new ArrayList();
        list2.add(new Student(10, "时磊", "憨批"));
        list2.add(new Student(10, "陈浩", "憨批"));
        list2.add(new Student(10, "龙少爷", "憨批"));
        list2.add(new Student(10, "老司机", "憨批"));
        list2.add(new Student(10, "皮皮嗨", "憨批"));
        for (Student stu : list2) {
            System.out.println(stu);
        }
        //3、迭代器
        List<Student> list3 = new ArrayList<>();
        list3.add(new Student(10, "时磊", "垃圾"));
        list3.add(new Student(10, "陈浩", "垃圾"));
        list3.add(new Student(10, "龙少爷", "垃圾"));
        list3.add(new Student(10, "老司机", "垃圾"));
        list3.add(new Student(10, "皮皮嗨", "垃圾"));
        Iterator<Student> it = list3.iterator();
        while (it.hasNext()) {
            Student stu = it.next();
            System.out.println(stu);
        }

    }
}
