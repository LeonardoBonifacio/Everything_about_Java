package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab"; // pattern to search
        String regex2 = "aba"; // pattern to search
        String text = "abaaba"; // text to search patterns
        String text2 = "abababa"; // text to search patterns
        Pattern pattern = Pattern.compile(regex2); // compile the pattern
        Matcher matcher = pattern.matcher(text2); // applying the pattern into the text in a matcher
        System.out.println("Text:  " + text2);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex2);
        System.out.print("Positions found: ");
        while (matcher.find()) {// while the matcher finds the pattern in the text
            System.out.print(matcher.start() + " ");// display the index of each regex find in the text,ignoring others
                                                    // regex already find out
        }
    }
}
