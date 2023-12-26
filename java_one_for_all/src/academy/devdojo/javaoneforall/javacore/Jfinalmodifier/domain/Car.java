package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain;

// when you add a final modifier in a class declaration(public final class Car) 
// you tell to the other class which
// anyone can inheritance this class, anyone could change this class
// it means the all the car methods will not to be able to be extended
public class Car {
    private String name;
    public static final double SPEED_LIMIT;
    // all this rules and annotations for primitive types
    // final keyword make whatever variable turned out one CONSTANT
    // Constant must be initialized/ can be like this way above or
    // in initialization blocks or static initialization blocks
    // Constant conventions of name is all letter uppercase and separeted by _
    // Constant in the most cases are declared as static, because it's never change
    // and
    // he's going to belongs for the whole class
    // since no one could change the value, we can make this constant public
    public final Buyer BUYER = new Buyer();
    // this BUYER constant reference variable has a reference to class Buyer, and
    // since it's initialized as final
    // we cannot change this reference anymore, but we can change whatever else
    // inside this object of class Buyer

    static {
        SPEED_LIMIT = 249 + 1;
        // if we have one init block or one static init block we cannot initialized the
        // constant
        // variables in our constructor , because the blocks loads everthing before the
        // constructor
    }

    // constants usually will come with static and final keywords and you have to
    // initialize before you use them(be carefull with the order of the
    // initialization of the variables, constructor, init blocks and static init
    // blocks)
    // the conventions for the name is all the words uppercase and separated by _

    // this method(print) can never be overriden(which means that this print ever
    // will be like this, and anyone can change the print behavior in any of the
    // subclass)
    // this class could be extended(because he's not final) but the functionalities
    // of the print method should remain the same as the  super class
    public final void print() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    // class String for example has final modifier, because already exists 52
    // billion jvms running all over the world , and imagine if you could not get or
    // expect the behavior of the string class(since he are one of the most
    // important class in java and they should never changed, the way that strings
    // they behave in the jvm should never changed)
    // if you are abble to extend the string class you could change any of the
    // methods that we have available
    // that's why the String class has final modifier(meaning that you can never
    // extend and never change the behavior)
}
