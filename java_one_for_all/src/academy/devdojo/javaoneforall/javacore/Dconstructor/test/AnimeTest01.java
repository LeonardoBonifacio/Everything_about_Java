package academy.devdojo.javaoneforall.javacore.Dconstructor.test;


import academy.devdojo.javaoneforall.javacore.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV", "Finished","Studio Gibli", 12);//Constructor method
        
        anime.print();
    }
}
