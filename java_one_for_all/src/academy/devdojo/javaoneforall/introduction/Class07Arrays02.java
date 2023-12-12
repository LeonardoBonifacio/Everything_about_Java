package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        /*
        float[] ages =  new float[3];// initialization value for the int, byte, short, double, float, long array type is 0
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        char[] things = new char[3]; // initialization value for the char type array is the code '\u0000' which means -> ''
        System.out.println(things[0]);
        System.out.println(things[1]);
        System.out.println(things[2]);

        boolean[] isArray = new boolean[3]; // initialization value for the boolean type array is false
        System.out.println(isArray[0]);
        System.out.println(isArray[1]);
        System.out.println(isArray[2]);

        // all the object which we initialize are fill with the 'null' by default
        String[] referenceArray = new String[3]; // initialization value for the all the reference type(String, Integer,etc) array is null
        System.out.println(referenceArray[0]);
        System.out.println(referenceArray[1]);
        System.out.println(referenceArray[2]);
        */

        String[] names = new String[10];// names is reference variable(in this case array), and there are some methods within those
                                      // reference variables(and in much more type of Things, like class or types)
        // you cannot change the size of the an array once it is created, you have to created a new array
        // like this ( names = new String[10]; ) this is overwrite the array which already exist
        // now the reference names is going to point to this new space in memory
        // and the older space is clean up by the garbage collector of the java
        // once that your variable lost the reference point , it's lost forever and there's no way to recover it
        names[0] = "Goku";
        names[1] = "Hinata";
        names[2] = "Luffy";

        for (int i = 0; i < names.length; i++) {// all the arrays have a variable which return the size of the array, known by length
            System.out.println(names[i]);
        }
    }
}
