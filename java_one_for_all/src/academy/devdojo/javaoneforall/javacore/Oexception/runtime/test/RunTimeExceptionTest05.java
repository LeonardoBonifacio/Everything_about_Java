package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest05 {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (ArithmeticException |IllegalArgumentException |ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Inside RunTimeException ");
        }

        try {
            mayThrowException();
        } catch (SQLException  | FileNotFoundException ex) {
            System.out.println();
            // if you have exceptions that are not in the same  inheritance three they can be collapsed in one catch
            // we can have multiple exceptions in the same catch
            // it is useful beacuse we can want to do the same handle for exception which are similar
            // this rules applying only when you are not in the same inheritance three
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void mayThrowException() throws SQLException, FileNotFoundException{
        System.out.println();
    }
}
