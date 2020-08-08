package day13.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestPeople {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("时磊");
        name.add("时磊");
        name.add("时磊");
        name.add("时磊");
        name.add("时磊");
        name.add("陈浩");
        name.add("陈浩");
        name.add("陈浩");
        name.add("龙少呀");
        name.add("龙少呀");
        name.add("龙少呀");
        name.add("龙少呀");
        name.add("阿妹");
        name.add("阿妹");
        name.add("司机");
        Map<String, Integer> nameMap = new HashMap<>();
        for (int i = 0; i < name.size(); i++) {
            if (!nameMap.containsKey(name.get(i))) {
                nameMap.put(name.get(i), 1);
            } else {
                int a = nameMap.get(name.get(i));
                a++;
                nameMap.put(name.get(i), a);
            }
        }
        System.out.println(nameMap);
    }
}
