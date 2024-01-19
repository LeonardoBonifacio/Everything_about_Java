package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // the BuffereWritter basicaly increase the performance writing files and he already has a method for jumping a line
        // without depends of the \n(which act normally only in windows)
        try (FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw)) {// the bufferWriter wrap the fileWritter and increase the
                                                             // performance in write directly in your disk
            bw.write("This is a message from Leonardo for you <3");
            bw.newLine();
            bw.write("This is a new nice line");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
