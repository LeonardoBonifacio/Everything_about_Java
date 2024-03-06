package academy.devdojo.javaoneforall.javacore.Rdate.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now =  LocalDateTime.now();
        LocalDateTime nowAfterTwoYearsAndNineMinutes = now.plusYears(2).plusMinutes(9);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowMinus7Hours = LocalTime.now().minusHours(7);
        // duration between two times
        Duration d1 = Duration.between(now, nowAfterTwoYearsAndNineMinutes);
        Duration d2 = Duration.between(timeNow, timeNowMinus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        // duration of one specifc amount of time
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofHours(20);
        Duration d6 = Duration.ofMinutes(20);
        Duration d7 = Duration.ofSeconds(20);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);
        // this class duration not suport all of the values of ChronoUnit

    }
}
