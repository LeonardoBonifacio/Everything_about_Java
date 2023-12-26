package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain;

public class Buyer {
    private String name;

    @Override
    public String toString() {
        return "The name of this Buyer is: " + this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
