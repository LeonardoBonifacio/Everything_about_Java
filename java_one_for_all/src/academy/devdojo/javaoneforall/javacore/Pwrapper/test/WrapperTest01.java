package academy.devdojo.javaoneforall.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // Wrappers they are classes which will make the primitive types into objects
        // all this above now are reference types(which holds primitive types)
        // this is useful when you are passing arguments to your methods and you want to
        // pass by reference and not by value
        // and this Wrapper class are usefull when we work with collections(like
        // List<Integer>)
        // but there are downsides as well, because the amount of data that you need to
        // storage one primitive type is much fewer than storage one Object(reference
        // type)
        // the rules of polymorphism are apply here, because you not allowed to storage
        // one type fewer than other (like short in int, as you can storage in simply
        // primitive types), because one type is one type and another type is another
        // type

        // auto boxing is when java will convert the primitive type into the wrapper
        // basically changing primitive to object
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        // unboxing is when java will convert the wrapper into a primitive type
        int i = intW;
        // as we are work with Objects(wrappers), all this object have methods to change
        // to whatever type(in most of the cases) that you want

        // all the Wrapper class are Statics
        boolean booleanValue = Boolean.parseBoolean("true");// this method is uncasesensitivy
        System.out.println(booleanValue);
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDefined('9'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isUpperCase('9'));
        System.out.println(Character.toUpperCase('9'));
        System.out.println(Character.isLowerCase('9'));
        System.out.println(Character.toLowerCase('9'));


    }
}
