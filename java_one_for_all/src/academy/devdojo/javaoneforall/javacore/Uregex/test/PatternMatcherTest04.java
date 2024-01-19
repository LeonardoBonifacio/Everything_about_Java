package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // Metacharacters
        // \d - All the digits 0-9
        // \D - Everything that is not \d (which means everything that is not a digit character)
        // \S - everything that is no \s (which means everything that is no a space)
        // \s - all the blank spaces like \t \r \f \n
        // \w - all the letters(a-z, A-Z) and digits(0-9) and underscore(_)
        // \W - everything that is not \w (letters, digits and _)
        // [] - Range of characters(all characthers inside this bracket, not including both upper and lower case by default)
        // you can use a-c or A-C to set that you want ABC or abc, instead of writing the three letters abcABC

        // Quantifiers
        // ? zero or one
        // * zero or more
        // + one or more
        // {n,m} from n to m
        // () -> group some character that i want to find
        // | basicaly this OR this
        // person(a|s) ->  returns   persons or persona 
        // $ represents the end of the line
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0x 0xFFABC 0x10G 0x1"; 
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(text); 
        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found: ");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
        System.out.println();
        
    }
}
