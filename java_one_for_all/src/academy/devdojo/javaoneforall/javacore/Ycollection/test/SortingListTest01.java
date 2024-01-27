package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListTest01 {
    public static void main(String[] args) {
        // For more information about sorting algorithmn visit www.bigocheatsheet.com
        List<String> mangas = new ArrayList<>();

        mangas.add("Hellsing ultimate");
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Dragon ball Z");
        // Collections is a utility class, which cannot be instantiated and all of your methods are statics
        System.out.println(mangas);
        Collections.sort(mangas); // this method return the list sorted in the same space in memory
        System.out.println(mangas);


        List<Double> doubleValues = new ArrayList<>();
        doubleValues.add(110.21);
        doubleValues.add(21.21);
        doubleValues.add(23.098);
        doubleValues.add(98.91);
        System.out.println(doubleValues);
        Collections.sort(doubleValues);
        System.out.println(doubleValues);
    }
}
