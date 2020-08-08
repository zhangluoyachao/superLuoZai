package day12homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String args[]) {
        List<String> list = new ArrayList();
        List<String> list2 = new ArrayList();
        list.add("abc");
        list.add("123");
        list.add("java");
        list.add("mysql");
        list.add("别跑啊");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String i = it.next();
            switch (i.length()) {
                case 1:
                    i = "000" + i;
                    break;
                case 2:
                    i = "00" + i;
                    break;
                case 3:
                    i = "0" + i;
                    break;
                default:
            }
            list2.add(i);
        }
        System.out.println(list2);
    }
}
