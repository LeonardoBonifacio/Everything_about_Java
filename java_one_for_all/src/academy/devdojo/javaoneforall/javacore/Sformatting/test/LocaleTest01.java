package academy.devdojo.javaoneforall.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // ISO 639, ISO 3166
        // pt-BR, pt-PT
        Locale localeItaly = Locale.ITALY;
        Locale localeUK = Locale.UK;
        Locale localeIndia = Locale.TAIWAN;
        Locale localeJapan = Locale.JAPAN;
        Locale localeKO = Locale.KOREA;

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeUK);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeKO);

        System.out.println(df1.format(calendar.getTime()) + " Country and Language " + localeItaly.getCountry() + " " + localeItaly.getLanguage());
        System.out.println(df2.format(calendar.getTime()) + " Country and Language " + localeUK.getCountry() + " " + localeUK.getLanguage());
        System.out.println(df3.format(calendar.getTime()) + " Country and Language " + localeIndia.getCountry() + " " + localeIndia.getLanguage());
        System.out.println(df4.format(calendar.getTime()) + " Country and Language " + localeJapan.getCountry() + " " + localeJapan.getLanguage());
        System.out.println(df5.format(calendar.getTime()) + " Country and Language " + localeKO.getCountry() + " " + localeKO.getLanguage());
    }
}
