package academy.devdojo.javaoneforall.javacore.Minterfaces.test;

import academy.devdojo.javaoneforall.javacore.Minterfaces.domain.DataBaseLoader;
import academy.devdojo.javaoneforall.javacore.Minterfaces.domain.DataLoader;
import academy.devdojo.javaoneforall.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        System.out.println();

        dataBaseLoader.remove();
        fileLoader.remove();

        System.out.println();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        System.out.println();

        // here are two diffrent methods with the same name, and they are statics and
        // was created inside Interface DataLoader, and as he is static we cannot
        // overridden(like a final method itself) it inside DataBaseLoader
        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
