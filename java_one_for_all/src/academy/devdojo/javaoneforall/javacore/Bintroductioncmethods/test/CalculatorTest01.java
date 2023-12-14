package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        // creating an object of my class Calculator
        Calculator calculator = new Calculator();
        
        // call one method of my objetc
        calculator.sumTwoNumbers(); // methods have () and atribute don't have ()
        System.out.println("---");
        calculator.subtractTwoNumbers();
        System.out.println("---");
    }
}
