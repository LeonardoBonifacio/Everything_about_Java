package exercises;

import java.security.SecureRandom;

public class SecureRandomNumberGeneration {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int face = 1 + randomNumbers.nextInt(6);
        int frequencyOne = 0;
        int frequencyTwo = 0;
        int frequenceThree = 0;
        int frequenceFour = 0;
        int frequenceFive = 0;
        int frequenceSix = 0;

        for (int i = 1; i <= 60; i++) {
            System.out.print(face + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
            switch (face) {
                case 1:
                    ++frequencyOne;
                    break;
                case 2:
                    ++frequencyTwo;
                    break;
                case 3:
                    ++frequenceThree;
                    break;
                case 4:
                    ++frequenceFour;
                    break;
                case 5:
                    ++frequenceFive;
                    break;
                case 6:
                    ++frequenceSix;
                    break;
            }
            face = 1 + randomNumbers.nextInt(6);

        }

        System.out.println("Number 1 occur: " + frequencyOne);
        System.out.println("Number 2 occur: " + frequencyTwo);
        System.out.println("Number 3 occur: " + frequenceThree);
        System.out.println("Number 4 occur: " + frequenceFour);
        System.out.println("Number 5 occur: " + frequenceFive);
        System.out.println("Number 6 occur: " + frequenceSix);

    }

}