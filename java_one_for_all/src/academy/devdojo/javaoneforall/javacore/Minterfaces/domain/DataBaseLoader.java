package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

// DataBaseLoader will provide implementation for the Interface(DataLoader) and for DataRemover
// unlike inheritance and extend class(where you can only have one inheritence for each class)
// for interfaces you can do several implementations
public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading Data form DataBase");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from DataBase");
    }

    @Override
    public void checkPermission() {
        System.out.println("Cheking permission in DataBaseLoader");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside retrieveMaxDataSize in the Class DataBaseLoader");
    }
    // just to remember Static methods cannot be overridden

}
