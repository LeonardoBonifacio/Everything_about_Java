package academy.devdojo.javaoneforall.javacore.Rdate.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        // ALWAYS PREFER TO USE LOCALDATE INSTEAD OF OTHER CLASS TO REPRESENT YOUR DATES
        // this class(LocalDate) is immutable
        // all the changes that you are doing in this object will always create a new
        // object, it's basically a copy of the object that you were changing plus the change that you made
        // System.out.println(new Date());
        // System.out.println(Calendar.getInstance());
        // System.out.println(Month.JANUARY.getValue());

        // System.out.println("------------------------");
        // // working passing dates
        // LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);
        // System.out.println(date);
        // System.out.println(date.getDayOfWeek());
        // System.out.println(date.getMonth());
        // System.out.println(date.getDayOfMonth());
        // System.out.println(date.getMonthValue());
        // System.out.println(date.lengthOfMonth());
        // System.out.println(date.getYear());
        // System.out.println(date.getDayOfYear());
        // System.out.println(date.lengthOfYear());
        // System.out.println(date.isLeapYear());
        // System.out.println(date.get(ChronoField.YEAR));
        // System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
        // working with the date of now
        LocalDate now = LocalDate.now();
        System.out.println(now);
        now = now.plusDays(3);
        now.plusDays(10);// immutable
        System.out.println(now);

    }
}
