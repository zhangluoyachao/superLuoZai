package day13.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap();
        while (true) {
            System.out.println("请输入商品名称：(输入end结束)");
            String a = sc.nextLine();
            if (a.equals("end")) break;
            if (map.containsKey(a)) {
                int num = map.get(a) + 1;
                map.put(a, num);
            } else {
                map.put(a, 1);
            }

        }
        System.out.println(map);
    }
}
