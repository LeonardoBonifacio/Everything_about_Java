package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Customer;
import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

public class MapTest03 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("William Suane");
        Customer customer2 = new Customer("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Pokemon", 19.99);
        Manga manga2 = new Manga(3L, "Hellsing ultimate", 59.99);
        Manga manga3 = new Manga(1L, "Berserk", 29.99);
        Manga manga4 = new Manga(2L, "Attack on titan", 39.99);
        Manga manga5 = new Manga(4L, "Dragon Ball Z", 89.99);

        Map<Customer,List<Manga>> custumerListOfMangaMap = new HashMap<>();

        List<Manga> mangaOneToThree = new ArrayList<>();
        mangaOneToThree.add(manga1);
        mangaOneToThree.add(manga2);
        mangaOneToThree.add(manga3);

        List<Manga> mangaFourAndFive = new ArrayList<>();
        mangaFourAndFive.add(manga4);
        mangaFourAndFive.add(manga5);

        custumerListOfMangaMap.put(customer1, mangaOneToThree);
        custumerListOfMangaMap.put(customer2, mangaFourAndFive);

        for (Entry<Customer,List<Manga>> entry : custumerListOfMangaMap.entrySet()) {
            System.out.print(entry.getKey().getName() + " -> ");
            for (Manga manga : entry.getValue()) {
                System.out.print(manga.getTitle() + ", ");
            }
            System.out.println();
            
        }

        
    }
}
