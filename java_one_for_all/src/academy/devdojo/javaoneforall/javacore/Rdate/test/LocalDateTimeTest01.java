package academy.devdojo.javaoneforall.javacore.Rdate.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();// you can send a object of local date and local time separately
                                                // or send each one of the fields
        System.out.println(now);

        // all method which already exists in LocalDate and LocalTime also there are
        // here

        LocalDate date = LocalDate.parse("2022-08-04");
        LocalTime time = LocalTime.parse("09:44:21");
        System.out.println("-----------------------");
        System.out.println(date);
        System.out.println(time);
        System.out.println("-------------------------");
        LocalDateTime ldt1 = LocalDateTime.of(date, time);
        LocalDateTime ltd2 = date.atTime(time);
        LocalDateTime ltd3 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ltd2);
        System.out.println(ltd3);
    }
}
