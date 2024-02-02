package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        List<Animal> animals = new ArrayList<>(2);
        List<Object> objects = new ArrayList<>();

        printConsult(dogs);
        printConsult(cats);
        printConsult(animals);
        printConsulDog(animals);
        printConsulDog(objects);
    }

    // here was telling for this method that i accept list of Animal, one the
    // especifc Type of Animal and below in your inheritance Tree(in this Case only Cat or Dog or Animal)
    // Animal to below, only class which has Animal as superClass or Class Animal itself
    // the wildCard was created to solve exactly this problem, where you want to
    // pass another type
    // that you as developer know for sure that you are doing the right thing
    // like passing one list of the Dogs or Cats which are Animal(by the
    // polimorphism)
    private static void printConsult(List<? extends Animal> animals) {
        // this in the parenthesis of the method is the sintex for the wildCard
        // that is a type of contract that you make with java about accept any Object or
        // Type of things(in this Case type list) which extends one SuperClass(in this
        // case Animal)
        // when i put one wildCard i cannot add things in this list anymore, because
        // java will not know if what i put in that list is going to be one object that
        // extend the SuperClass that i put in the WildCard(Dog, Cat or Animal)
        // so this line is not allowed animals.add(new Dog());
        
        System.out.println("-----------");

        for (Animal animal : animals) {
            animal.consult();
        }
    }

    // here i'm telling for the method that i accept one list of Dog or Objects or Animal(the superClass of Dog)
    // because this way i'm allowed not only read this list but also write in this
    // list(with Objects super of Dog)
    // private static void printConsulDog(List<? super Dog> animals) {
    //     System.out.println("-----------");

    //     // but because i don't know for sure what kinda of list this is (could be Simply Object or Animal)
    //     // i need to do this verification above for avoiding erros
    //     // putting object for itterating this list because Objects is in the top of the
    //     // inheritance three
    //     for (Object object : animals) {
    //         if (object instanceof Dog) {
    //             Dog dog = (Dog) object;
    //             dog.consult();
    //         }
    //     }

        // inside this method i know for sure that the only Objects that i'm be allowed
        // to add in this list(animals)
        // are object Dog or subclass of Dog(because the Keyword Super)

    // here i'm telling for the method that i accept one Animal or Object(that is the superClass of Animal)
    // nothing above animal(like Cat or Dog)
    private static void printConsulDog(List<? super Animal> animals) {
        System.out.println("-----------");
        // i only can add here because i'm receiving one list of Animal(or Object)
        // remember the difference between extends and super
        Animal cat = new Cat();
        Animal dog = new Dog();
        animals.add(cat);
        animals.add(dog);
        for (Object object : animals) {
            if (object instanceof Dog) {
                Dog d = (Dog) object;
                d.consult();
            }
        }
    }
}
