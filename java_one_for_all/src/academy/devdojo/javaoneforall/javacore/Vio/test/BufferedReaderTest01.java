package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)) {// same way of BufferedWriter in wrap fileWriter which wrap
                                                             // file, for increase performance
        
            // bufferedReader already have one method for read one line each time, instead for reading one char each time like fileReader
            // and its returns null when each reach the end of the file or when don't have more lines for read
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
