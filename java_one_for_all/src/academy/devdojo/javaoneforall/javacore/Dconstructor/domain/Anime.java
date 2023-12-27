package academy.devdojo.javaoneforall.javacore.Dconstructor.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;
    private String studio;

    // this under is how we overloading constructor, but there are little rules
    // first rule: you can never use 'this()' outside of the constructor body
    // second rule: it must be the first statement in a body of the constructor

    // syntax of constructor is only the access modifier and the name of the class
    // even though you don't write a constructor the compiler add a constructor for
    // you(one with no parameters)
    public Anime(String name, String type, String status, int episodes) {
        // constructor methods has nothing to return
        // beacuse the only purpose of he is initialize
        // or constructing an object
        // the constructor is execute before any method
        // if i put parameters in the constructor they have to be passed
        // most used way to use the constructor is already create objects with some
        // atributes, which means that once you start creating a object of one class
        // this objects must have this atribute put inside the parenthesis of the
        // constructor method
        // this() <- under is must be never used outside of the constructor body
        this();// this a call to another constructor inside this constructor, and call
               // constructor must be the first thing that you put in your constructor
        System.out.println("Inside four args constructor");
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.status = status;
        // every time the object anime is created i will need name type episodes and
        // status or at least i will need a String, String, String and int
        // the defaul constructor present in every class is overloading after we write
        // our constructor
        // one problem with constructor is every time that we want to create an anime we
        // need to send all the data, but sometimes we don't have the data at hand
        // thus it's good create two constructor overloading yourselfs
    }

    public Anime(String name, String type, String status, String studio, int episodes) {
        this(name, type, status, episodes);
        System.out.println("Inside five args constructor");
        this.studio = studio;
    }

    public Anime() {// this constructor allow create a new object without passing any data,
                    // because we cannnot have the data at once in our hands
        System.out.println("Inside none args constructor");
    }

    public void print() {
        // this(); you will never use it like this
        System.out.println("This Anime name is: " + this.name);
        System.out.println("This Anime type is: " + this.type);
        System.out.println("This Anime episode is: " + this.episodes);
        System.out.println("The Anime status is: " + this.status);
        System.out.println("The Anime studio is: " + this.studio);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStudio() {
        return this.studio;
    }
}
