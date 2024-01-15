package academy.devdojo.javaoneforall.javacore.Rdate.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime birthdate = LocalDateTime.of(2003, 11, 16, 12, 0,0);
        System.out.println("Time between my bornDay");
        System.out.println("Days " + ChronoUnit.DAYS.between(birthdate, LocalDateTime.now()));
        System.out.println("Decades " + ChronoUnit.DECADES.between(birthdate, LocalDateTime.now()));
        System.out.println("Hours " + ChronoUnit.HOURS.between(birthdate, LocalDateTime.now()));
        System.out.println("Minutes " + ChronoUnit.MINUTES.between(birthdate, LocalDateTime.now()));
        System.out.println("Months " + ChronoUnit.MONTHS.between(birthdate, LocalDateTime.now()));
        System.out.println("Years " + ChronoUnit.YEARS.between(birthdate, LocalDateTime.now()));
        System.out.println("Seconds " + ChronoUnit.SECONDS.between(birthdate, LocalDateTime.now()));
    }
}
