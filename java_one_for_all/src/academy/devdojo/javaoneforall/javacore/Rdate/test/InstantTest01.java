package academy.devdojo.javaoneforall.javacore.Rdate.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        // instant represent an instantaneous point on the timeline in nanoseconds
        Instant instant = Instant.now();// ZULU TIME a neutral time zone
        // everybody in the whole world if they check the time, they will see the same
        // thing in UTC and ZULU time
        // and in zulu time for whatever other time zone its much more simple of convert
        // applications that will always work with utc and when the user or the
        // developer they are fetching the data back they change the data to the time zone that they are in
        System.out.println(instant);
        System.out.println(LocalDateTime.now());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());//  999.999.999 or over turns out in one second
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3, 0));
        System.out.println(Instant.ofEpochSecond(3, 900_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));


    }
}
