package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1BACN2", "Pixel");
        Smartphone s2 = new Smartphone("121212", "Iphone");
        Smartphone s3 = new Smartphone("212121", "Samsungo");
        Smartphone s4 = new Smartphone("212121", "");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);// the method add also accept one index where this element will going to be
                            // placed

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        // this returns true based on my overriding method equals, that returns true if
        // the seriamNumber of two objects of the same class
        // are equals
        // so what's happening behind the scenes is:
        // this methods contains is calling the method equals() for each smartphone in
        // smartphones passing s4 as argument
        if (smartphones.contains(s4)) {
            System.out.println(
                    smartphones.get(smartphones.indexOf(s4)) + "  Index of this is : " + smartphones.indexOf(s4));
            // return -1 if the object not exist in this List

        }
    }
}
