package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting dogs");
    }
}

class Cat extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting cats");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = { new Dog(), new Dog() };
        Cat[] cats = { new Cat(), new Cat() };
        printConsult(dogs);
        printConsult(cats);
    }

    private static void printConsult(Animal[] animals) {
        System.out.println("-----------");
        for (Animal animal : animals) {
            animal.consult();
        }

        // i cannot do this
        animals[1] = new Cat();
        // or this
        animals[0] = new Dog();

        // because both dogs and cats are animals
        // but One dog only can be storaged in on reference Variable of the most
        // specified type of dogs
        // and the same thing for cats, all this because the rules of polimorphism
    }
}
