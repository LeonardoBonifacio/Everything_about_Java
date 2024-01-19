package academy.devdojo.javaoneforall.javacore.Uregex.test;


public class ScannerTest01 {
    public static void main(String[] args) {
        // Tokens and delimiters
        String text = "Levi1Eren2Mikasa"; // this three names are my tokens
        String[] names = text.split("\\d"); // this "\\d" is my delimiter for this text be separating 
                                                // in this three names, the delimiter can be anything
        for (String name : names) {
            System.out.println(name.strip());
        }
    }
}
