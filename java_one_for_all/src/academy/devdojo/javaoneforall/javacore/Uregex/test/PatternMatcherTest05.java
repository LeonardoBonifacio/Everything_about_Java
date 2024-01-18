package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // For some consults and for better visualization before you use the regex expressions in java visit the site
        // regexr.com
        // and use the text and create there the regex expression that you will use in java
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
        // () -> group some character tha i want to find
        // | basicaly this OR this
        // person(a|s) ->  returns   persons or persona 
        // $ represents the end of the line
        // . you can replace everything by . in a regular expression
        // like 3.2 can be 312 or 392 or 3@2 or 3 2 or 3_2 or 3#2 or 3[2
        // if you want to find one . in a expression you must use the escape character \\. like this
        // ^ it's use for negation of character like
        // if i want to search any word without the letter '' in this letter
        // i will put in my reger ^a
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@gmail.br, test@gmail.com.br, sakura@mail"; 
        // String has a method matches for validade if one string matches with one regular expression
        // this method is very usefull for validation of emails for example
        System.out.println("zoro@gmail.br".matches(regex));
        System.out.println();
        String[] emails = text.split(",");
        for (String email : emails) {
            if (email.strip().matches(regex)) {
                System.out.println("Email is valid -> " + email);
            }
            else{
                System.out.println("Email isn't valid -> " + email);
            }
        }
        System.out.println();
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
