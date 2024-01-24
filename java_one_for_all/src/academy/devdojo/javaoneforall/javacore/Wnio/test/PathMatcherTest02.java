package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTestJavaOrClass extends SimpleFileVisitor<Path>{
    private static final PathMatcher MATCHER = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (MATCHER.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}


public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("."), new FindAllTestJavaOrClass());
    }
}
