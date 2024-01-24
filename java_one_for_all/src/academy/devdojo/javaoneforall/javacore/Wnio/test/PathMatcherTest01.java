package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("folder/subfolder/file.bkp");
        Path path2 = Paths.get("fodler/subfolder/file.txt");
        Path path3 = Paths.get("folder/subfolder/file.java");
        // Glob is kinda regex
        matches(path1, "glob:*.bkp");// doens't work
        matches(path2, "glob:*.txt");// doens't work
        matches(path3, "glob:*.java");// doens't work
        System.out.println();
        matches(path1, "glob:**/*.bkp");// it works
        matches(path2, "glob:**/*.txt");// it works
        matches(path3, "glob:**/*.java");// it works
        System.out.println();
        matches(path1, "glob:**/*.{bkp,java,txt}");// it works
        matches(path2, "glob:**/*.{bkp,java,txt}");// it works
        matches(path3, "glob:**/*.{bkp,java,txt}");// it works
        System.out.println();
        matches(path1, "glob:**/*.???");// true
        matches(path2, "glob:**/*.???");// true
        matches(path3, "glob:**/*.???");// false
        System.out.println();
        matches(path1, "glob:**/file.???");// true
        matches(path2, "glob:**/file.???");// true
        matches(path3, "glob:**/file.????");// true
    }

    private static void matches(Path path, String glob){
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + pathMatcher.matches(path));
    }
}
