package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

public class SetTest01 {
    public static void main(String[] args) {
        // Set is like in math, not accept duplications(set use equals and hashcode to verify this)
        // hashSet use the hash code to have all the elements inside sorted
        // Set has not index(like a normal array or ArrayList), so we have to iterate over it with for each
        // and not keep the order of the inserction
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99, 5));
        mangas.add(new Manga(1L, "Berserk", 29.99, 0));
        mangas.add(new Manga(2L, "Attack on titan", 39.99, 0));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 8));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------");

        // for keep the order of inserction you have to use LinkedHashSet
        Set<Manga> mangas2 = new LinkedHashSet<>();
        mangas2.add(new Manga(5L, "Pokemon", 19.99, 0));
        mangas2.add(new Manga(3L, "Hellsing ultimate", 59.99, 5));
        mangas2.add(new Manga(1L, "Berserk", 29.99, 0));
        mangas2.add(new Manga(2L, "Attack on titan", 39.99, 0));
        mangas2.add(new Manga(4L, "Dragon Ball Z", 89.99, 8));

        for (Manga manga : mangas2) {
            System.out.println(manga);
        }
    }
}
