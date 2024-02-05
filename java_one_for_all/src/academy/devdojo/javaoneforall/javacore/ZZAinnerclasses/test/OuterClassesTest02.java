package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest02 {
    private String name = "Midorya";

    // {
    //     class LocalClass {
    //         public void printName() {
    //             System.out.println(name + " " + lastName + param);
    //         }
    //     }
    // }
    // Local Class are classes Created inside one Method or init block or static init block
    void print(final String param) {
        // if you have local attribute or one parameter (that is going to don't exist anymore after the
        // call of the methods die) inside one method that will is going to be used
        // inside one Local Class, follow this rules under...
        // if you don't change this attribute later after you are creating its
        // effectively final, but if you try to change for some reason its not
        // effectively final anymore
        // if you use global attributes from the OuterClass for example you don't have to worry about it
        final String lastName = "Ikuzu";
        // for make sure for you that this attribute is final put the keyword final, even though this is redundant
        class LocalClass {
            public void printName() {
                System.out.println(name + " " + lastName + param);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printName();
        // or
        new LocalClass().printName();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print(" daijobu");
    }
}
