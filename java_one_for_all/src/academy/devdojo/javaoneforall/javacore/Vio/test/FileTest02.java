package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;


public class FileTest02 {
    public static void main(String[] args) throws IOException{
        File fileFolder = new File("folder");
        boolean isFolderCreated = fileFolder.mkdir();
        System.out.println("IsFolderCreated: " + isFolderCreated);

        // two ways to create one file into a folder
        // first way passing the absolute path in the constructor of the file, with the name of the file in the end
        // second way is using another file to represent the directory(folder)
        File file = new File(fileFolder,"file.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("IsFileCreated: " + isFileCreated);

        // Renaming files
        // if i don't put the same directory/folder which my file yet not renaming is in the new object with the renaming flle
        // the new rename file will going to be created outside the folder that he was
        File fileRenamed = new File(fileFolder,"file_renamed.txt");
        boolean isFileRenamed = file.renameTo(fileRenamed);
        System.out.println("IsFileRenamed: " + isFileRenamed);
        // always make sure that the names of your files and directorys/folder don't are the same

        // Renaming Directorys
        File fileFolderRenamed = new File("folder2");
        boolean isFolderRenamed = fileFolder.renameTo(fileFolderRenamed);
        System.out.println("IsFolderRenamed " + isFolderRenamed);
    }
}
