package academy.devdojo.javaoneforall.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        // main method call recursion method(which call itself until it will blow the
        // memory, causing the StackOverFlowError)
        // the jvm call the method recursion over and over again and at some point in
        // time the memory is not enought in the stack of methods, which raise the StackOverFlowError
        recursion();
    }

    public static void recursion() {
        // one method which call itself
        recursion();
    }
}
