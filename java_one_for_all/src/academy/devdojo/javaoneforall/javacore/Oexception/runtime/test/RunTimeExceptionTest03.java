package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) { // throws IOException
        System.out.println(openConection());
    }

    private static String openConection() {
        try {// you can never write only the try, you always must have at least one catch block or at least one finally
            System.out.println("Opening Conection");
            System.out.println("Writing to the database");
            return "Connected";
        } catch (Exception e) {
            e.printStackTrace();
        } finally{// this block will going to be excecuted no matter what happens
            System.out.println("Close the conection");
            // finally is usually used when you have to close resources or you have piece of codes that must be excecuted
        }
        return "Not Connected";
    }
}
