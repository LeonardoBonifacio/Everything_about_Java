package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain;

public class Calculator {
    // set one method of this class
    // syntax of methods
    // acess modifier(public, private)   which is going to return(void, primitive types and reference types) name of method(camelCase) parenthesis(){
    //} 
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers(){
        System.out.println(20 - 10);
    }

    public void multiplyTwoNumbers(int number1 , int number2){
        System.out.println(number1 * number2);
    }

    // when one method return something, we need to define which type of the something is going to return
    public double divideTwoNumbers(double number1, double number2){
        if (number2 != 0) {
            return number1 / number2;
            // after one return nothing is going to be executed anymore
        }
        return 0;
    }

    public void printTwoNumbersDivided(double number1, double number2){
        if (number2 == 0) {
            System.out.println("Can't divided by 0");
            return;
            // you can use return like a break only inside void methods, because these methods don't return nothing
            // this way to use return avoid to use one more block with else
        }
        System.out.println(number1/number2);
    }

    public void changeTwoNumbers(int nbr1, int nbr2){
        // Scope local of method changeTwoNumbers
        nbr1 = 99;
        nbr2 = 33;
        System.out.println("Inside changeTwoNumbers");
        System.out.println("Num 1: " + nbr1);
        System.out.println("Num 2: " + nbr2);
    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of the array is : " + sum);
    }

    public void sumVarArgs(double value, int...numbers){// syntax of varArgs it's basically this three points after the type of the variable
                                          // you cannot have two varArgs becuase how  would java knows when to stop and start in the next one
                                          // if you want to have multiple paramets they must be come before the varArgs parameters
                                          // like this (String date, int age, int...numbers)
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of the array is : " + sum);
    }
}
