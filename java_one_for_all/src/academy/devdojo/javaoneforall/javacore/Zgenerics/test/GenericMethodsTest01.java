package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import java.util.List;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;

public class GenericMethodsTest01 {
    public static void main(String[] args) {
        // new SeveralTypes<Car,Boat,Dog>(new Car(null), new Boat(null), new Dog());
        List<Boat> listOfBoat = createArrayWithOneObject(new Boat("Big boat"));
    }

    // this is the syntax for methods generics, the diamond<> with the 'type' is put
    // before the return of the method
    // and this method accept whatever type of Object(that must extends Comparable
    // or be Comparable itself, and this comparable can be of the type of T or of
    // your superClass, remember ? super T),for put in
    // the Generic Type of the list Created
    private static <T extends Comparable<? super T>> List<T> createArrayWithOneObject(T t) {
        return List.of(t);
    }
}

// class SeveralTypes<T,X,A>{
// private T t;
// private X x;
// private A a;

// public SeveralTypes(T t, X x, A a){
// this.t = t;
// this.x = x;
// this.a = a;
// }
// }
