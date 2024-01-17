package academy.devdojo.javaoneforall.javacore.Rdate.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        System.out.println();

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println();

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);
        System.out.println();

        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime2 = instant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);
        System.out.println();

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        System.out.println();

        ZoneOffset manausOffset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(manausOffset);
        System.out.println(offsetDateTime1);
        System.out.println();

        OffsetDateTime offsetDateTime2 = instant.atOffset(manausOffset);
        System.out.println(offsetDateTime2);
        System.out.println();

        OffsetDateTime offsetDateTime3 = OffsetDateTime.of(now,manausOffset);
        System.out.println(offsetDateTime3);
        System.out.println();

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDateTime.now());
        JapaneseDate japaneseDate2 = JapaneseDate.from(LocalDate.of(1900,Month.JANUARY, 11));
        System.out.println(japaneseDate);
        System.out.println(japaneseDate2);
    }
}
