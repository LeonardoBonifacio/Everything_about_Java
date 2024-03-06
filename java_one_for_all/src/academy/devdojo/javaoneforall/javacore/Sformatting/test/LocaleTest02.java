package academy.devdojo.javaoneforall.javacore.Sformatting.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());// return the language in use in the currently operation system

        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        
        System.out.println();
        
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }

        System.out.println();
        System.out.println();
        
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }



    }
}
