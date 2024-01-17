package academy.devdojo.javaoneforall.javacore.Rdate.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        now = now.with(ChronoField.DAY_OF_MONTH, 12);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().plusMonths(1).with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
