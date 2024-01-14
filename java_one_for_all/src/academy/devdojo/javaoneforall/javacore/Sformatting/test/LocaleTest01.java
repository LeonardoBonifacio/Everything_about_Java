package academy.devdojo.javaoneforall.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // ISO 639, ISO 3166
        // pt-BR, pt-PT
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeNetherLands = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherLands);

        System.out.println(df1.format(calendar.getTime()) + " Country and Language " + localeItaly.getCountry() + " " + localeItaly.getLanguage());
        System.out.println(df2.format(calendar.getTime()) + " Country and Language " + localeCH.getCountry() + " " + localeCH.getLanguage());
        System.out.println(df3.format(calendar.getTime()) + " Country and Language " + localeIndia.getCountry() + " " + localeIndia.getLanguage());
        System.out.println(df4.format(calendar.getTime()) + " Country and Language " + localeJapan.getCountry() + " " + localeJapan.getLanguage());
        System.out.println(df5.format(calendar.getTime()) + " Country and Language " + localeNetherLands.getCountry() + " " + localeNetherLands.getLanguage());
    }
}
