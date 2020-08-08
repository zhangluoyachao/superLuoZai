package day13;

import org.junit.Test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class TestHashTbale {
    @Test
    public void a() {
        Map<String, String> map = new Hashtable<>();
        map.put("1", "abc");
        map.put("2", "bcd");
        //编译通过，但是会报空指针异常 hashTable不支持

        System.out.println(map);
        Iterator it = map.entrySet().iterator();
    }
}
