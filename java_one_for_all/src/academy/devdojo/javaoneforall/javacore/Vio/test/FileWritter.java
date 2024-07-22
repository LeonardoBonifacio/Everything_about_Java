 package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Al this classes are very cohesive and you use them with much chain
// File
// FileWritter
// FileReader
// BufferedWritter
// BufferedReader
public class FileWritter {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true)){// every class that is closeable, can be put in one try with resources
                                                   // so that this object can be automatically closed
            fw.write("This is message from Leonardo Bonifácio for you <3\nThis is a new nice line\n");
            fw.flush();// this will make sure that the stream of data will move from the buffer to your file
            // basically for not charging your memory with desnecessary bite of data
            // if i execute this same program repetidally it will going to overriden the file with other file equal, if i want to append
            // data or text in the same file when i executed more than i time, i put in the constructor of the fileWritter one true
            // so that the append goes to false to true
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
