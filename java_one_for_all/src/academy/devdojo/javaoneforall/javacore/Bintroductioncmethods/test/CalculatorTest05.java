package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain.Calculator;

public class CalculatorTest05 {
    public static void main(String... args) {
        Calculator calculator = new Calculator();
        int[] numbers = { 1, 2, 3, 4, 7, 8 };
        // calculator.sumArray({1,2,3}); we cannot sending an array like this
        // calculator.sumArray(int[] {1, 2, 3, 4, 7, 8}) we are sending an array like
        // this
        calculator.sumArray(numbers);
        calculator.sumVarArgs(1, 2, 3, 4, 7, 8);
        // passing arguments in which methods that receive varArgs
        // these arguments is going to be transformed
        // in Arrays, what's means that we can sending
        // whatever quantidy of the arguments inside parenthesis
    }
}
