package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.ArrayList;// one of the class which implements List
import java.util.List;// interface

public class ListTest01 {
    public static void main(String[] args) {
        // we can pass or not which type of objects we are going to accept in our
        // List<inside here>
        // the diamond syntax <> is use to represent the generic types
        // fi you already know the capacity of you ArrayList, give this capacity into the Constructor
        List<String> names = new ArrayList<>();// since java 1.4
        // Objects from class ArrayList are resizible while the program run
        List<String> names2 = new ArrayList<>();
        names.add("Leonardo");
        names.add("Keven");
        names2.add("Bonifácio");
        names2.add("Christian");

        // get everything in list names2(from whatever position that i want) and put in names
        names.addAll(0,names2);
        // names.add(123); never do this, always make that every value inside your list
        // are the same type

        for (String name : names) {
            System.out.println(name);
        }

        names.add("Celeste");// to proof that we can resize

        System.out.println("-------------");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
            // insteado of using [i] for acces index in List , we use the method get() and pass the index as argument
            // Class list already have methods for return the lastElement in a list and the firstElement in a list
        }

        System.out.println("--------------");


        int size = names.size();

        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
            names.add("Bonifácio");// in each iteration add this name and change the size of the ArrayList names
            // but continue with only three iteration, because i storaged the default size of the arrayList in the variable size
        }

        System.out.println("---------------");
        System.out.println(names);
        System.out.println(names.remove(1));
        System.out.println(names.remove("Bonifácio"));
        System.out.println(names);

        System.out.println("--------------");

        // Not of the primitive types can be pass by the generic type in a diamond syntax in none of the collections
        // because behind the scene the collection must call the hashcode() and equals() method for yours objects
        List<Integer> numbers = new ArrayList<>();
        int num = 2;
        numbers.add(num);// this wrap the int value in a object of Integer Class
        System.out.println(numbers);



    }
}
