package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("IsCreated: " + isCreated);
            boolean exists = file.exists();
            System.out.println("File exists? " + exists);

            System.out.println("Path: " + file.getPath());// name that you give in the creation of the object file
            System.out.println("Absolute Path: " + file.getAbsolutePath());// where the file is located in your computer

            System.out.println("IsFile: " + file.isFile());
            System.out.println("IsDirectory: " + file.isDirectory());
            System.out.println("IsHidden: " + file.isHidden());
            System.out.println("Last modified: " +  new Date(file.lastModified()));
            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            // already exist method for canRead, canWrite, canExecute


            if (exists) {
                boolean isDeleted = file.delete();// not throw exception if file already delete
                System.out.println("Was delete? " + isDeleted);
            }


        } catch (IOException e) {
            e.printStackTrace();
        };
    }
}
