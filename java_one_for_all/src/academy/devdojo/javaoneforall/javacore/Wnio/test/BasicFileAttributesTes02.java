package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTes02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder2/new.txt");
        // only read
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        System.out.println("Creation Time " + creationTime);
        System.out.println("Last Modified Time " + lastModifiedTime);
        System.out.println("Last Access time " + lastAccessTime);
        System.out.println("--------------------------------------------");
        
        // can change things
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newLastAccess = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(null, newLastAccess, null);
        
        // rereading the data
        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("Creation Time " + creationTime);
        System.out.println("Last Modified Time " + lastModifiedTime);
        System.out.println("Last Access time " + lastAccessTime);

    }
}
