package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

class Animal {
    public void walk() {
        System.out.println("Animal Walking");
    }
}

class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("Dog Walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        // You should'll use anonymous class when you only have the use for that class
        // at once specific point in your code
        // when you are working with regular class( by regular i mean no interface),
        // this is the way to create anonymous class
        Animal animal = new Animal() {// this object Created come from this subclass(that is anonymous class) of
                                      // Animal
            // this now is my anonymous class, which has no name and its a subClass of
            // Animal
            @Override
            public void walk() {
                System.out.println("Something in Walking");
            }
            // inside anonymous class you cannot create another methods that not exist in
            // your superClass(in this case Animal)
            // and you don't can create one object from this anonymous class as well,
            // because you don't know what kint of object this will be

        };
        animal.walk();
    }
}
