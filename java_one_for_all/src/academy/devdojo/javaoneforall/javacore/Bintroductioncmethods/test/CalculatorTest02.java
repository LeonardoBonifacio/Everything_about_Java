package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // when you passing something for your methods/functions this is known by
        // arguments
        // when you create which you're going to pass for your methods/functions this is
        // known by parameters(like when create a method)
        calculator.multiplyTwoNumbers(10, 7);
        // this function/method requires two arguments, if i don't give us it's
        // raise a compilation error
        // you can only send arguments which are the same type that your parameters
        // created, and in the same quantidity
    }
}
