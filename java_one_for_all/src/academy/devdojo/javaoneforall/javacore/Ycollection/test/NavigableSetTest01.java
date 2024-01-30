package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;
import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Smartphone;

class SmartphoneNameComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getName().compareTo(smartphone2.getName());
    }

}

class MangaPriceComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPrice(), manga2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        // Navigable set is a set that keep the order of inserction of elements every
        // time you are inserting
        // For create one set of this navigableSet the objects of the class which you
        // are holding in this set, need to be comparable
        // but if you create the Navigable set passing one Comparator in the constructor
        // it will going to work well
        // Every time you inserting(in whatever sortedSet) objects or values in this
        // sets, the sortedSet will always do one compare the date tha you already have
        // inside that collection and will sorted the elements accordingly
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparator());
        set.add(new Smartphone("123123", "LG"));
        set.add(new Smartphone("@13", "AM"));
        System.out.println(set);
        System.out.println("-------------");

        // this TreeSet are sorted this object by price, because the override method
        // compare in Class Manga
        // an its sorting withouth pass one Comparator, because class Manga already
        // implements Comaparable
        // everything that you do with TreeSet work with the comparator that you pass in this constructor
        // or with the compareTo method that you are overriding
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(5L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99, 5));
        mangas.add(new Manga(1L, "Berserk", 29.99, 0));
        mangas.add(new Manga(2L, "Attack on titan", 39.99, 0));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 8));
        mangas.add(new Manga(10L, "Slime", 1.99, 8));
        // but be carefull because TreeSet defines if one object is equals to
        // another(duplicated are not allowed), by compare or compareTo method(which
        // both method always need to be consistent with equals method)
        // and in this case our implementation for equals method only works with id and
        // name
        // so this line under do not represent one element duplicated, because we are
        // sendind one comparator that works with price in the constructor
        mangas.add(new Manga(10L, "Slime", 2.99, 8));

        // .descendingSet() method descendingSet returns one set from the highest
        // value(based on the comparator or the compareTo method), to the lowest value

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-----------------");

        Manga yuyuhakusho = new Manga(11L, "Yuyu hakusho", 2.99, 0);
        // lower returs the immediate lower value <
        // floor returs the immediate lower or equals values <=
        // higher returns the immediate higher value >
        // ceiling returns the immediate higher or equals values >=

        System.out.println(yuyuhakusho);
        System.out.println(mangas.lower(yuyuhakusho) + "         Lower");
        System.out.println(mangas.floor(yuyuhakusho) + "         floor");
        System.out.println(mangas.higher(yuyuhakusho) + "         higher");
        System.out.println(mangas.ceiling(yuyuhakusho) + "         ceiling");

        System.out.println("-----------------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());// Retrieves and removes the first (lowest) element, or returns {@code
                                               // null} if this set is empty
        System.out.println(mangas.size());

        System.out.println("-------------------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast()); // Retrieves and removes the last (highest) element, or returns {@code
                                               // null} if this set is empty.
        System.out.println(mangas.size());

    }
}
