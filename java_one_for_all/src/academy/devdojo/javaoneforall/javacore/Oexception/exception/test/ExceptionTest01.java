package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;


public class ExceptionTest01 {
    public static void main(String[] args) {
        customFileCreator();
    }

    private static void customFileCreator() {
        // this method will cause a compilation error because it can be throws a
        // IOException
        // and then it must be handled with try catch
        // and when you have this situation when the compiler(jvm) dont let you execute
        // the code until you handle
        // your code to treat the exceptions, here you have what we call as Checked
        // Exceptions
        File file = new File("C:\\Users\\bonil\\Desktop\\JAVA\\java_one_for_all\\folder\\teste.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File Created - > " + isCreated);
        } catch (IOException ex) {
            // here we must create one reference variable of the same type to Exception
            // and you only must put here Exceptions which the jvm tell you that this method
            // can be
            // throws this exception
            // if you put one Exception that the try block might not raise, it will going to
            // return a compilation error
            // or you can simply put the form more generic of exception(the class Exception
            // itself, because the Class Exception is a SuperClass of all checked
            // Exceptions)
            // the best practice is always have specific exceptions in your catch

            // for know where is the problem we should print the entire stackTrace of this
            // Exception and program and found it where is the error
            // it is going to back at the all caller of this method(which raised error), and
            // search if in somewhere there one try or something that handle it
            // if it go back to the main method(and he not handle this error), the entire
            // program go crash

            // always show in your terminal the StackTrace to make that you going to be able to fix the problem
            ex.printStackTrace();// this method is void, then we don't put he inside of the println
            // for example if the path is wrong , then the printStackTrace will going to
            // print in the terminal
            // java.io.IOException: The system cannot find the path specified
            // at java.base/java.io.WinNTFileSystem.createFileExclusively0(Native Method)
            // at
            // java.base/java.io.WinNTFileSystem.createFileExclusively(WinNTFileSystem.java:536)
            // at java.base/java.io.File.createNewFile(File.java:1045)
            // at
            // academy.devdojo.javaoneforall.javacore.Oexception.exception.test.ExceptionTest01.customFileCreator(ExceptionTest01.java:21)
            // at
            // academy.devdojo.javaoneforall.javacore.Oexception.exception.test.ExceptionTest01.main(ExceptionTest01.java:8)

            // is the entire StackTrace of this Exception
            // read the entire Exception and try to figure out how to resolve that,
            // searching in the google for example, BE PROACTIVE AND JUST READ THE EXCEPTION
            // read always to bottom to up
        }
        // handle exceptions with try catch allow our code not crash and continues after the exception itself
        System.out.println("Outside custom file creator");
    }

}
