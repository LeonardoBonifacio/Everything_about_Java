package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // creating a variable which storaged the return of our method
        // notice that the variable must be the same type of method is going to return
        double result = calculator.divideTwoNumbers(10, 2);
        System.out.println(result);
        System.out.println(calculator.divideTwoNumbers(10, 2));

        //System.out.println(calculator.printTwoNumbersDivided(10, 2));
        // you cannot have void methods inside the println
        System.out.println("------------------------------");
        calculator.printTwoNumbersDivided(10, 0);
    }
}
