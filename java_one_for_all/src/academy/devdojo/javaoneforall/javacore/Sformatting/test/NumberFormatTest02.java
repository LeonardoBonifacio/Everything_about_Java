package academy.devdojo.javaoneforall.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double value = 100_000_000.2130D;
        for (NumberFormat numberFormat : nfa) {// for each locale format this number
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }

        String stringValue = "$100,000,000.21";// for the currency numbers, we must pass the exactly string which
                                              // we want to parse
        try {
            System.out.println(nfa[0].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
