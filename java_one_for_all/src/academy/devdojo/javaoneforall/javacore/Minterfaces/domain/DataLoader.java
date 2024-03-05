package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

// we use the keyword interface instead of 'class'
// you (like abstract class) also cannot create instance of interfaces
public interface DataLoader {
    // all the attributes inside interface are public, static and final by default
    public static final int MAX_DATA_SIZE = 10;// like this

    // the purpose of the interfaces(type special of the class in the end) is to be
    // implemented not extended like class and subclasses
    // by default all the methods that you written in a Interface will be considered
    // public and abstract
    // this means that we can only must provide for the method which type of return
    // is going to have and your name
    // and when you are overriding one method of one interface you cannot change the
    // access modifier this method
    // this cannot be more restrictive(like access modifier package(default) or
    // proctected access modifier)
    // order the restriction in access modifier(more to less restrictive):
    // private -> default(package access modfier) -> proctected -> public
    // when in inherited a method from a SuperClass you can overriding in a SubClass
    // and always makes this method less restrictive, but you cannot make it more
    // restrictive
    void load();// every method is public and abstract

    // until java 8 all the methods inside in one interface must be abstract
    // and this kind put a huge break or a huge wall into developement at the
    // languege itself
    // because if i put one another method(by default abstract) inside my interface,
    // all the class which implement this inferface must be overriden and implement
    // this method
    // now imagine add another method inside for example, interface Collections,
    // where more than 50 billions of jvm are in constant use of this Interface
    // and when i put another method all the Class which are implement this
    // interface will going to raise
    // a compilation error
    // now how can they(developers) provide you with new methods that will improve
    // the functionality of the Collection? 
    // to avoid that problem and without break the entire core of the java language,
    // they decide to provide one extra way to do this methods in java, through the
    // keyword default
    // when you have this keyword default it means that your method can have
    // implementations and all the class that are implementing this Interface(in this
    // case here DataLoader and method checkPermission), will not have to do it, it
    // will be optional(because default keyword automatically transfer the method for
    // all classes that may implementing this, like inheritance, if the Classes want
    // to override and implement and add your own way they can do, but it's not
    // mandatory)
    
    // it's transformer in a concrete method(public) that can be implement and
    // overriding or not
    public default void checkPermission() {
        System.out.println("Cheking implementation general ");
    }
    // all the classes(DataBaseLoader and FileLoader) which are implementing this
    // interface(DataLoader) will have this check permission by default, and they
    // can be overrinding and implement it if they want in our own way

    // after java 8 we can have static methods inside our interface
    public static void retrieveMaxDataSize() {
        System.out.println("Inside retrieveMaxDataSize in the Interface DataLoader");
    }
    // just to remember Static methods cannot be overridden

}
