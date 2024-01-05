package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RunTimeExceptionTest02 {
    public static void main(String[] args){  //throws IOException
        System.out.println(division(3,0));

        System.out.println("Finished the successfully");
        // always try to handle as much as possible the exceptions in your code, before to throw one exception
    }


    /**
     * 
     * @param a
     * @param b cannot be 0
     * @return
     * @throws IllegalArgumentException if b is 0
     */
    private static int division(int a , int b){// throws IOException
        // the throws keyword must be used for checked exceptions is most of the cases
        // she throw one Excpetion for the method who is calling this method here(in this case main() method)
        // if we want that main() method not worry of handle this excpetion, we can put the same keyword and the same throw
        // like this we can do not worry for put one block of try catch
        // in the main() method , passing a responsability of handle this exception for who's calling the main method
        // but if anyone is calling main your program will go crash
        if (b == 0) {
            // this throw is most used for unchecked exception
            // it throw one exception with one informational message in parameters
            throw new IllegalArgumentException("The second parameter can't be zero");
        }
        return a/b;

        // try {
        //     return a/b;
        // } catch (ArithmeticException e) {
        //     e.printStackTrace();
        // }
        // return 0;
    }
}
