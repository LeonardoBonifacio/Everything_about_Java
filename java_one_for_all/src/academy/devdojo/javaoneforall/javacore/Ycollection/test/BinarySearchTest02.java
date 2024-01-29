package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Pokemon", 19.99));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99));
        mangas.add(new Manga(1L, "Berserk", 29.99));
        mangas.add(new Manga(2L, "Attack on titan", 39.99));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99));

        mangas.sort(new MangaByTitleComparator());// we are sorting out list by title

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------");

        Manga mangaToSearch = new Manga(4L, "Dragon Ball Z", 89);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));// and here our binary search is expecting
                                                                            // search in the list by price
        // for tell the binary search for search in the list with another attribute, all
        // we have to do is pass in yours arguments one comparator created by us
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, new MangaByTitleComparator()));

    }
}
