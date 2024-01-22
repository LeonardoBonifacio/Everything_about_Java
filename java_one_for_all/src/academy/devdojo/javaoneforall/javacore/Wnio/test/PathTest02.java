package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args)  throws IOException{

        // Creating one directory
        Path folderPath = Paths.get("folder");
        if (Files.notExists(folderPath)) {
            folderPath = Files.createDirectory(folderPath);
        }

        // Creating directories(folder, subfolder, subsubfolder and go on)
        Path subfolderPath = Paths.get("folder/subfolder/subfolder2");
        subfolderPath = Files.createDirectories(subfolderPath);

        // Creating files
        Path filePath = Paths.get(subfolderPath.toString(), "file.txt");// same thing -> folder/subfolder/subfolder2/file.txt
        if (Files.notExists(filePath)) {
            filePath = Files.createFile(filePath);
        }

        // Copy Files
        Path source = filePath;
        Path target = Paths.get(source.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target,StandardCopyOption.REPLACE_EXISTING);
    }
}
