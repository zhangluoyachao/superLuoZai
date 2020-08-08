package day13.homework;


import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestStudent {
    @Test
    public void test() {
        Map<Student2, String> map = new HashMap<>();
        map.put(new Student2("时磊", 24), "铜鼓");
        map.put(new Student2("陈浩", 24), "长沙");
        map.put(new Student2("龙少爷", 24), "宜春");
        map.put(new Student2("阿妹", 24), "进贤");
        Iterator<Student2> it = map.keySet().iterator();
        while (it.hasNext()) {
            Student2 stu = it.next();
            System.out.println(stu + "--" + map.get(stu));
        }

    }
}
