package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        customFileCreator();
    }

    // one good rule is, if your method is private it's best to yourself handle the
    // exception that it can cause
    // but if your method is public, then you can let the other who is calling your
    // method to handle that(throwing the exception who whatever is calling)
    // because they can want to do something different of you do in your way to
    // handle that Exception
    private static void customFileCreator(){ // throws IOException {
        File file = new File("C:\\Users\\LUCIANO\\Desktop\\Java\\java_one_for_all\\folder\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File Created - > " + isCreated);
        } catch (IOException ex) {
            ex.printStackTrace();
            //throw ex;
            // if you throw the exception(a checked Exception) who whatever is calling, you
            // must put the keyword throw with the type
            // of exception which you is sending beside of the final of the method(line 17)
            // but if you don't want to force who is calling this method to handle this exception
            // we can throw  a new RunTimeException avoiding to put in the final of line 17
            // one checked exception(which must be handle)
            throw new RuntimeException("Something happened when creating the file");
        }

        System.out.println("Outside custom file creator");
    }
}
