package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/william");// relative path which exists
        Path file = Paths.get("dev/file.txt");// relative path which not exists
        Path resolve = dir.resolve(file);// put together these two paths
        System.out.println(resolve);
        System.out.println();

        Path absolute = Paths.get("/home/william");
        Path relative = Paths.get("dev");
        Path fileRelative = Paths.get("file.txt");

        System.out.println("1 " + absolute.resolve(relative));// its works
        System.out.println("2 " + absolute.resolve(fileRelative));// its works
        System.out.println("3 " + relative.resolve(absolute));// its returns the absolute path
        System.out.println("4 " + relative.resolve(fileRelative));// its works put together the relative with the file
        System.out.println("5 " + fileRelative.resolve(absolute));// its returns the absolute path
        System.out.println("6 " + fileRelative.resolve(relative));// its works
    }
}
