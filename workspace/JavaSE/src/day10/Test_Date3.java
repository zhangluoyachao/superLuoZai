package day10;

import java.time.LocalDate;


public class Test_Date3 {
    public static void main(String[] args) {
//        LocalDate ld = LocalDate.now();
//        LocalTime lt = LocalTime.now();
//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ld);
//        System.out.println(lt);
//        System.out.println(ldt);
//        DayOfWeek i = ld.getDayOfWeek();
//        System.out.println(i);
//        LocalDate ld = LocalDate.now();
//        ld = ld.withYear(3000);
//        ld = ld.withDayOfYear(120);
//        ld = ld.plusDays(-100);
//        System.out.println(ld);
        LocalDate ld = LocalDate.of(2016, 7, 30);
        LocalDate ld2 = LocalDate.of(2017, 7, 15);
        int a = ld.until(ld2).getYears();
        int b = ld.until(ld2).getMonths();
        int c = ld.until(ld2).getDays();

        System.out.println(a + " " + b + " " + c);
    }
}
