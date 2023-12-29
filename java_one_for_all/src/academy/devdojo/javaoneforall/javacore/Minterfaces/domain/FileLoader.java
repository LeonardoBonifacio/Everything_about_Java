package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from FileLoader");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from FileLoader");
    }

    @Override
    public void checkPermission() {
        System.out.println("Cheking permission in the FileLoader");
    }

}
