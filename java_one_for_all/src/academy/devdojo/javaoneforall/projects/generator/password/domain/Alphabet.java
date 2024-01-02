package academy.devdojo.javaoneforall.projects.generator.password.domain;

public class Alphabet {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "1234567890";
    public static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";

    private final StringBuilder pool;

    public Alphabet(boolean uppercaseInclued, boolean lowercaseInclued, boolean numbersInclued,
            boolean specialCharactersInclued) {
        pool = new StringBuilder();
        if (uppercaseInclued) {
            pool.append(UPPERCASE_LETTERS);
        }
        if (lowercaseInclued) {
            pool.append(LOWERCASE_LETTERS);
        }
        if (numbersInclued) {
            pool.append(NUMBERS);
        }
        if (specialCharactersInclued) {
            pool.append(SYMBOLS);
        }
    }

    public String getAlphabet(){
        return pool.toString();
    }
}
