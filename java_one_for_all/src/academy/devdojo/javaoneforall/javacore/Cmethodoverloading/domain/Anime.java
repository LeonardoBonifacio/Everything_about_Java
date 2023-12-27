package academy.devdojo.javaoneforall.javacore.Cmethodoverloading.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;

    public void init(String name, String type, int episodes) {
        // creating a method that act like a constructor
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    // overloading in java follow this rules you need have exactly the same name
    // letter by letter in this case 'init' and 'init'
    // but the parameters they need to follow one of these two rules either they
    // have different types or they have different quantity of
    // parameters, in this case 'init' we have one with three and other with four
    public void init(String name, String type, String status, int episodes) {
        this.init(name, type, episodes);
        this.status = status;
    }

    public void print() {
        System.out.println("This Anime name is: " + this.name);
        System.out.println("This Anime type is: " + this.type);
        System.out.println("This Anime episode is: " + this.episodes);
        System.out.println("The Anime status is: " + this.status);
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
}
