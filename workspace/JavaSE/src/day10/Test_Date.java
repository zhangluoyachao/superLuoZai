package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test_Date {

    public static void main(String[] args) throws Exception {
        //日期第一种方式   java.util.Date
        Date d = new Date();
        int year = d.getYear();//横线不是错误，是java不推荐 有更好的方式
        System.out.println(d);
        //对日期做格式化
        //日期格式：y年 M月 d日 h时 m分 s秒 S毫秒 a上午或下午
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String time = sdf.format(d);
        System.out.println(time);

        String newTime = "2050年10月30日 17:30:50";
        Date d2 = sdf.parse(newTime);
        System.out.println(d2);

        //第二种日期格式 Calendar （抽象类）
        //类似于日历插件对象
        Calendar cal = Calendar.getInstance();
        Date d3 = new Date();//当前系统时间
        cal.setTime(d3);//设置时间
        //cal.get(调用日历对象中设置好的常量使用日期)
        int num = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(num);
        int num2 = cal.get(Calendar.DAY_OF_WEEK);//从星期天开始算
        System.out.println(num2);
        int num3 = cal.get(Calendar.MONDAY);
        System.out.println(num3);
    }
}
