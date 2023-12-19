package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    // 0 - Static init block is executed when JVM loads the class and only once
    // 1 - Memory allocated
    // 2 - Each class attribute is initialized
    // 3 - Init block is executed
    // 4 - The constructor is executed
    // because this order above, we cannot access the instance variables inside the static, because the memory allocation is didn't happen yet
    // so for all the static methods and attributtes basically they exist even before the memory is allocated and if the memomry is not allocated
    // you cannot have an instance and if you don't have an instance you don't have a instance variables
    // And this is why you can never use the keyword 'this' inside static methods or static initialization blocks


    // and if we have another init block non-static he will be executed everytime that the object is created
    // but he is only executed after all the init block static has been executed
    {
        System.out.println("Inside init block non-static 1 ");
    }
    static{//static init blocks are executed only once
           // the diference between the init block static and non-static is basic the word static int he begining
           // when we do this, this block here will be executed only once , basically when the jvm is loading this Anime class 
           // it will executed all the static init blocksit has in it
           // the static modifier will tell the jvm that you should load these either attributes or methods or init blocks that are static only once
        System.out.println("Inside init block static 1 ");
        Anime.episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }
    // if we have more than one init block static they will be executed once in the order they appear
    static{
        System.out.println("Inside init block static 2 ");
    }
    
    // and if we have another init block non-static he will be executed everytime that the object is created
    // but he is only executed after all the init block static has been executed
    {
        System.out.println("Inside init block non-static 2 ");
    }

    static{
        System.out.println("Inside init block static 3 ");
    }


    public Anime(String name){
        System.out.println("Inside constructor of one parameter");
        this.name = name;
    }
    
    public Anime() {
        Anime.episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
        for (int episode : episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static int[] getEpisodes() {
        return Anime.episodes;
    }

    public String getName() {
        return this.name;
    }
}
