package academy.devdojo.javaoneforall.javacore.Sformatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println();
        System.out.println(s1);
        System.out.println();

        System.out.println(s2);
        System.out.println();

        System.out.println(s3);
        System.out.println();

        LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2021-02-19+07:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println();

        System.out.println(parse2);
        System.out.println();

        System.out.println(parse3);
        System.out.println();

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        System.out.println();

        LocalDateTime parse4 = LocalDateTime.parse("2024-01-17T14:01:14.3379212");
        System.out.println(parse4);
        System.out.println();

        // dd/MM//yyyy, MM/dd/yyyy, yyyy/MM/dd
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        System.out.println();
        
        LocalDate parseBR =LocalDate.parse("17/01/2024", formatterBR);
        System.out.println(parseBR);
        System.out.println();

        DateTimeFormatter formatterIT = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.ITALY);
        String formatIT = LocalDate.now().format(formatterIT);
        System.out.println(formatIT);
        System.out.println();

        LocalDate parseIT = LocalDate.parse("17.gennaio.2024",formatterIT);
        System.out.println(parseIT);
    }
}
