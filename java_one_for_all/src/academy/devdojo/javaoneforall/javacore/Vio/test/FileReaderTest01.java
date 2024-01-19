package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {// try with resources always close the object witch implements closeable
            //int value = fr.read();// return the value of the first letter find out in the file
            //System.out.println(value);

            // char[] in = new char[200];// put the number of the character which possible exist in your file
            //                           // so that java put all the letter which he find in this array of char
            // int read = fr.read(in);
            // for (char c : in) {
            //     System.out.print(c);
            // }

            int i;// auxiliar variable
            // method read of fileReader(Return The character read, or -1 if the end of the stream has been reached)
            while ((i = fr.read()) != -1) {// this way you get back the decimal values
                System.out.print((char) i);// casting for get the character instead the decimal values
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
