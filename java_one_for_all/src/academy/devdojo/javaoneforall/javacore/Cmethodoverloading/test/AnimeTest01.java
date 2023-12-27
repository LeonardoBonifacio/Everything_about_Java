package academy.devdojo.javaoneforall.javacore.Cmethodoverloading.test;

import academy.devdojo.javaoneforall.javacore.Cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akuma Drive", "TV", "Finished", 12);
        // method constructor or initializer(overloading) not obrigatory
        // when we done methods overloading we let the jvm choose the method based in
        // which or how parameters we are going to passing
        // for the method
        anime.print();
    }
}
