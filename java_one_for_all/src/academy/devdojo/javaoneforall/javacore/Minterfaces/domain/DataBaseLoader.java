package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

// DataBaseLoader will provide implementation for the Interface(DataLoader) and for DataRemover
// unlike inheritance and extend class(where you can only have one inheritence for each class)
// for interfaces you can do several implementations
public class DataBaseLoader implements DataLoader, DataRemover {
    // if i put one abstract class to provide implementation for one interface, the
    // abstract class itself don't must provide implementation
    // but the SubClasses(which are concrete) of this abstract class must provide implementation

    @Override
    public void load() {
        System.out.println("Loading Data from DataBase");
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
