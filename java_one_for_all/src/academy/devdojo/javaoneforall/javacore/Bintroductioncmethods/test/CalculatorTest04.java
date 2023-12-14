package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); 
        int number1 = 1;
        int number2 = 2;

        calculator.changeTwoNumbers(number1, number2);
        // Everytime you send a primitive type as an argument you are actually sending a copy of its value, you never send a reference to that variable
        // Scope Global/local of method main
        // in each Scope we have diference spaces in memory for each variable, which not affect each other
        System.out.println("Inside CalculatorTest04");
        System.out.println("Num 1: " + number1);
        System.out.println("Num 2: " + number2);

    }
}
