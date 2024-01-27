package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        // String name = "Leonardo Bonifácio";
        // String name2 = new String("Leonardo Bonifácio");
        // System.out.println(name == name2);
        // System.out.println(name.equals(name2));

        Smartphone s1 = new Smartphone("1BACN2", "Pixel");
        Smartphone s2 = new Smartphone("1BACN2", "Pixel");
        System.out.println(s1.equals(s2));// returns true
        // // the equals default behavior of every class(without override this methos with other class that inheritance the Object Class)
        // // is comparing the references of where those objects are located

        // // this way the reference of this objects are the same and the method equals return true
        Smartphone s3 =  new Smartphone("AJAVA12", "Samsumgo");
        Smartphone s4 =  s3;
        System.out.println(s3.equals(s4));

        // teaching java how to indentify if two objects are the same
        // this equal here is override by the class Smartphone for act in another behavior
        System.out.println(s1.equals(s2));
    }
}
