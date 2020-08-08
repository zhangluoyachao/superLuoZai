package day11;

import java.time.LocalDate;

public class Test2 {
    public static void main(String[] args) {
        String time = "1998-03-09";
        //String 转 LocalDate
        LocalDate ld = LocalDate.parse(time);//String 转LocalDate是有格式要求的 必须是yyyy-MM-dd
        String str = ld.toString();
        System.out.println(str);
    }
}
