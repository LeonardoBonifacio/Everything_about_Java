package academy.devdojo.javaoneforall.javacore.Oexception.exception.domain;

import java.io.Closeable;

public class Reader2 implements Closeable {
    public void close() throws java.io.IOException {
        System.out.println("Closing Reader 2");
    };
}
