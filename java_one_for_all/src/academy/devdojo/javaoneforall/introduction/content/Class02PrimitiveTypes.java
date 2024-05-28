package academy.devdojo.javaoneforall.introduction.content;

public class Class02PrimitiveTypes {
    // I can type 'psvm' so that i don't have that type the method main again and
    // again
    public static void main(String[] args) {
        /*
         * // Primitive Types
         * // int, double, float, boolean, char, byte, short, long
         * // First letter lowercase and capitalize every firts letter of each word in
         * the name of variables normals
         * // But in variables that never change(known by CONSTANTS) the follow sintax
         * is required
         * // final double VALUE_OF_PI = 3.14;
         * // if we try to change the value storaged in a Constant, the compilator
         * returns a error, because it's a CONSTANT which means
         * // that it never might be change like a variable normal
         * // In Name of Class every first letter of word is capitalize
         * // float salaryFloat = 2500.0F;
         * // To force java a understand which a number is float, put an 'F' in the end
         * of the number
         * // Because numbers with points are understandable by java how double and not
         * float
         * double salaryDouble = 500.0D;
         * // if you want you can put a D in the end of the double number either, but it
         * doesn't even matter
         * boolean trueValue = true; // 1
         * boolean falseValue = false; // 0
         * int age = 10;
         * long bigNumber = 1000000000;
         * short ageShort = 31999;
         * byte ageByte = -128; // this type (byte) accept values between -128 and
         * 128(cut down 128 for this)
         * String name = "Leonardo"; // In String we use double quotes, in char we use
         * single quotes
         * // String is not a primitive type (it is a reference type and a Class) but it
         * is also so important
         * // After Java 8 we can use this feature above to let the compiler found out
         * what the type of variable
         * var lastName = "Bonifácio";
         * // we should be carefull about this features and your versions of release,
         * because some job requires projects that we'll written
         * // in java 8 for example, that not have some features(like var) and this is a
         * big problem to keep in mind
         * char character1 = 87;
         * char character2 = 'L';
         * char character3 = '\u0041';
         * // this type(char) is special, because accept a number or one letter in
         * single quote,
         * // the number which we put represents a character in table ASCII (here
         * http://www.cs.emory.edu/~cheung/Courses/170/Syllabus/05/char1.html)
         * // for example 87 is equal a 'W' in table unicode table, where the value
         * ever start with \U('u' in lowercase) after that put the number
         * // in the table unicode (here
         * https://codestall.wordpress.com/2017/08/23/unicode-system-in-java/).
         * // Interager values (int, long, short, char)
         * // Decimal values (double and float)
         * // Each type of the variable have own limits of storage, there are a table
         * that explain this is
         * // in internet(here http://www.itwhistle.com/data-types-in-java/)
         * // In nutshel all the primitive types storage(sometimes hidden) numbers and
         * what's the matter is the size of the values which each primitive
         * // type storage(bytes), use the right type so that you can storage an correct
         * quantity of the whatever you system put in your variables
         * // Every time we crate a variable with determinate primitive type we are kind
         * put a limit of values which can be storage in these variable
         * // byte = 1 byte
         * // short = 2 bytes
         * // int = 4 bytes
         * // long = 8 bytes
         * // float = 4 bytes
         * // double = 8 bytes
         * // boolean = 1 bit
         * // char = 2 bytes
         * // That meams that there is a limit of numbers that you can put inside and if
         * you try to put more numbers then it's allowed you will get a compilation
         * error
         * // Every time that we can type a int number inside a variable, it will be by
         * default a int, except the number type byte
         * // Every time that we can type a float number inside a variable, it will be
         * by default a double
         * // Casting forces the computer storage values greater the type of variable,
         * it's kind say to the computer
         * "hey i know i'm doing i trust the behavior to become a integer"
         * // byte -> short -> char -> int -> long -> float -> double (From left to
         * right: Lower data type to Higher data type)
         * // double -> float -> long -> int -> char -> short -> byte (From left to
         * right: Higher data type to Lower data type)
         * int castNumberIntLong = (int) 10000000000L;
         * // When you casting you forcing the compiler to do something that it probably
         * will cause you problems, for example don't output the same value that you put
         * in your variable, because you are using way more space and way more bits that
         * the type of the variable suport
         * System.out.print(castNumberIntLong);
         * float castNumberFloatDouble = (float) 2500.0D;
         * // In cases in that values fit in the space of the variable, it's works
         * properly
         * // Only forces casting when you are sure about that, because things are not
         * exactly the way you expect and you will get weird behaviors
         * long castNumberDoubleLong = (long) 133.33; //the compiler go ignored the
         * number after the dot, because i'm forcing he became a long number
         * System.out.print(castNumberDoubleLong);
         * System.out.print(castNumberFloatDouble);
         * System.out.println("The age is " + age + " years old");//Concatenation
         * between String and variable
         * System.out.print(character1);
         * System.out.print(character2);
         * System.out.print(character3);
         * System.out.println("Hi i'm " + name + " " + lastName); // Shortcut for
         * System.out.println is 'sout'
         */

    }
}
