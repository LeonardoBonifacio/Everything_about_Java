package academy.devdojo.javaoneforall.introduction.exercises;

import java.security.SecureRandom;

public class Testes {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        int number =  -2 + (secureRandom.nextInt(2) + 1);
        System.out.println(number);
    }
}
