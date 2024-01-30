package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

public class IteratorTest01 {
    public static void main(String[] args) {
        // LinkedList is a list in that each value/object knows the position of the next
        // and for the previous field
        // and as we are working with removing elements, linkedList shows itself as
        // better option for work
        // every Choose as better as possible the type of list that you are going to
        // work based on which type of things you are going to do with they
        // always visit www.bigocheatsheet.com for more information
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99, 5));
        mangas.add(new Manga(1L, "Berserk", 29.99, 0));
        mangas.add(new Manga(2L, "Attack on titan", 39.99, 0));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 8));

        // iterator basicaly is used for safe remove objects or values in yours list
        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {// return true if has next item
            Manga manga = mangaIterator.next();// get the currenty item in the iterator
            if (manga.getQuantity() == 0)
                mangaIterator.remove();
        }

        // we can do all this in functional programing, take a look how its like
        mangas.removeIf(manga -> manga.getQuantity() == 0);
        // this method removeIf behind the scene is already using iterator, and its also
        // using Predicate for evaluating the condition for removing
        System.out.println(mangas);
    }
}
