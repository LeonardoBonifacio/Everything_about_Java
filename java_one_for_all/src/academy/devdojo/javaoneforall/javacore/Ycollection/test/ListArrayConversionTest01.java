package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> numbersList01 = new ArrayList<>();
        numbersList01.add(1);
        numbersList01.add(2);
        numbersList01.add(3);
        // List to array
        Integer[] numbersArray01 = numbersList01.toArray(new Integer[0]);// always pass the type of the array with size
                                                                         // 0
        System.out.println(numbersList01);
        System.out.println(Arrays.toString(numbersArray01));

        System.out.println("-------------------");

        // Array to list
        Integer[] numbersArray02 = { 1, 2, 3 };
        // be carefull because this method asList() transform the array and the list
        // which he create in one linkedConnection, basically every change that you made
        // in one array or list, is going to affect also the other
        // and this new list created by the method asList() doesn't accept more some
        // List methods, like add()
        List<Integer> numbersList02 = Arrays.asList(numbersArray02);
        numbersList02.set(0, 12);
        System.out.println(Arrays.toString(numbersArray02));
        System.out.println(numbersList02);

        System.out.println("----------------");

        // if i want to copy this entire new arrayList in a reference variable which
        // allow me to do the same things than one arrayList default(like use method
        // add, and no more be linked)
        // all i have to do is created a new reference variable passing this entire
        // conversion of array to list in the constructor of my new ArrayList
        List<Integer> numbersList03 = new ArrayList<>(Arrays.asList(numbersArray02));
        numbersList03.add(19);
        System.out.println(numbersList03);

        System.out.println("--------------");

        // i can also passing in the arguments several values that will going to be
        // storaged and one array

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 7);
        List<String> strings = Arrays.asList("1", "2", "3", "4");
        // but this new list also cannot use some methods available em List interface, like add()
        List<String> strings2 = List.of("1", "2","3");
        // strings2.add("3");// this raise UnsupportedOperationException
        System.out.println(strings2);
    }
}
