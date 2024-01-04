package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

import java.util.List;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        // Error is not a exception(but is a subclass of Throwable like Exception)
        // checked and unchecked exceptions

        // all the exceptions that are directly under Class Exception they are what we
        // call checked exceptions(Inclusive the Class Exception itself)
        // checked exceptions is a exception that if you not do something(treat, try
        // catch) your code will not compile(because you should be take measures for
        // this exception), like IOException(create files, errors in paths, etc.)

        // And Unchecked Exceptions are exceptions that are under or it is a RunTimeException
        // RunTimeException are unchecked exceptions
        // Most of the time Unchecked Exceptions is a programmer developer's problem
        // like calling a method of reference variable that doee have any object being referenced
        // or NumberFormatException when you try do change a string to a number
        // Basically all this problems could be avoided if you as developer took the right measures

        // NullPointerExcepetion
        // Object object = null;
        // System.out.println(object.toString());

        // ArrayIndexOutOfBoundsException
        // int[] nums = {1,2};
        // System.out.println(nums[3]);

        //                        Class Throwable
        //        Class Error-----^              ^-----Class Exception
        //                          RunTimeException----^         |
        //        UncheckedExceptions---^                         ^-- CheckedExceptions
    }
}
