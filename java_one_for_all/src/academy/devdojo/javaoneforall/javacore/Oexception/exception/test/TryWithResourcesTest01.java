package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.Reader1;
import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.Reader2;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {//throws IOException{
        try (Reader1 reader1 = new Reader1(); Reader2 reader2 = new Reader2();) { 
            // the object that you create in try with resource must be closeable
            // try with resources close this objects and resources that you create in the inverse order automatically
            // if i create in order (1,2,3) , it will going to be close in order (3,2,1)
            // the try with resources don't need to have the block catch or finally, but the method must throw the exception
            // that the try must throw
        }catch(IOException e){

        }
    }

    private static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
