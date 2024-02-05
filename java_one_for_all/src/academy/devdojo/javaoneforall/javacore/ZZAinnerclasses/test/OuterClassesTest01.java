package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    // Inner Class is just a Class inside another class
    // They'are use for grouping kinda of behaviors(methods and more) that are related with the OuterClass
    // inside one Inner Class you have acces for all the attributes of the Outer Class, even though they are private
    class Inner {// you can have here any access modifier
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);// reference for this Inner Class object
            // academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test.OuterClassesTest01$Inner@2f92e0f4
            System.out.println(OuterClassesTest01.this);// reference for this OuterClassesTest01 object
            // academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test.OuterClassesTest01@28a418fc
        }
    }

    public static void main(String[] args) {
        //For creating one object of the Inner class you must first Create on object of the Outer CLass
        // This under is the ugly sintax of creating object from one inner Class
        OuterClassesTest01 outer = new OuterClassesTest01();
        OuterClassesTest01.Inner inner = outer.new Inner();// create one object of my inner Class
        inner = new OuterClassesTest01().new Inner();// anothey way to create this object
        inner.printOuterClassAttribute();
    }
}
