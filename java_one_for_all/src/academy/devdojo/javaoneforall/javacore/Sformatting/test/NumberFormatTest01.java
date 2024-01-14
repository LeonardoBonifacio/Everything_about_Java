package academy.devdojo.javaoneforall.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeBR);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double value = 100_000_000.2130D;
        for (NumberFormat numberFormat : nfa) {// for each locale format this number
            System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMinimumFractionDigits(4);
            System.out.println(numberFormat.format(value));
        }

        String stringValue = "1234.1234";
        // for avoiding errors in parse method i can use the method string for remove
        // the "_" before its string is pass for the method parse
        String stringValue2 = "1_000_000".replace("_", "");
        try {
            System.out.println(nfa[0].parse(stringValue));
            System.out.println(nfa[0].parse(stringValue2));// if the parse methods finds out that ins't a number the
                                                           // parses break in this point, and if the first things they
                                                           // finds is not a number they throww a exception
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
