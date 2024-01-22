package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        // Path is a interface
        // Paths is a class to create a object from the path
        // Files is a class which handle these two
        // not is mandatory for path to pass the whole path 
        // because the method get in Paths has var args
        Path path1 = Paths.get("C:\\Users\\LUCIANO\\Desktop\\Java\\java_one_for_all\\README.md");
        Path path2 = Paths.get("C:\\Users\\LUCIANO\\Desktop\\Java\\java_one_for_all", "README.md");
        Path path3 = Paths.get("C:", "Users\\LUCIANO\\Desktop\\Java\\java_one_for_all\\README.md");
        Path path4 = Paths.get("C:", "Users", "LUCIANO", "Desktop", "Java", "java_one_for_all" ,"README.md");
        System.out.println(path1.getFileName().toFile().toPath());
        System.out.println(path2.getFileName().toFile().toPath());
        System.out.println(path3.getFileName().toFile().toPath());
        System.out.println(path4.getFileName().toFile().toPath());
    }
}
