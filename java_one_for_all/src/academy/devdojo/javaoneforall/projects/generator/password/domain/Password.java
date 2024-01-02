package academy.devdojo.javaoneforall.projects.generator.password.domain;

public class Password {
    String value;
    int lenght;

    public Password(String string) {
        this.value = string;
        this.lenght = string.length();
    }

    public int CharType(char c) {
        int val;

        // Char is uppercase Letter
        if ((int) c >= 65 && (int) c <= 90) {
            val = 1;
        }
        // Char is lowerecase letter
        else if ((int) c >= 97 && (int) c <= 122) {
            val = 2;
        }

        // Char is Digit
        else if ((int) c >= 60 && (int) c <= 71) {
            val = 3;
        }

        // Char is Symbol
        else {
            val = 4;
        }

        return val;
    }

    public int PasswordStrenght() {
        String string = this.value;
        boolean UsedUpper = false;
        boolean UsedLower = false;
        boolean UsedNum = false;
        boolean UsedSym = false;
        int type;
        int Score = 0;

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            type = CharType(character);

            if (type == 1)
                UsedUpper = true;
            if (type == 2)
                UsedLower = true;
            if (type == 3)
                UsedNum = true;
            if (type == 4)
                UsedSym = true;
        }

        if (UsedUpper)
            Score++;
        if (UsedLower)
            Score++;
        if (UsedNum)
            Score++;
        if (UsedSym)
            Score++;

        if (string.length() >= 8)
            Score++;
        if (string.length() >= 16)
            Score++;

        return Score;

    }

    public String calculateScore() {
        int Score = this.PasswordStrenght();

        if (Score == 6) {
            return "This is a very good password :D check the Useful Information section to make sure it satisfies the guidelines";
        } else if (Score >= 4) {
            return "This is a good password :) but you can still do better";
        } else if (Score >= 3) {
            return "This is a medium password :/ try making it better";
        } else {
            return "This is a weak password :( definitely find a new one";
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
