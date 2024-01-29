package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(4);
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);

        // Always before calling the method binarySearch of Collections make sure that
        // this list is already sorted
        // (-(insert point) -1)
        // index 0,1,2,3
        // value 0,2,3,4
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 2));// this is going to return the index of where this number is placed, if the
                                             // number are in the list
        System.out.println(Collections.binarySearch(numbers, 0));
        System.out.println(Collections.binarySearch(numbers, -1));// if the value isn't in the list this return -1
        System.out.println(Collections.binarySearch(numbers, -20));
    }
}
