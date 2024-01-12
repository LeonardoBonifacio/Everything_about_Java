package academy.devdojo.javaoneforall.projects.generator.password.domain;

import java.util.Scanner;
import java.lang.Math;

public class Generator {
    Alphabet alphabet;
    public static Scanner keyboard;

    public Generator(Scanner scanner) {
        this.keyboard = scanner;
    }

    public Generator(boolean IncludeUpper, boolean IncludeLower, boolean IncludeNum, boolean includeSym) {
        alphabet = new Alphabet(IncludeUpper, IncludeLower, IncludeNum, includeSym);
    }

    public void mainLoop() {
        System.out.println("Welcome to Leos Password Services :)");
        printMenu();

        String userOption = "-1";

        while (!userOption.equals("4")) {

            userOption = keyboard.next();

            switch (userOption) {
                case "1":
                    requestPassword();
                    printMenu();
                    break;
                case "2":
                    checkPassword();
                    printMenu();
                    break;
                case "3":
                    printUseFulInfo();
                    printMenu();
                    break;
                case "4":
                    printQuitMessage();
                    break;
                default:
                    System.out.println();
                    System.out.println("Kindly select one of the available commands");
                    printMenu();
            }
        }
    }

    private Password GeneratePassword(int lenght) {
        final StringBuilder password = new StringBuilder("");

        final int alphabetLenght = alphabet.getAlphabet().length();

        int max = alphabetLenght - 1;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < lenght; i++) {
            int index = (int) (Math.random() * range) + min;
            password.append(alphabet.getAlphabet().charAt(index));
        }

        return new Password(password.toString());
    }

    public void printUseFulInfo() {
        System.out.println();
        System.out.println("Use a minimum password lenght of 8 or more characters if permitted");
        System.out.println("Include lowercase and uppercase alphabetic characters, numbers and simbols if permitted");
        System.out.println("Generate password randomly where feasible");
        System.out.println(
                "Avoid using the same password twice (e.g, across multiple user accounts and/or software systems)");
        System.out.println(
                "Avoid character repetition, keyboard patterns, dictionary words, letter or number sequence, " +
                        "\nusernames, relative or pet names, romantic links(current or past) and biographical information (e.g,  ID numbers, ancestors' names or dates).");
        System.out.println(
                "Avoid using information that the use's colleagues and/or accquaintances might know to be associated with the use");
        System.out.println(
                "Do not use password which consist wholy of any simple combination of the aforementioned weak components");

    }

    public void requestPassword() {
        boolean IncludeUpper = false;
        boolean IncludeLower = false;
        boolean IncludeNum = false;
        boolean IncludeSym = false;

        boolean correctParams;

        System.out.println();
        System.out
                .println("Hello, welcome to the Password Generator :) answer the following questions by Yes or No \n");
        do {
            String input;
            correctParams = false;

            do {
                System.out.println("Do you want Lowercase letters \"abcd....\" to be used? ");
                input = keyboard.next();
                PasswordRequestError(input);
            } while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

            if (isInclude(input)) {
                IncludeLower = true;
            }

            do {
                System.out.println("Do you want Uppercase letters \"ABCD...\" to be used? ");
                input = keyboard.next();
                PasswordRequestError(input);
            } while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("not"));

            if (isInclude(input)) {
                IncludeUpper = true;
            }

            do {
                System.out.println("Do you want numbers \"1234...\" to be used? ");
                input = keyboard.next();
                PasswordRequestError(input);
            } while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

            if (isInclude(input)) {
                IncludeNum = true;
            }

            do {
                System.out.println("Do you want Symbols \"!@#$...\" to be used?");
                input = keyboard.next();
                PasswordRequestError(input);
            } while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

            if (isInclude(input)) {
                IncludeSym = true;
            }

            // No Pool Selected
            if (!IncludeUpper && !IncludeLower && !IncludeNum && !IncludeSym) {
                System.out.println(
                        "You have selected no characters to generate your password, at least one of your answers should be Yes\n");
                correctParams = true;
            }
        } while (correctParams);

        System.out.println("Great! Now enter the lenght of the password");
        int lenght = keyboard.nextInt();

        final Generator generator = new Generator(IncludeUpper, IncludeLower, IncludeNum, IncludeSym);
        final Password password = generator.GeneratePassword(lenght);

        System.err.println("Your generated password -> " + password);
    }

    private boolean isInclude(String input) {
        if (input.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }

    private void PasswordRequestError(String string) {
        if (!string.equalsIgnoreCase("yes") && !string.equalsIgnoreCase("no")) {
            System.out.println("You have entered something incorrect let's go over it again \n");
        }
    }

    private void checkPassword() {
        String input;

        System.out.println("\nEnter your password: ");
        input = keyboard.next();

        final Password password = new Password(input);

        System.out.println(password.calculateScore());
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Enter 1 - Password Generator");
        System.out.println("Enter 2 - Password Strength Check");
        System.out.println("Enter 3 - Useful information");
        System.out.println("Enter 4 - Quit");
        System.out.print("Choise: ");
    }

    private void printQuitMessage() {
        System.out.println("Closing the program bye bye");
    }
}
