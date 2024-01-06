package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {// we can get as much as want catch block for how many exceptions us want handle
             // but if don't have one catch block for one specific exception that throw in
             // our program, our program will going to crash
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Inside ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Inside RunTimeException ");
            // you have to be carefull with the three of inheritance that support all the
            // exceptions and RunTimeExceptions
            // always that Exception most generic must be put in the finall of the all
            // catchs blocks
            // this Most generic Class of RunTimeExceptions(superClass) for example is going
            // to handle all the unchecked Exceptions
            // and for all other Exceptions which are heir of other exceptions must be
            // placed with carefull(always take a see of which exceptions is heir of whose
            // exception)
            // this same concept works for exceptions the type checked
        }

        try {// we must always handle of all exceptions which our method can throw separated
            // until the most generic Exception(in this case as all Exceptions are checked) the Class Exception Itself
            mayThrowException();
        } catch (SQLException e) {

        } catch (FileNotFoundException e){// for this exception we can put the most generic Exception that this is heir
                                          // in this Case IOException

        } catch (Exception e){

        }
    }

    private static void mayThrowException() throws SQLException, FileNotFoundException{
        System.out.println();
    }
}
