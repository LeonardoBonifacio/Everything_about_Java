package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // Metacharacters
        // \d - All the digits 0-9
        // \D - Everything that is not \d (which means everything that is not a digit character)
        // \s - all the blank spaces like \t \r \f \n
        // \S - everything that is no \s (which means everything that is no a space)
        // \w - all the letters(a-z, A-Z) and digits(0-9) and underscore(_)
        // \W - everything that is not \w (letters, digits and _ )
        String regex = "\\W"; 
        String text = "_d2\t23@ gm"; 
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(text); 
        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found: ");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
