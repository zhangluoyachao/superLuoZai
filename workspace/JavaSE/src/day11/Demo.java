package day11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        //String -->LocalDate
        //String字符串是有格式要求的 必须是正常的日期 月1-12 日按照年月自动给出范围
        //月和天都是两位 06
        LocalDate ld = LocalDate.parse("2020-06-10");

        //Date 转换时间戳 通过Instant转换成LocalDate
        Date d1 = new Date();
        Instant ins = d1.toInstant();

        //Date-->LocalDate
        //ZoneId.systemDefault()    获取系统默认时区
        LocalDate ld2 = ins.atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(ld2);

        //LocalDate-->String    format方法
        String time = ld2.format(DateTimeFormatter.ISO_DATE);//只有年月日 ISO_DATE_TIME 啥都有
        System.out.println(time);

    }
}
