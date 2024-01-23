package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        // Creating one date in the past
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        // Creating a new file in folder2
        File file = new File("folder2/new_file.txt");
        boolean isCreated = file.createNewFile();
        System.out.println("IsCreated: " + isCreated);
        //Change the time in the last time modified atribbute on this file with File Class
        boolean isSetLastModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println("IsSetLastModified: " + isSetLastModified);
        System.out.println();

        // Creating a new file in folder2 with Class Paths and interface Path
        Path paht = Paths.get("folder2/file_path.txt");
        if (Files.notExists(paht)) {
            Files.createFile(paht);
        }
        // Creating a filetime from the date in the past created before
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        // Set last time modified atribbute with class Files and FileTime time
        Files.setLastModifiedTime(paht, fileTime);
        System.out.println(Files.isExecutable(paht));
        System.out.println(Files.isWritable(paht));
        System.out.println(Files.isReadable(paht));
    }
}
