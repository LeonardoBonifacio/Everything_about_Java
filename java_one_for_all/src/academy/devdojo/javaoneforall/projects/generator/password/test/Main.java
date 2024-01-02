package academy.devdojo.javaoneforall.projects.generator.password.test;

import java.util.Scanner;

import academy.devdojo.javaoneforall.projects.generator.password.domain.Generator;

public class Main {

    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }
}
