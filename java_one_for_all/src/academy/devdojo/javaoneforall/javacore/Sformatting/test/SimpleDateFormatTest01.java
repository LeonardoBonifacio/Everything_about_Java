package academy.devdojo.javaoneforall.javacore.Sformatting.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern2 = "'Brasil' dd 'dos' MM 'de' YYYY";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println("------------------------");
        try {
            System.out.println(simpleDateFormat.parse("2024.01.15 AD at 13:50:09 BRT"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
