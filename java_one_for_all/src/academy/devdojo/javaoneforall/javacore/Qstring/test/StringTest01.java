package academy.devdojo.javaoneforall.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name1 = "Leo";
        String name2 = "Leo";
        // Strings are imutable the statement above is creating two new string
        // references in memory( Bonifácio, and Leo Bonifácio)
        // but the statemente above is not changing the string name1 itself
        name1.concat(" Bonifácio");
        // if i want to change the string reference that my variable is hold i must do
        // something like that above
        name1 = name1.concat(" Bonifácio");

        // for checking if two string have the same values use
        System.out.println(name1.equals(name2));

        // for checking if two or more have the same string reference in memory
        System.out.println(name1 == name2);

        // this reference variable string is point to object reference, and not to the
        // value Leo(which i already have in my pool constant Strings)
        String name3 = new String("Leo");
        System.out.println(name3 == name2);// this returns false
        System.out.println(name3.intern() == name2);// this return true, because the method intern() returns the
                                                    // internal string that this object(name3) is having a reference to
                                                    // the comparison
    }
}
