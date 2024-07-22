package academy.devdojo.javaoneforall.javacore.Ioverriding.domain;

public class Anime {
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    // for make sure that you are  actually  overrading a method, put this keyword above before
    // the whole body of the method
    @Override
    public String toString() {
        return "Name: " + this.name;
    }

    // since we have available methods for us coming from Class object we can
    // override then and  this behavior will now
    // belong to the Anime class(or the class that you are working)
    // one of the rules for overrading is: you have to have exactly the same name
    // you cannot have diferent names and
    // exaclty the same parameters
    // other rule is you cannot make the methods which you are overriding more
    // restrictive in fact , only less restrictive
    // try to have the same assignature when you overriding your methods to make
    // sure
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
