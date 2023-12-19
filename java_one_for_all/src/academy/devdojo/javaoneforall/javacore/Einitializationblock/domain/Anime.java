package academy.devdojo.javaoneforall.javacore.Einitializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;

    // order which jvm follow
    // 1 - Memory allocated for the object
    // 2 - Each class attribute is initialized
    // 3 - Init block is executed
    // 4 - The constructor is executed

    // initizalization blocks always will being executed , the initialization block is like a constructor which ever is call
    // your syntax is write bellow

    {
        // this is a initialization block
        // every time an object is created this piece of block will run
        // and it will run before of any constructor
        // doesn't matter the position of this init block it will be executed first every time that one object is created
        System.out.println("Inside init block");
        this.episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }

        // one convention that the initialization block must be after the atributes must of the time you are using to initialize them or/and before the constructor
        // because it will be executed for all constructors
    }

    public Anime(String name){
        System.out.println("Inside constructor of one parameter");
        this.name = name;
    }
    // have more than one constructor sometimes can be confused if anything of the variables of the class/object was initialize or not
    public Anime() {
        System.out.println("Inside the constructor of the episodes initialization");
        this.episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
        for (int episode : episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public int[] getEpisodes() {
        return this.episodes;
    }

    public String getName() {
        return this.name;
    }
}
