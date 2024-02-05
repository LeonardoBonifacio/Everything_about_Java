package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Customer;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Generics only work at compilation time
        // Type erasure(basically you are erasing the type after you compilie this
        // codee)
        List<String> list = new ArrayList<>();
        list.add("Midorya");

        for (String string : list) {
            System.out.println(string.toString());
        }

        add(list, new Customer("Leoncio"));// we must never do things like this, because this is going to be confusing
                                           // passing one list of String for one method that adds objects in this list
                                           // that you are passing, if we use one for each we can't use the especifc
                                           // type of the elements anymore, because one Object most default(Object) gone
                                           // add

        for (Object object : list) {
            System.out.println(object);
        }

        // // before java 1.4 do not exist generics for make the especif type of your
        // // Collections
        // // and you can add everything inside one Collection without Generics
        // // but this bring one problem of desorganizeded and for each object inside
        // your
        // // collection you before need to make that this object is the object that you
        // go use
        // List list = new ArrayList<>();
        // list.add("Midorya");
        // list.add(123L);
        // list.add(new Customer("Jiraya"));

        // for (Object object : list) {
        // if (object instanceof Customer) {
        // Customer c = (Customer) object;
        // System.out.println(c);
        // }
        // }
    }

    // every time you are creating a list or collection pass the type of the
    // collection(Generics) for make sure that the objects inside this are of the
    // same type, and for avoiding some errors or headcache in the future
    public static void add(List anyList, Customer c) {
        anyList.add(c);
    }
}
