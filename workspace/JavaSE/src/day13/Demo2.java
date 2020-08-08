package day13;

import org.junit.Test;

import java.util.*;

public class Demo2 {
    @Test
    public void testHashMap() {
        Map map = new HashMap();
        map.put("123", "abc");
        map.put(123, "java");
        map.put("456", new User());
        System.out.println(map);
        Map<String, User> map2 = new HashMap();
        map2.put("北京", new User());
        map2.put("北京", new User(1, "张三", "admin", 123));
        map2.put("南京", new User());
        map2.put(null, new User());
        map2.put(null, new User());
        System.out.println(map2);
        System.out.println(map2.get(null));
        //增强for
        //map的遍历一般是遍历key值 然后通过key值获取value

        for (String a : map2.keySet()) {
            System.out.println("key:" + a + " value:" + map2.get(a));
        }
        //迭代器
        //通过keySet()方法创建迭代器
        Iterator<String> it = map2.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println("key:" + key + " value:" + map2.get(key));
        }
        //entry 表示实体，包含了key和value
        //获取Map中的所有实体
        for (Map.Entry<String, User> a : map2.entrySet()) {
            System.out.println(a.getKey() + a.getValue());
        }
    }

    @Test
    public void test() {
//        Map<String, String> map = new TreeMap<>();
//        map.put("abc", "11123");
//        map.put("bcd", "12123");
//        map.put("dfg", "12213");
//        map.put("def", "1223");
        Map<Employee, String> map2 = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getMoney() != o2.getMoney()) {
                    return (int) (o1.getMoney() - o2.getMoney());
                } else {
                    return o1.getId() - o2.getId();

                }
            }
        });
        map2.put(new Employee(30, 5000.0), "用户4");
        map2.put(new Employee(60, 5000.0), "用户1");
        map2.put(new Employee(20, 4000.0), "用户2");
        map2.put(new Employee(50, 6000.0), "用户3");
        map2.put(new Employee(40, 6000.0), "用户5");
        for (Employee a : map2.keySet()) {
            System.out.println(a);
        }

    }
}
