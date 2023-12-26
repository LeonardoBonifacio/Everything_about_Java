package academy.devdojo.javaoneforall.javacore.Ioverriding.test;

import academy.devdojo.javaoneforall.javacore.Ioverriding.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dr: Stone");
        // every time you call a reference variable inside the print you are goingo to get a behavior of the method
        // toString()
        // public String toString() {
        //     return getClass().getName() + "@" + Integer.toHexString(hashCode());
        // }
        // getClass() return the path of the package in which the class of this object is located
        System.out.println(anime.toString());
    }
}
